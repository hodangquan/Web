<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>shop</title>
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
 <!-- Shop Section Begin -->
    <section class="shop spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-3">
                    <div class="shopSidebar">
                        <div class="shopSidebarSearch">
                            <form action="#">
                                <input type="text" placeholder="Search...">
                                <button type="submit"></button>
                            </form>
                        </div>
                        <div class="shopSidebarAccordion">
                            <div class="accordion">
                                <div class="card">
                                    <div class="card-heading">
                                        Categories
                                    </div>
                                    <div class="card-body">
                                        <div class="shopSidebarCategories">
                                            <ul>
                                                <li><a href="#">Men</a></li>
                                                <li><a href="#">Women</a></li>
                                                <li><a href="#">Bags</a></li>
                                                <li><a href="#">Clothing</a></li>
                                                <li><a href="#">Shoes</a></li>
                                                <li><a href="#">Accessories</a></li>
                                                <li><a href="#">Kids</a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-9">
                    <div class="row">
                        <c:forEach items="${list }" var="p">
                       <c:if test="${p.trangThai == 0 }">
                        <div class="col-md-4">
                            <div class="productItem">
                                <div class="productItemPic set-bg">
                                <img style="width: 300px; height: 300px" src="${pageContext.request.contextPath }/views/img/${p.anh}">
                                </div>
                                <div class="productItemText">
                                    <h6>${p.ten }</h6>
                                    <div class="row">
                                        <div class="col-10">
                                            <h5>${p.gia } đ</h5>
                                        </div>
                                        <div class="col-2">
                                             <a href="/detail/${p.id }"><i class="fa-solid fa-cart-shopping"></i></a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            </div>
                       </c:if>
                        </c:forEach>
                        </div>
                    </div>
                </div>
            </div>
        
    </section>
    <!-- Shop Section End -->


<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>