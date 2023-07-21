<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html> <html>
<head>
<meta charset="UTF-8">
<title>index</title>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.8.2/angular.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular-route.js"></script>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
      crossorigin="anonymous"
    />
    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
<%--         <script src="https://kit.fontawesome.com/999051c9de.js" crossorigin="anonymous"></script>
     <link rel="stylesheet" href="${pageContext.request.contextPath }/views/css/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/views/css/elegant-icons.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/views/css/cssadd.css" type="text/css">
     <link rel="styleshee" href="${pageContext.request.contextPath }/views/css/style.css" type="text/css">
      <link rel="stylesheet" href="${pageContext.request.contextPath }/views/css/font-awesome.min.css" type="text/css">  --%>
<!--  Google Font -->
        <link href="https://fonts.googleapis.com/css2?family=Nunito+Sans:wght@300;400;600;700;800;900&display=swap" rel="stylesheet">
<!-- 
        Css Styles -->
        <link rel="stylesheet" href="${pageContext.request.contextPath }/css/bootstrap.min.css" type="text/css">
        <link rel="stylesheet" href="${pageContext.request.contextPath }/css/font-awesome.min.css" type="text/css">
        <link rel="stylesheet" href="${pageContext.request.contextPath }/css/elegant-icons.css" type="text/css">
        <link rel="stylesheet" href="${pageContext.request.contextPath }/css/style.css" type="text/css">
        
</head>
<body>
<c:if test="${not empty message}">
   							 <input type="hidden" id="message" value="${message }">
                        <input type="hidden" id="type" value="${type }">
						</c:if>
<jsp:include page="header_.jsp"></jsp:include>
 <div class="container">
  <div class="row">
   <div class="col-sm-4"> 
  <img style="width: 150px; height: 150px" src="${pageContext.request.contextPath}/views/img/${product.anh}" class="card-img-top" alt=""/>
   <br>
    <f:form modelAttribute="data" action="${pageContext.request.contextPath }/detail/${product.id }" method="post">
    <f:input path="idProduct" type="hidden" value="${product.id }"/>
    <f:input path="username" type="hidden" value="${account.ten }"/>
    <span class="card-title">${product.ten} </span> 
    <br>
     <span class="card-title">${product.gia} </span> 
     <br> 
     <div class="nutthanhtoan">
        <button type="submit" class="nutthemgiott"><a href="#"><i class="fa-brands fa-cc-apple-pay"></i><p class="gian">Thêm vào giỏ</p></a></button>
      </div>
    </f:form>
     </div>
      </div> 
      </div>

<jsp:include page="footer.jsp"></jsp:include>
<script type="text/javascript">
		var message = document.getElementById("message").value;
		var type = document.getElementById("type").value;
		console.log(message);
		
		if(message != ""){
			console.log("ggk");
			Swal.fire(message, '', type);
		}
		
</script>

</body>
</html> 
