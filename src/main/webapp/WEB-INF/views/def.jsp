<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="ex" uri="/WEB-INF/sumtag.tld"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>This is a default view</title>
</head>
<body>
    <p>This is a default view.</p>
    <form action='<c:url value="/Sum" />' method="GET">
        <ex:Sum a="${a}" b="${b}" result="${resultSum}"></ex:Sum>
    </form>
</body>
</html>