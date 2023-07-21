<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>header</title>
</head>
<body>
	<!-- Header Section Begin -->
	<header class="header">
		<div class="headerTop">
			<div class="container">
				<div class="row">
					<div class="col-lg-6 col-md-7">
						<div class="headerTopLeft">
							<p><s:message code="label.home.free"></s:message>	</p>
							<span> 
							
							
							<a href="?language=vi">
  		<img alt="" src="https://s2.o7planning.com/templates/o7planning/resources/images/languages/vi.png">
  </a>
  
  <a href="?language=en">
  		<img alt="" src="https://s2.o7planning.com/templates/o7planning/resources/images/languages/en.png">
  </a>
							</span>
						
							
						</div>
					</div>
					
					<div class="col-lg-6 col-md-5">
						<div class="headerTopRight">
						<div class="headerTopLinks">
							<a href="${pageContext.request.contextPath }/cart"> <i class="fa-solid fa-cart-shopping"></i> </a>
						</div>
							<c:if test="${account == null }">
							<div class="headerTopLinks">
								<a href="login"> <s:message code="label.home.login"></s:message> </a>
								
							</div>
							</c:if>
							
  							
							<c:if test="${account != null }">
							<div style="color: white;" class="headerTopLinks">
							 <s:message code="label.home.hi"></s:message>  , ${account.ten }
													</div>
							<div class="headerTopLinks">
							<a href="${pageContext.request.contextPath }/logout"> <s:message code="label.home.lout"></s:message> </a>
						</div>
							</c:if>
						</div>
					</div>
					<!-- <div class="headerTopRight">
						<div class="headerTopLinks">
							<a href="">Sign out</a>
						</div>
					</div> -->

				</div>
			</div>
		</div>
		<div class="container">
			<div class="row">
				<div class="col-lg-3 col-md-3">
					<!-- <h2 class="mt-3">Logo Header</h2> -->
					<br> <img src="./img/logo.png" alt="">
				</div>
				<div class="col-lg-6 col-md-6">
					<nav class="headerMenu mobile-menu">
						<ul>
							<li><a href="/home"><s:message code="label.home.home"></s:message> </a></li>
							<li class="active"><a href="/shop"><s:message code="label.home.shop"></s:message> </a></li>
							<li><a href="/about"><s:message code="label.home.about"></s:message> </a></li>
						</ul>
					</nav>
				</div>
				
				</div>
			</div>
		</div>
	</header>
	<!-- Header Section End -->

</body>
</html>