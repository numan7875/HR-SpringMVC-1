<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3" >
  <head>
    <meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
    <title>RealGame - Login</title>
    <!-- Bootstrap -->
    <link href="<c:url value="/resources/css/bootstrap.css"></c:url>" rel="stylesheet">
    <link href="<c:url value="/resources/css/signin.css"></c:url>" rel="stylesheet">
    <link href="<c:url value="/resources/css/Customize Modal.css"></c:url>" rel="stylesheet">

	<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
	<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
	<!--[if lt IE 9]>
		  <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
		  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
		<![endif]-->
  </head>
  <body>
  <div class="jumbotron" style="height: 100vh;">
   <div class="container" style="align-content: center">
       <form class="form-signin" th:action="@{/loginHR}" method="post">
        <h2 class="form-signin-heading"><img src="<c:url value="/resources/img/numan.png"></c:url>" class="img-responsive" alt="Responsive image"></h2>
        <br>
        <label for="inputEmail" class="sr-only">Email address</label>
        <input type="email" name = "email" id="inputEmail" class="form-control input-lg" placeholder="Email address" required autofocus>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" name="password" id="inputPassword" class="form-control" placeholder="Password" required>
        
       <c:if test="${not empty message}">
        <div class="alert alert-danger alert-dismissable">
            <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
            ${fn:escapeXml(message)}
        </div>
       </c:if>
        
        <!--<div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> Remember me
          </label>
        </div>-->
        <button class="btn btn-success input-lg" type="submit">Sign in</button>
        <!--<button class="btn btn-default input-lg" type="submit">Create ID</button>-->
        <br><br>	
        <div>Forgot <a id="forgotPass" href="#myModal" data-toggle="modal">Password?</a></div>
      </form>
   </div>
  </div>
  
  <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog" aria-hidden="true">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header" style="padding:35px 50px;">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4><span class="glyphicon glyphicon-lock"></span> Retrieve Password </h4>
        </div>
        <div class="modal-body" style="padding:40px 50px;">
            <form id="passSend" role="form" name="">
            <div class="form-group">
              <label for="psw"><span class="glyphicon glyphicon-eye-open"></span> Email Address</label>
              <input type="email" class="form-control" id="psw" placeholder="Enter Email Address" required>
            </div>
              <button type="submit" class="btn btn-primary btn-block"><span class="glyphicon glyphicon-send"></span></button>
              
          </form>
          <br>
          <div id="sendSuccess"></div>
        </div>
        <div class="modal-footer">
          <button type="submit" class="btn btn-danger btn-default pull-left" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> Cancel</button>
        </div>
      </div>
      
    </div>
  </div> 
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) --> 
        <script src="<c:url value="/resources/js/jquery-1.11.3.min.js"></c:url>"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed --> 
        <script src="<c:url value="/resources/js/bootstrap.js"></c:url>"></script>
	<!-- For Forgot Password -->
        <script src="<c:url value="resources/js/ForgotPassword.js"></c:url>"></script>
  </body>
</html>
