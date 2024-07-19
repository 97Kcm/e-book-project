// 충전 버튼을 누르면 카카오페이 결제 api가 뜹니다.
const chargeBtn = document.querySelector('button.charge-button');

// 우선 그러기 위해 amount의 value를 가져와야합니다.
const amountChoose = document.querySelectorAll('input[name="amount"]');


IMP.init("imp24800281");
// 결제 버튼 클릭 이벤트 리스너
chargeBtn.onclick = () => {
    let selectedAmount;
    // 사용자가 선택한 결제 금액 가져오기
    amountChoose.forEach(unit => {
        if (unit.checked) {
            selectedAmount = unit.value;
        }
    });

    // 선택하지 않고 결제 버튼을 누를시 경고 메시지 출력
    if (!selectedAmount) {
        alert("충전할 금액을 선택해주세요.");
        return;
    }

    // 아임포트 결제 요청 데이터
    let paymentData = {
        pg: "kakaopay.TC0ONETIME",
        pay_method: "card",
        merchant_uid: `order_no_${new Date().getTime()}`,
        name: "캐쉬충전",
        amount: selectedAmount,
        buyer_email: "test@portone.io",
        buyer_name: "구매자이름",
        buyer_tel: "010-1234-5678",
        buyer_addr: "서울특별시 강남구 삼성동",
        buyer_postcode: "123-456",
    };

    // 아임포트 결제 요청
    IMP.request_pay(paymentData, function (response) {
        if (response.success) {
            const token = document.querySelector("meta[name=_csrf]").getAttribute("content");
            // 결제 성공 시 서버에 결제 금액 전송
            fetch('/user/updateCash', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                    "X-CSRF-TOKEN": token
                },
                body: JSON.stringify({ amount: selectedAmount })
            })
                .then(response => response.json())
                .then(data => {
                    // 결제 성공 시 이전 페이지로 리다이렉트
                    if (data.success) {
                        alert("결제가 성공하였습니다! 이전 페이지로 이동합니다.");
                        history.back();
                    } else {
                        alert("DB 오류! (금액 저장 x)");
                    }
                })
                .catch(error => {
                    console.error('Error:', error);
                });
        } else {
            // 결제 실패 시 에러 처리
            alert("결제가 실패하였습니다!");
        }
    });
}
