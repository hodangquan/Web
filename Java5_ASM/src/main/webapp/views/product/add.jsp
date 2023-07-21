<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>add sp</title>
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
    <h1>Thêm sản phẩm mới</h1>
    <form:form method="post" modelAttribute="product" action="${pageContext.request.contextPath }/product/add" enctype="multipart/form-data">
        <div>
           
                <div class="form-group">
                  <label for="exampleFormControlFile1"> Ảnh Sản Phẩm *:</label>
                  <!-- <input type="file" class="form-control-file" id="fileUpload" ng-model="anh" required> -->
                   <input type="file" name="file"/>
    			   
                </div>
                <br>
                <label for="exampleInputEmail1">Tên Sản Phẩm* :</label>
                 <form:input path="ten"/>
    				<form:errors path="ten" />
    				<br>
    				<br>
   <!--  <input type="text" class="form-control" novalidate name="tieude" id="exampleInputEmail1" placeholder="Nhập tên sản phẩm" ng-model="tieude" required> -->
        		<label for="exampleInputEmail1" >Giá Sản Phẩm</label>
        		 <form:input path="gia"/>
    			<form:errors path="gia" />
    			<br><br>
   <!--  <input type="number" class="form-control" id="exampleInputEmail1" placeholder="Nhập giá bán sản phẩm" ng-model="giaban"> -->
    <label for="exampleInputEmail1" >Số Lượng Sản Phẩm</label>
     			<form:input path="soLuong"/>
    			<form:errors path="soLuong" />
    			<br>
    				<br>
    			
    <!-- <input type="number" class="form-control" id="exampleInputEmail1" placeholder="Nhập số lượng sản phẩm" ng-model="soluong"> -->
     <%--  <label for="exampleInputEmail1">Kiểu Size *:</label>
      <div class="loaisize">
              <div class="form-check form-check-inline">
               
                  <form:checkbox path="kichCo" value="M"/>M
                  <form:checkbox path="kichCo" value="L"/>L
                </div>
         
      </div>
      	<br> --%>
      
      <label for="exampleInputEmail1">Mô Tả Sản Phẩm* :</label>
       				<form:input path="moTa"/>
    				<form:errors path="moTa" />
     <!--  <input type="text" class="form-control" id="exampleInputEmail1" placeholder="Nhập mô tả sản phẩm" ng-model="mota">
      <br> -->
      
      <button type="submit" class="btn btn-danger"><i class="fa-solid fa-plus"></i> Thêm Sản Phẩm</button>
  </div>
  </div>
           
        </div>
    </form:form>

<br>
<%-- <jsp:include page="footer_.jsp"></jsp:include> --%>
</body>
</html>