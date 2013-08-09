<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<jsp:include page="./templates/header.jsp" />
<div class="container">
	<div class="pure-g-r">
		<div class="pure-u-1">
			<h1 class="title">Prediction of Product Rating Using Social Media Feeds</h1>
		</div>
	</div>
	<div class="pure-g-r">
		<div class="pure-u-1-5 pure-offset-2-5 loginFormContainer">
			<div class="well well-lg">
				<form action="<c:url value='j_spring_security_check' />"
					method='POST' class="pure-form pure-form-stacked">
					<fieldset>
						<legend>Please sign in</legend>
						<label for="j_username">Username</label>
						<input type="text" id="j_username" name="j_username"
							placeholder="Username" class="pure-input-1">
						<label for="j_password">Password</label>
						<input type="password" id="j_password" name="j_password"
							placeholder="Password" class="pure-input-1">
					</fieldset>
					<button class="pure-button pure-button-primary" type="submit">Sign
						in</button>
					<a href="#" class="pull-right">Forgot Password</a>
				</form>
			</div>
		</div>
	</div>
</div>
<jsp:include page="./templates/footer.jsp" />