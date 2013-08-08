<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags/menu"%>
<c:if test="${mainMenu.isAllowed(pageContext.request)}">
	<div class="accordion" id="accordion">
		<c:forEach items="${mainMenu.menus}" var="menu" varStatus="i">
			<div class="accordion-group">
				<div class="accordion-heading">
					<a class="accordion-toggle menu-title collapsed" data-toggle="collapse"
						data-target="#collapse${i.index}" data-parent="#accordion"
						href="#collapse${i.index}">${menu.name}
					</a>
				</div>
				<tags:leftmenu menus="${menu.menuBar}" id="${i.index}" />
			</div>
		</c:forEach>
	</div>
</c:if>