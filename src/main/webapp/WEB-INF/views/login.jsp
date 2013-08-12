<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<jsp:include page="./templates/header.jsp" />
<div id="wrap">
	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span12">
				<h1 class="title">Prediction of Product Rating Using Social
					Media Feeds</h1>
			</div>
		</div>
		<div class="row-fluid">
			<form class="form-signin"
				action="${baseUrl }/j_spring_security_check" method="POST">
				<h2 class="form-signin-heading">Please sign in</h2>
				<input class="input-block-level" type="text" name="j_username"
					placeholder="Email address">
				<input class="input-block-level" type="password" name="j_password"
					placeholder="Password">
				<button class="btn btn-large btn-primary" type="submit">Sign
					in</button>
				<a href="#" class="pull-right">Forgot Password?</a>
			</form>
		</div>
	</div>
</div>
<jsp:include page="./templates/footer.jsp" />