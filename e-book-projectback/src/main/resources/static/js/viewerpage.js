const curtPageInput = document.querySelector('.curt-page');
const totalPageSpan = document.querySelector('.total-page');
const pageBarChild = document.querySelector('.page-bar-child');

// 최초 화면 접속 시 실행
change_view_page_bar();
// 현재 페이지 번호를 수정할 시 실행
curtPageInput.onchange = () => {
    change_view_page_bar();
}

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