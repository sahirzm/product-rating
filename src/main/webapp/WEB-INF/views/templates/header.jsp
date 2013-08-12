<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="baseUrl" value="${pageContext.request.contextPath}"
	scope="request" />
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="${baseUrl}/resources/css/pure-min.css">
<link rel="stylesheet" href="${baseUrl}/resources/css/custom.css">
<script type="text/javascript" src="${baseUrl}/resources/js/yui/build/yui/yui-min.js"></script>
<script type="text/javascript" src="${baseUrl}/resources/js/kform-yui.js"></script>
<title>Welcome | Products Rating</title>
<script type="text/javascript">
	var BASE_URL = "${baseUrl}";
</script>
</head>
<body>