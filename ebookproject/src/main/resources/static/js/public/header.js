const searchLabel = document.querySelector('.search-label');
const searchSection = document.querySelector('.search-section');
const myPageSection = document.getElementById('my-page-section')
const myPageSectionSection = document.getElementById('my-page-section-section')
const myPageBtn = document.getElementById('user');


// 실행하자마자 스위치는 off
let myPageBtnOnOFF = false;

// 검색창 토글 함수
searchLabel.addEventListener('mouseover', showHideSearchSection);
searchLabel.addEventListener('mouseleave', showHideSearchSection);
function showHideSearchSection() {
    if (this.classList.contains('show')) {
        this.classList.remove('show');
        searchSection.style.display = 'none';
    } else {
        this.classList.add('show');
        searchSection.style.display = 'block';
    }
}
// 마우스 이벤트 리스너



// 내 정보창 토글 함수
myPageBtn.addEventListener('click', showHideMyPage, false);


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
    window.open('cashcharge','_blank',options);
    console.log("캐시충전페이지 열려라")
}


