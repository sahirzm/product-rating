<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="horizontal-menu">
	<ul id="std-menu-items">
		<li id="homeMenu" class="pure-menu-selected"><a
			href="${baseUrl }/">Home</a></li>
		<li id="productMenu"><a href="#">Product</a>
			<ul>
				<li><a href="#" onclick="loadForm({url:'/product/create.do',container:'#mainContent'})">Create</a></li>
				<li><a href="${baseUrl }/product/list.do">List</a></li>
			</ul></li>
		<li><a href="${baseUrl }/logout">Logout</a></li>
	</ul>
</div>
<script>
	YUI({
		classNamePrefix : 'pure'
	}).use('gallery-sm-menu', function(Y) {

		var horizontalMenu = new Y.Menu({
			container : '#horizontal-menu',
			sourceNode : '#std-menu-items',
			orientation : 'horizontal',
			hideOnOutsideClick : false,
			hideOnClick : false
		});

		horizontalMenu.render();
		horizontalMenu.show();

	});
</script>