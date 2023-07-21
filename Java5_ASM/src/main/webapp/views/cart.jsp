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
       <link rel="stylesheet" href="./css/font-awesome.min.css" type="text/css">
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
 
    <!-- Shopping Cart Section Begin -->
    <section class="shopping-cart spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-7">
                    <div class="shoppingCartTable">
                        <table>
                            <thead>
                                <tr>
                                    <th>Product</th>
                                    <th>Quantity</th>
                                    <th>Total</th>
                                    <th></th>
                                </tr>
                            </thead>
                            <tbody>
                               <c:forEach items="${listCart }" var="c">
                                <tr>
                                    <td class="productCartItem">
                                        <div class="productCartItemPic">
                                            <img style="height: 100px; width: 100px" src="${pageContext.request.contextPath }/views/img/${c.product.anh}" alt="">
                                        </div>
                                        <div class="productCartItemText">
                                            <h6>${c.product.ten }</h6>
                                            
                                        </div>
                                    </td>
                                    <td class="quantityItem">
                                       ${c.soLuong }
                                    </td>
                                    <td class="cartPrice">${c.product.gia } đ</td>
                                    <td class="cartClose"><a href="${pageContext.request.contextPath }/cart/delete/${c.product.id}"><i class="fa-solid fa-trash"></i></a></td>
                                </tr>
                               </c:forEach>
                              
                            </tbody>
                        </table>
                    </div>
                </div>
              
                <div class="col-lg-5">
                 <f:form modelAttribute="data" method="post" action="${pageContext.request.contextPath }/cart/thanhtoan">
                    <div class="cartTotal">
                        <h6>Cart total</h6>
                        <ul>
                            <li>Ten nguoi nhan </li>
                            <div><f:input path="ten"/></div>
                            <li>Sdt nguoi nhan </li>
                            <div><f:input path="sdt"/></div>
                            <li>Dia chi nguoi nhan </li>
                            <div><f:input path="diachi"/></div>
                            <li>Total <span>${tongTien } đ</span></li>
                        </ul>
                        <button type="submit">Proceed to checkout</button>
                        
                    </div>
                    </f:form>
                </div>
               
            </div>
        </div>
    </section>
    <!-- Shopping Cart Section End -->
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