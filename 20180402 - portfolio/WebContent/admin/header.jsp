<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Nonage Admin</title>
<link rel="stylesheet" href="admin/css/admin.css">
<script type="text/javascript" src="admin/product/product.js"></script>
</head>
<c:choose>
	<c:when test="${empty workerId}">   <!-- 관리자아이디없으면 로그인폼으로돌아가라-->
		<script type="text/javascript">
			location.href = 'NonageServlet?command=admin_login_form';
		</script>
	</c:when>
</c:choose>
<body onload="go_ab()">
	<div id="wrap">
		<header>			
			<div id="logo">
				<a href="NonageServlet?command=admin_login_form"> 
					<img style="width:800px" src="admin/images/bar_01.gif">
					<img src="admin/images/text.gif">
				</a>
			</div>	
			<input class="btn" type="button"  value="logout" style="float: right;" onClick="location.href='NonageServlet?command=admin_logout'">			
		</header>
		<div class="clear"></div>