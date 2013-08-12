<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="baseUrl" value="${pageContext.request.contextPath}"
	scope="request" />
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="${baseUrl}/resources/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${baseUrl}/resources/css/jquery-ui-1.10.3.custom.css">
<link rel="stylesheet"
	href="${baseUrl}/resources/css/font-awesome.min.css">
<link rel="stylesheet" href="${baseUrl}/resources/css/default.css">
<script type="text/javascript"
	src="${baseUrl}/resources/js/jquery-1.10.2.min.js"></script>
<title>Welcome | Products Rating</title>
<script type="text/javascript">
	var BASE_URL = "${baseUrl}";
</script>
</head>
<body>