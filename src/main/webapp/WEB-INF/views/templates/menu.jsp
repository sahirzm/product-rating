<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="navbar">
	<div class="navbar-inner">
		<ul class="nav">
			<li class="active"><a href="${baseUrl }/">Home</a></li>
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#"> Product <b class="caret"></b>
			</a>
				<ul class="dropdown-menu">
					<li><a href="#"
						onclick="loadForm({url:'/product/list.do',container:'mainContent'})">List</a></li>
					<li><a href="#"
						onclick="loadForm({url:'/product/create.do',container:'mainContent'})">Create</a></li>
				</ul></li>
			<li><a href="${baseUrl }/logout">Logout</a></li>
		</ul>
	</div>
</div>