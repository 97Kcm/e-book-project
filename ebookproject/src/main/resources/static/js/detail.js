// 구매 버튼 클릭
const purchaseBtns = document.querySelectorAll('.purchase');

purchaseBtns.forEach(button => {
    button.addEventListener('click', function() {
        var price = 200; // 임시 금액

        // CSRF 토큰 가져오기
        const token = document.querySelector("meta[name=_csrf]").getAttribute("content");

        // // URL에 필요한 쿼리 파라미터 추가
        // const url = new URL('/user/getUserCash', window.location.origin);
        // // 필요한 경우 쿼리 파라미터 추가 가능
        // // url.searchParams.append('paramName', paramValue);
        //
        // // GET 요청 보내기
        fetch('/user/getUserCash', {
            method: 'GET',
            headers: {
                'Content-Type': 'application/json',
                "X-CSRF-TOKEN": token // 일반적으로 GET 요청에선 필요하지 않음
            }
        })
            .then(response => {
                if (!response.ok) {
                    throw new Error(`구매에 실패하였습니다: ${response.status}`);
                }
                return response.json();
            })
            .then(data => {
                if (data.error) {
                    alert('로그인이 필요합니다.');
                    window.location.href = '/user/login';
                    return;
                }

                var userCash = data.userCash;
                // 불러온 userCash가 가격보다 적으면, 캐시충전 페이지로 이동
                if (userCash < price) {
                    alert("금액이 부족합니다. 충전 페이지로 이동합니다.");
                    window.location.href = '/cashcharge';
                } else {
                    window.location.href = '/purchase';
                }
            })
            .catch(e => {
                console.log('응답 오류!: ' + e.message);
            });
    });
});

/********************************************************/
const latestSortBtn = document.getElementById('latest-sort');
const firstSortBtn = document.getElementById('first-sort');
const chapterContainer = document.querySelectorAll('.part-chapter-container');

