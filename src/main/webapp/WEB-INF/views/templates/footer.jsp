<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<div class="footer container">
	<div class="pure-g-r">
		<div class="pure-u-1">
			<footer>
				<p><%=new java.text.SimpleDateFormat("yyyy")
					.format(new java.util.Date())%>
				</p>
			</footer>
		</div>
	</div>
</div>
</body>
</html>