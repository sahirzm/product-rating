<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>

<jsp:include page="./templates/header.jsp" />
<div class="container-fluid ">
	<div class="row-fluid rowContainer">
		<div class="span2 menuContainer">
			<h1 class="logo">FMMS Inc.</h1>
			<jsp:include page="./templates/menu.jsp" />
		</div>
		<div class="span10 contentContainer">
			<div class="mainContent">
				<h1>
					Hello
					<sec:authentication property="principal.username" />
				</h1>
			</div>
			<footer>
		<p><%=new java.text.SimpleDateFormat("yyyy")
					.format(new java.util.Date())%>
					&copy; FMF Inc.
				</p>
		</footer>
		</div>
	</div>
</div>
</body>
</html>
