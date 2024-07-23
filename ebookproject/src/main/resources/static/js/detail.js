document.addEventListener('DOMContentLoaded', () => {
    const token = document.querySelector("meta[name=_csrf]").getAttribute('content');

    // 구매 버튼 클릭 시 호출될 함수
    function buy_chapter(chapterNo) {
        console.log("버튼 잘 되는지 확인용: ");

        fetch(`/user/chapter/${chapterNo}`, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
                'X-CSRF-TOKEN': token
            }
        })
            .then(response => {
                console.log('Response status:', response.status); // 응답 상태 코드 출력
                return response.text().then(text => {
                    if (response.status === 201) {
                        return text;
                    // 성공 응답을 반환
                    } else {
                        throw new Error(text); // 실패 응답을 오류로 처리
                    }
                    console.log(text);
                });
            })
            .then(data => {
                console.log(data); // 성공 메시지 출력

                const chapterElement = document.querySelector(`.part[data-chapter-no="${chapterNo}"]`);
                if (chapterElement) {
                    const viewBtn = chapterElement.querySelector(".view-btn");
                    const buyBtn = chapterElement.querySelector(".buy-btn");
                    const cartBtn = chapterElement.querySelector(".cart-btn");

                    // 버튼 상태 변경
                    viewBtn.style.display = "block";
                    buyBtn.style.display = "none";
                    cartBtn.style.display = "none";
                }
            })
            .catch(error => {
                console.error('오류 발생:', error.message);
                alert(error.message); // 오류 메시지 출력
                // 실패 시 캐시 충전 페이지로 리다이렉션
                if (error.message.includes("캐시가 부족")) {
                    window.location.href = "/user/cashcharge";
                }
            });
    }

    // 각 구매 버튼에 클릭 이벤트 리스너 추가
    document.querySelectorAll('.buy-btn').forEach(button => {
        button.addEventListener('click', () => {
            const chapterNo = button.getAttribute('onclick').match(/\d+/)[0];
            buy_chapter(chapterNo);
        });
    });
});