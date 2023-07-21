<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index product</title>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.8.2/angular.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular-route.js"></script>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
      crossorigin="anonymous"
    />
 <!-- Google Font -->
        <link href="https://fonts.googleapis.com/css2?family=Nunito+Sans:wght@300;400;600;700;800;900&display=swap" rel="stylesheet">

        <!-- Css Styles -->
        <link rel="stylesheet" href="./css/bootstrap.min.css" type="text/css">
        <link rel="stylesheet" href="./css/font-awesome.min.css" type="text/css">
        <link rel="stylesheet" href="./css/elegant-icons.css" type="text/css">
        <link rel="stylesheet" href="./css/style.css" type="text/css">
</head>
<body>
<%-- <jsp:include page="header_.jsp"></jsp:include> --%>
<div class="container">
    <h1>Quan ly</h1>
   <table class="table">
   <tr>
   <td>ID<td>
   <td>Anh<td>
   <td>Ten<td>
   <td>Gia<td>
   <td>MoTa<td>
   <td>Chuc nang</td>
   </tr>
   <c:forEach items="${list }" var="p">
   <c:if test="${p.trangThai == 0 }">
   <tr>
   <td>${p.id }<td>
   <td><img style="height: 50px ; width: 50px" src="${pageContext.request.contextPath }/views/img/${p.anh}"><td>
   <td>${p.ten }<td>
   <td>${p.gia }<td>
   <td>${p.moTa }<td>
   <td>
   <button style="width: 50px" class="btn btn-primary"><a style="color: white;" href="${pageContext.request.contextPath }/product/update/${p.id}">Sua</a></button>
   <button style="width: 50px"  class="btn btn-danger"><a style="color: white;" href="${pageContext.request.contextPath }/product/delete/${p.id}">Xoa</a></button>
   </td>
   </c:if>
   </c:forEach>
   </table>
</div>
<br>
<%-- <jsp:include page="footer_.jsp"></jsp:include> --%>
</body>
</html>