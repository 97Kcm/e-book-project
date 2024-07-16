// 충전 버튼을 누르면 카카오페이 결제 api가 뜹니다.
const chargeBtn = document.querySelector('button.charge-button');

// 우선 그러기 위해 amount의 value를 가져와야합니다.
const amountChoose = document.querySelectorAll('input[name="amount"]');


IMP.init("imp24800281");
chargeBtn.onclick = () => {
    let selectedAmount;

    amountChoose.forEach(unit => {
        if (unit.checked) {
            selectedAmount = unit.value;
        }
    });

    if (!selectedAmount) {
        alert("충전할 금액을 선택해주세요.");
        return;
    }

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
            // 결제 성공 시 "/cashcharge" 경로로 이동
            window.location.href = "/cashcharge";
        } else {
            // 결제 실패 시 에러 처리
            alert("결제가 실패하였습니다!");
        }
    });
}
