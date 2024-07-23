const myPageSectionSection = document.getElementById('my-page-section-section')
const myPageBtn = document.getElementById('user');
const logoutBtn = document.getElementById('logout-btn');

const SearchTextForm = document.querySelector('.search-label');
const searchInputValue = document.getElementById('search-text');


// 실행하자마자 스위치는 off
let myPageBtnOnOFF = false;

// 검색 폼, 검색 섹션, 검색 버튼 선택
const searchForm = document.querySelector('.search-form');
const searchSection = document.querySelector('.search-section');
const searchInput = document.querySelector('.search-label input');
const searchButton = document.querySelector('#search');

// 검색 입력 클릭 시 검색 영역 활성화
searchInput.addEventListener('click', () => {
    searchSection.style.display = 'block';
});

// 검색 영역 제외 클릭 시 검색 영역 비활성화 (input, search-section 제외)
document.addEventListener('click', (event) => {
    if (!searchForm.contains(event.target) && event.target !== searchInputValue && event.target !== searchButton) {
        searchSection.style.display = 'none';
    }
});


// 검색할 때 아무런 값도 집어넣지 않으면 에러 메세지 대신, 상태 그대로 값.
SearchTextForm.addEventListener('submit', function(e) {
    e.preventDefault(); // 폼 제출 기본 동작 막기

    // 필수 입력 필드 확인
    if (searchInputValue.value.trim() === '') {
        // 필수 입력 필드가 비어있는 경우
        // 아무런 변화도 일어나지 않도록 함
        console.log("입력 필드에 아무런 것 값도 집어넣지 않음. 에러 대신")
        return;
    }

    // 폼 제출 진행
    SearchTextForm.submit();
});


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