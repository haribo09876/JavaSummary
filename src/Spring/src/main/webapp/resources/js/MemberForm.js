/**
 * 
 */

		function pageMovingListFnc() {
			location.href = "./list.do";
		}

		function pageMoveDeleteFnc(no) {
			
			var url = './delete.do?no=' + no;

			location.href = url;
		}