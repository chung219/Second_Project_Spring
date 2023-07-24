
<ul class="pagination">

    <!-- href값을 페이지 번호로 대체하여 이를 자바스크립트에서 href값을 통해 form 태그 내 input hidden에 값을 대체하여 form으로 submit -->
    <c:if test="${pageMaker.prev}">
        <li class="paginate_button previous"><a href="${pageMaker.startPage-1}">이전</a>
        </li>
    </c:if>

    <c:forEach var="num" begin="${pageMaker.startPage}" end="${pageMaker.endPage}">
        <li class="paginate_button ${pageMaker.page.pageNum == num ? 'active' :''}">
            <a href="${num}">${num}</a>
        </li>
    </c:forEach>

    <c:if test="${pageMaker.next}">
        <li class="paginate_button next"><a href="${pageMaker.endPage+1}">다음</a>
        </li>
    </c:if>

</ul>

<form id='actionForm' action="/board/list" method='get'>
    <input type='hidden' name='pageNum' value='${pageMaker.page.pageNum}'>
    <input type='hidden' name='amount' value='${pageMaker.page.amount}'>
</form>