const searchLabel = document.querySelector('.search-label');
const searchSection = document.querySelector('.search-section');
const myPageSection = document.getElementById('my-page-section')
const myPageSectionSection = document.getElementById('my-page-section-section')

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


// 마우스 이벤트 리스너 등록
searchLabel.addEventListener('mouseenter', showHideSearchSection);
searchLabel.addEventListener('mouseleave', showHideSearchSection);
myPageSection.addEventListener('mouseenter', showHideMyPage);
myPageSection.addEventListener('mouseleave', showHideMyPage);
