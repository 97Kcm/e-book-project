const mainSideSection = document.getElementById('main-side-section');
const curtPageInput = document.querySelector('.curt-page');
const totalPageSpan = document.querySelector('.total-page');
const pageBarChild = document.querySelector('.page-bar-child');
const viewPageBarSection = document.querySelector('.view-pagebar-section');


// 최초 화면 접속 시 실행
change_view_page_bar();
// 현재 페이지 번호를 수정할 시 실행
curtPageInput.onchange = () => {
    change_view_page_bar();
}

// 뷰 바 컨트롤 함수
function change_view_page_bar() {
    const curtPageNumber = +curtPageInput.value;
    const totalPageNumber = +totalPageSpan.textContent;
    if(curtPageNumber < 1){
        curtPageInput.value = 1;
        pageBarChild.style.left = `1%`;
    }
    else if(curtPageNumber > totalPageNumber){
        curtPageInput.value = totalPageNumber;
        pageBarChild.style.left = `100%`;
    }else {
        const pagePercent = (curtPageNumber / totalPageNumber * 100);
        pageBarChild.style.left = `${pagePercent}%`;
    }
}

mainSideSection.addEventListener('mousemove', (e) => {
    const percent = mainSideSection.clientHeight * 0.08;
    if(e.clientY > mainSideSection.clientHeight - percent){
        viewPageBarSection.toggleAttribute('active' , true);
    }else{
        viewPageBarSection.toggleAttribute('active' , false);
    }
})

// 내 정보창 토글 함수
function showHideMyPageBarSection() {
    if (this.classList.contains('show')) {
        this.classList.remove('show');
    } else {
        this.classList.add('show');
    }
}


// 마우스 이벤트 리스너
/******************************************************/

// viewPageBarSection.addEventListener('mouseenter', showHideMyPageBarSection);
// viewPageBarSection.addEventListener('mouseleave', showHideMyPageBarSection);
