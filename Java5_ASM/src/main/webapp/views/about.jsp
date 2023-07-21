<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>about</title>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.8.2/angular.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular-route.js"></script>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
      crossorigin="anonymous"
    />
        <script src="https://kit.fontawesome.com/999051c9de.js" crossorigin="anonymous"></script>
     <%-- <link rel="stylesheet" href="${pageContext.request.contextPath }/views/css/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/views/css/elegant-icons.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/views/css/cssadd.css" type="text/css">
     <link rel="styleshee" href="${pageContext.request.contextPath }/views/css/style.css" type="text/css">
      <link rel="stylesheet" href="${pageContext.request.contextPath }/views/css/font-awesome.min.css" type="text/css">  --%>
<!--  Google Font -->
        <link href="https://fonts.googleapis.com/css2?family=Nunito+Sans:wght@300;400;600;700;800;900&display=swap" rel="stylesheet">
<!-- 
        Css Styles -->
        <link rel="stylesheet" href="./css/bootstrap.min.css" type="text/css">
        <link rel="stylesheet" href="./css/font-awesome.min.css" type="text/css">
        <link rel="stylesheet" href="./css/elegant-icons.css" type="text/css">
        <link rel="stylesheet" href="./css/style.css" type="text/css">
        
        
</head>
<body>
<jsp:include page="header_.jsp"></jsp:include> 
    <!-- About Section Begin -->
    <section class="about spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="aboutPic">
                        <img src="views/img/about-us.jpg" alt="">
                    </div>
                </div>
            </div>
            <div class="row">
                <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Possimus, consequuntur distinctio. Reiciendis, dicta commodi deserunt deleniti ex suscipit eveniet distinctio officiis ipsam doloremque qui quibusdam tenetur cupiditate repellat
                    voluptatum perspiciatis.</p>
                <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Possimus, consequuntur distinctio. Reiciendis, dicta commodi deserunt deleniti ex suscipit eveniet distinctio officiis ipsam doloremque qui quibusdam tenetur cupiditate repellat
                    voluptatum perspiciatis.</p>
                <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Possimus, consequuntur distinctio. Reiciendis, dicta commodi deserunt deleniti ex suscipit eveniet distinctio officiis ipsam doloremque qui quibusdam tenetur cupiditate repellat
                    voluptatum perspiciatis.</p>
            </div>
        </div>
    </section>
    <!-- About Section End -->
<jsp:include page="footer.jsp"></jsp:include> 
</body>
</html>