const searchLabel = document.querySelector('.search-label');
const searchSection = document.querySelector('.search-section');
const myPageSection = document.getElementById('my-page-section')
const myPageSectionSection = document.getElementById('my-page-section-section')
const cashChargeButton = document.getElementById('cash-charge');
// 검색창 토글 함수
function showHideSearchSection() {
    if (this.classList.contains('show')) {
        this.classList.remove('show');
        searchSection.style.display = 'none';
    } else {
        this.classList.add('show');
        searchSection.style.display = 'block';
    }
}

// 내 정보창 토글 함수
function showHideMyPage() {
    if (this.classList.contains('show')) {
        this.classList.remove('show');
        myPageSectionSection.style.display = 'none';
    } else {
        this.classList.add('show');
        myPageSectionSection.style.display = 'block';
    }
}
// 캐시창 팝업 띄우기
function openCashChargePage() {
    const options = 'width=600, height=700, top=50, left=50, scrollbars=yes'
    window.open('cashcharge','_blank',options);
    console.log("캐시충전페이지 열려라")
}



// 마우스 이벤트 리스너
searchLabel.addEventListener('mouseenter', showHideSearchSection);
searchLabel.addEventListener('mouseleave', showHideSearchSection);
myPageSection.addEventListener('mouseenter', showHideMyPage);
myPageSection.addEventListener('mouseleave', showHideMyPage);

