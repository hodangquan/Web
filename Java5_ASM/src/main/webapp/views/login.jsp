<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
<section>

        <div class="col-lg-6 col-md-6 noi-dung">
<div class="form">
                <br>
                <h2>Trang Đăng Nhập</h2>
                <br>
             
               <form:form modelAttribute="user" action="${pageContext.request.contextPath }/login" method="post">
               <div class="input-form">
                        <span>Tên Người Dùng</span>
                        <form:input path="ten"/>
                        <form:errors path="ten" ></form:errors>
                    </div>
                    <div class="input-form">
                        <span>Mật Khẩu</span>
                        <form:password path="matKhau"/>
                        <form:errors path="matKhau" ></form:errors>
                    </div>
                    
                    <div class="input-form">
                        <input type="submit" value="login">
                    </div>
                    <div class="input-form">
                        <p>Bạn Chưa Có Tài Khoản? <a href="user/addUser">Đăng Ký</a></p>
                        <!-- <p><a href="quenmk.html">Quên mật khẩu</a></p> -->
                    </div>
               </form:form>
            </div>
            </div>
        <!--Kết Thúc Phần Nội Dung-->
    </section>
   

</body>
</html>