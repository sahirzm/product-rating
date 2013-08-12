<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<div id="footer">
	<div class="container-fluid">
		<p class="muted credit">
			<%=new java.text.SimpleDateFormat("yyyy")
					.format(new java.util.Date())%>
			| VIT University.
		</p>
	</div>
</div>
<script type="text/javascript"
	src="${baseUrl}/resources/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${baseUrl}/resources/js/holder.js"></script>
<script type="text/javascript"
	src="${baseUrl}/resources/js/jquery-ui-1.10.3.custom.min.js"></script>
<script type="text/javascript"
	src="${baseUrl}/resources/datatable/media/js/jquery.dataTables.min.js"></script>
<script type="text/javascript"
	src="${baseUrl}/resources/datatable/extras/jquery.dataTables.columnFilter.js"></script>
<script type="text/javascript"
	src="${baseUrl}/resources/datatable/extras/paging.js"></script>
<script type="text/javascript" src="${baseUrl}/resources/js/ksform.js"></script>
</body>
</html>