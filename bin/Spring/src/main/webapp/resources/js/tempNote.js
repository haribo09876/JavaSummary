/**
 * 
 */

		var curPageObj=$("#curPage");
		
		curPageObj.val(pageNumber);
		
		alert(curPageObj.val());
		
		var pagingFromObj = $('#pagingForm');
		pagingFormObj.submit();
	
	
		var numclassObj = document.getElementsByClassName('numClass')[0];
		numclassObj.setAttribute("style", "background-color:red");

