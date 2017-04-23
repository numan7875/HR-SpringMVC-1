<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
    <title>RealGame - HR Personnal</title>
    <!-- Bootstrap -->
        <link href="<c:url value="/resources/css/bootstrap.css"></c:url>" rel="stylesheet">
	<link href="<c:url value="/resources/css/sb-admin.css"></c:url>" rel="stylesheet">
	<link href="<c:url value="/resources/css/Customize Modal.css"></c:url>" rel="stylesheet">
	<link href="<c:url value="/resources/fonts/font-awesome/css/font-awesome.min.css"></c:url>" rel="stylesheet" type="text/css">

	<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
	<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
	<!--[if lt IE 9]>
		  <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
		  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
		<![endif]-->
  </head>
  <body>
  <div id="wrapper">
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="home"><img src="<c:url value="/resources/img/numan.png"></c:url>" height="50" width="50" class="img-responsive" alt="Responsive image"></a>
            </div>
            <!-- Top Menu Items -->
            <ul class="nav navbar-right top-nav">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> ${fn:escapeXml(sessionPerson.getName())}  <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li>
                            <a href="#" id="profile"><i class="fa fa-fw fa-user"></i> Profile</a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="logOut"><i class="fa fa-fw fa-power-off"></i> Log Out</a>
                        </li>
                    </ul>
                </li>
            </ul>
            <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav side-nav">
                    <li>
                       <a class="jobAd" href="#"><i class="fa fa-fw fa-bank"></i> Job Advertisement </a>
                    </li>
                    <li>
                        <a class="applicants" href="#"><i class="fa fa-fw fa-users"></i> Applicants</a>
                    </li>
                    <li>
                        <a class="interview" href="#"><i class="fa fa-fw fa-suitcase"></i> Applicant' Interview Status</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </nav>
        
        <c:if test="${not empty create}">
        <div class="alert alert-success alert-dismissable">
            <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
            ${fn:escapeXml(create)}
        </div>
        </c:if>
                    
        <div id="page-wrapper">
        	<div class="container-fluid">
        	
        		<!--container-fluid ends-->
        	</div>
        	<!--page-wrapper ends-->
        </div>
  </div>
       
       <!-- Modal JobApplicants.html-->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header" style="padding:35px 50px;">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4><span class="glyphicon glyphicon-lock"></span> Applicant Information</h4>
          <br>
          <small>Experience is less than required!</small>
        </div>
        <div class="modal-body" style="padding:40px 50px;">
          <form role="form" class="smeForm">
            <div class="form-group">
              <label for="fname">Name</label>
              <input type="text" class="form-control" id="fname" disabled placeholder="Muhammad Numan Maraaj">
            </div>
            <div class="form-group">
              <label for="experience">Work Experience</label>
               <input type="text" class="form-control" id="experience" disabled placeholder="4 Years Experience">
            </div>
             <div class="form-group">
              <label for="telephone">Phone Number</label>
               <input type="text" class="form-control" id="telephone" disabled placeholder="+92-336-123-5896">
            </div>
            <div class="form-group">
              <label for="jobSrc">Job Source of Info.</label>
               <input type="text" class="form-control" id="jobSrc" disabled placeholder="Job Ad on Company' site">
            </div>
            <div class="form-group">
              <label for="coverLetter">Cover Letter</label>
               <input type="text" class="form-control" id="coverLetter" disabled placeholder="Some Lorem ipsum things like that.">
            </div>
            <div class="form-group">
		<a href="#" id="cvLink"><b>Applicant' CV</b></a>
            </div>
             
              <button type="submit" class="btn btn-primary btn-block"><span class="glyphicon glyphicon-send"></span> Send to SME</button>
              <div class="smeSuccess"></div>
          </form>
        </div>
        <div class="modal-footer">
          <button type="submit" class="btn btn-danger btn-default pull-left" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> Reject</button>
        </div>
      </div>
      
    </div>
  </div> 
        

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) --> 
	
        <script src="<c:url value="/resources/js/jquery-3.1.1.js"></c:url>"></script>
	<script src="<c:url value="/resources/js/jquery-1.11.3.min.js"></c:url>"></script>
	<script src="<c:url value="/resources/js/HR Personnel.js"></c:url>"></script>
	

	<!-- Include all compiled plugins (below), or include individual files as needed --> 
	<script src="<c:url value="/resources/js/bootstrap.js"></c:url>"></script>
	
  </body>
</html>
