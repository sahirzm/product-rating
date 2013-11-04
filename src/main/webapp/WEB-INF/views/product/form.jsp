<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="productForm">
	<fieldset>
		<legend>Product Details</legend>
		<div class="row-fluid">
			<c:if test="${product.id gt 0}">
				<div class="span3">
					<label for="id"> Id </label>
					${product.id }
					<input type="hidden" id="id" name="id" value="${product.id }" class="span12">
				</div>
			</c:if>

			<div class="span3">
				<label for="name">
					Name <span class="required">*</span>
				</label>
				<input type="text" id="name" name="name" value="${product.name }" class="span12">
			</div>


			<c:if test="${product.id gt 0 }">
				<div class="span3">
					<label for="createdon">
						Created On <span class="required">*</span>
					</label>
					<fmt:formatDate value="${product.createdon }" />
				</div>
			</c:if>

			<div class="span3">
				<label for="keyword">
					Keyword <span class="required">*</span>
				</label>
				<textarea id="keywords" name="keywords" class="span12">${product.keywords }</textarea>
			</div>
		</div>
	</fieldset>
	<button type="button" id="submit" class="btn btn-primary">${product.id
			gt 0 ? 'Update' : 'Save' }</button>
	<button type="button" id="cancel" class="btn"
		onclick="loadForm('/product/list.do','#content')">Cancel</button>
</form>
<script type="text/javascript">
	$(function() {
		<c:choose>
		<c:when test="${product.id gt 0 }">
		changeHeading('Update Product #${product.id}');
		changeTitle('Update product #${product.id} | Admin Panel');
		</c:when>
		<c:otherwise>
		changeHeading('Create New product');
		changeTitle('Create New product');
		</c:otherwise>
		</c:choose>
		$('#submit').click(function() {
			<c:choose>
			<c:when test="${product.id gt 0 }">
			submitForm("#productForm", "/product/edit.do", "#content");
			</c:when>
			<c:otherwise>
			submitForm("#productForm", "/product/create.do", "#content");
			</c:otherwise>
			</c:choose>
		});
	});
</script>