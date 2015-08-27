<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="h"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<c:url value="resources/css/style.css"/>" rel="stylesheet"/>
<link href="<c:url value="resources/css/bootstrap.min.css"/>" rel="stylesheet"/>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">

<script src="<c:url value="resources/js/jquery.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="resources/js/bootstrap.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="resources/js/jscontroller/adminController.js"/>" type="text/javascript"></script>
<script src="<c:url value="resources/js/jscontroller/aplicationFormController.js"/>" type="text/javascript"></script>
<title><tiles:getAsString name="title"></tiles:getAsString></title>
</head>
<body>

	
		<div id="header">
			<tiles:insertAttribute name="header"></tiles:insertAttribute>
		</div>

		<div id="body">
			<tiles:insertAttribute name="body"></tiles:insertAttribute>
		</div>

	
</body>
</html>