<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>add account</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="./style.css">
    <script src="https://kit.fontawesome.com/999051c9de.js" crossorigin="anonymous"></script>

<link rel="stylesheet" href="css/cssadd.css">
</head>
<body>

	<%-- <section>

        <div class="col-lg-6 col-md-6 noi-dung">
		<div class="form">
                <br>
                <h2>Trang Đăng Nhập</h2>
                <br>
	<form:form method="POST" action="/user/saveUser" modelAttribute="user">
           
    <label>Ten :</label>
    <form:input path="ten"/>
    <form:errors path="ten" />
  	

    <br>
    <label>Mat khau :</label>
    <form:input path="matKhau"/>
    <form:errors path="matKhau" />

    <br>
    <label>Email:</label>
    <form:input path="mail"/>
     <form:errors path="mail" />
    <br> 
    <input type="submit" value="Save"/>
        </form:form>
        </div>
        </div>
        </section> --%>
            <section class="vh-100 register" style="background-color: #fff;">
            <div class="container py-5 h-100">
              <div class="row d-flex justify-content-center align-items-center h-100">
                <div class="col col-xl-10">
                  <div class="card" style="border-radius: 1rem;">
                    <div class="row g-0">
                      <div class="col-md-6 col-lg-5 d-none d-md-block login">
                       
                      </div>
        <div class="col-md-6 col-lg-7 d-flex align-items-center">
                        <div class="card-body p-4 p-lg-5 text-black">
          
                          
          
                            <div class="d-flex align-items-center mb-3 pb-1">
                              <span class="h1 fw-bold mb-0"> <h1 class="giua"> Tạo Account</h1></span>
                            </div>
                            <form:form method="POST" action="/user/saveUser" modelAttribute="user">
                            <div class="form-outline mb-4">
                                <label class="form-label" for="form2Example17"> Tài khoản</label>
                                <form:input path="ten"/>
    							<form:errors path="ten" />
                           
                            </div>
          
                            <div class="form-outline mb-4">
                                <label class="form-label" for="form2Example27">Mật khẩu</label>
                                <form:input type="password" path="matKhau"/>
    							<form:errors path="matKhau" />
                             
                            </div>
                            
                            <div class="form-outline mb-4">
                                <label class="form-label" for="form2Example17"> Email</label>
                                <form:input path="mail"/>
    							<form:errors path="mail" />
                             
                            </div>
                               <div class="pt-1 mb-4">
                               
                              <button class="btn btn-dark btn-lg btn-block" type="submit"></i> Save</button>
                            </div>
                             <p>Bạn đã có tài khoản <a href="${pageContext.request.contextPath }/login">Đăng Nhâp</a></p>
                            </form:form>
                           <!--  <div class="form-outline mb-4">
                              <input type="checkbox"value=""/> Tôi đồng ý với điều khoản và dịch vụ
                            </div> -->
                         
                          
          
                        </div>
                      </div>
                      </div>
                  </div>
                </div>
              </div>
            </div>
          </section>
</body>
</html>