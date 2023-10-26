<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
	
<!DOCTYPE html>

<script type="text/javascript"
	src="/SpringHome/resources/js/jquery-3.7.1.js"></script>

<style type="text/css">
	nav>ul {
		list-style-type: none;
		padding: 0;
		overflow: hidden;
		background-color: #333333;
		/*     width: 1000px; */ /* 넓이를 주면 고정  */
		display: table; /* table을 주면  요소의 내용에 맞게 자동으로 크기 */
		margin-left: auto;
		margin-right: auto;
	}
	
	nav>ul>li {
		float: left;
	}
	
	nav>ul>li>a {
		display: block;
		color: white;
		text-align: center;
		padding: 16px;
		text-decoration: none;
	}
	
	nav>ul>li>a:hover {
		color: #FFD9EC;
		background-color: #5D5D5D;
		font-weight: bold;
	}
</style>

<script type="text/javascript">

//	제이쿼리

function goPage(pageNumber) {
	
var curPageObj = $("#curPage");

curPageObj.val(pageNumber);

var pagingFormObj = $('#pagingForm');

pagingFormObj.submit();

// 	자바스크립트
	
// 		var curPageObj= document.getElementById('curPage');
// 		curPageObj.value = pageNumber;
// 		var pagingFormObj = document.getElementById('pagingForm');
// 		pagingFormObj.submit();

}

</script>	

	<nav class='jqueryTest'>
		<ul>		
			<c:if test="${pagingMap.memberPaging.prevBlock ne 1}">
			<li>
				<a href="#" onclick="goPage(${pagingMap.memberPaging.prevBlock});">
					<span>≪</span>
				</a>
			</li>
			</c:if>

			<c:forEach var="num" begin="${pagingMap.memberPaging.prevBlock}"
				end="${pagingMap.memberPaging.blockEnd}" >
				<li>
					<a href="#" onclick="goPage(${num})">${num}</a>
				</li>
			</c:forEach>
			
			<c:if
				test="${pagingMap.memberPaging.curBlock < pagingMap.memberPaging.totBlock}">
			<li>
				<a href="#" onclick="goPage(${pagingMap.memberPaging.nextBlock});">
					<span>≫</span>
				</a>
			</li>
			</c:if>
		</ul>
	</nav>