<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<p>users;
	<h1>
		<c:forEach var="i" items="${users}">
			<c:out value="${i}" />
		</c:forEach>
	</h1>
	<h1>Our param1</h1>
	${param1}

	<h1>${pageContext.request.characterEncoding}</h1>
	<h1>${pageContext.request.contextPath}</h1>

	<jsp:useBean id="user" class="by.htp.webexmpl.model.User"></jsp:useBean>

	<jsp:getProperty name="user" property="name" />
	<jsp:setProperty name="user" property="name" value="Алеся" />
	<jsp:getProperty name="user" property="name" />

	<h1>${pageContext.session.creationTime}</h1>
	<h1>${pageContext.session.id}</h1>
	<h1>${pageContext.session.lastAccessedTime}</h1>
	<h1>${pageContext.session.lastAccessedTime}</h1>

	</p>

</body>
</html>