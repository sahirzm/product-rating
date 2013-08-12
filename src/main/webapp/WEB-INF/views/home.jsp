<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>

<jsp:include page="./templates/header.jsp" />
<div id="wrap">
	<div class="container-fluid">
		<div class="row-fluid rowContainer">
			<div class="span12 menuContainer">
				<h1 class="title">Predicting Product Rating using Social Media
					Feeds</h1>
				<jsp:include page="./templates/menu.jsp" />
			</div>
		</div>
		<div class="row-fluid">
			<div class="span12">
				<div class="mainContent">
					<h1>
						Hello
						<sec:authentication property="principal.username" />
					</h1>
				</div>
			</div>
		</div>
	</div>
</div>
<jsp:include page="./templates/footer.jsp" />