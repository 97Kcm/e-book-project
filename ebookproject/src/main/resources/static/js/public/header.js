const myPageSectionSection = document.getElementById('my-page-section-section')
const myPageBtn = document.getElementById('user');
const logoutBtn = document.getElementById('logout-btn');
// 검색 폼, 검색 섹션, 검색 버튼 선택
const searchForm = document.querySelector('.search-form');
const searchSection = document.querySelector('.search-section');
const searchInput = document.querySelector('.search-label input');
const searchButton = document.querySelector('#search');

// 실행하자마자 검색창과 내정보 스위치는 off
let myPageBtnOnOFF = false;
searchSection.style.display = 'none'; // display=none, 안 보이게 함

// // 검색 입력 클릭 시 검색 영역 활성화
// searchInput.addEventListener('click', () => {
//     searchSection.style.display = 'block';
// });
//
// // 검색 영역 제외 클릭 시 검색 영역 비활성화 (input, search-section 제외)
// document.addEventListener('click', (event) => {
//     if (!searchForm.contains(event.target) && event.target !== searchInputValue && event.target !== searchButton) {
//         searchSection.style.display = 'none';
//     }
// });

/////////////////////////////////////////////////////////////////
// 검색 input 필드 선택
const searchInputValue = document.getElementById('search-text');
// 검색 결과 리스트 선택
const searchResultList = document.querySelector('.search-view');

// 검색 input 필드에 입력 이벤트 리스너 등록
// searchInputValue.addEventListener('input', function() {
//     const searchText = this.value.trim();
//
//     // 요청 보내기
//     fetch(`/searchbook?bookTitle=화산`)
//         .then(response => response.text())
//         .then(data => {
//             // 검색 결과 리스트 업데이트
//             searchResultList.innerHTML = '';
//             const bookTitles = te.parse(data).bookTitle;
//             console.log(bookTitles)
//             bookTitles.forEach(title => {
//                 const listItem = document.createElement('li');
//                 listItem.classList.add('search-view-list');
//                 const link = document.createElement('a');
//                 link.href = '#';
//                 link.textContent = title;
//                 link.addEventListener('click', function() {
//                     // 클릭 시 검색 input 필드에 책 제목 입력
//                     searchInputValue.value = title;
//                     // 검색 결과 리스트 숨기기
//                     searchResultList.style.display = 'none';
//                 });
//                 listItem.appendChild(link);
//                 searchResultList.appendChild(listItem);
//             });
//             // 검색 결과 리스트 보이기
//             searchResultList.style.display = 'block';
//         })
//         .catch(error => {
//             console.error('에러다용', error);
//         });
// });
//
// // 검색 input 필드 포커스 아웃 시 검색 결과 리스트 숨기기
// searchInputValue.addEventListener('blur', function() {
//     searchResultList.style.display = 'none';
// });

////////////////////////////////////////////////////////////////////


// 내 정보창 토글 함수
myPageBtn.addEventListener('click', showHideMyPage, false);

// 로그아웃
if(logoutBtn !== null) {
    logoutBtn.onclick = (e) => {
        e.preventDefault();
        const form = document.forms.item(0);
        form.action = "/user/logout";
        form.method = 'POST';
        form.submit();
    };
}


// 로그인 페이지 클릭시 토글
function showHideMyPage(e) {
    e.preventDefault();
    e.stopPropagation();
    if (this.classList.contains('show')) {
        myPageBtnOnOFF = true;
        this.classList.remove('show');
        myPageSectionSection.style.display = 'none';
        myPageBtnOnOFF = false;
    } else{
        myPageBtnOnOFF = false;
        this.classList.add('show');
        myPageSectionSection.style.display = 'block';
        myPageBtnOnOFF = true;
    }
    if (document.onclick){
        myPageBtnOnOFF = false;
        this.classList.add('show');
        myPageSectionSection.style.display = 'block';
        myPageBtnOnOFF = true;
    }
}

document.querySelector('main').onclick = (e) => {
    myPageBtnOnOFF = true;
    myPageBtn.classList.remove('show');
    myPageSectionSection.style.display = 'none';
    myPageBtnOnOFF = false;
}

// 캐시창 팝업 띄우기
function openCashChargePage() {
    const options = 'width=600, height=700, top=50, left=50, scrollbars=yes'
    window.open('/user/chargeCash','_blank',options);
    console.log("캐시충전페이지 열려라")
}