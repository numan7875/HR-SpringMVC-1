<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
	<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="">
	<meta name="author" content="">
	<title>Real Game Lab</title>

	<!-- Bootstrap Core CSS -->
        <link href="<c:url value="/resources/vendor/bootstrap/css/bootstrap.min.css"></c:url>" rel="stylesheet">

	<!-- Theme CSS -->
        <link href="<c:url value="/resources/css/freelancer.min.css"></c:url>" rel="stylesheet">

	<!-- Custom Fonts -->
        <link href="<c:url value="/resources/vendor/font-awesome/css/font-awesome.min.css"></c:url>" rel="stylesheet" type="text/css">
        <link href="<c:url value="https://fonts.googleapis.com/css?family=Montserrat:400,700"></c:url>" rel="stylesheet" type="text/css">
        <link href="<c:url value="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic"></c:url>" rel="stylesheet" type="text/css">
	<style >
        @-moz-document url-prefix() {
            fieldset {
            display: table-cell;
           }
       }
</style>

	<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
	<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
	<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

	</head>

	<body id="page-top" class="index">

<!-- Navigation -->
<nav id="mainNav" class="navbar navbar-default navbar-fixed-top navbar-custom">
      <div class="container"> 
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header page-scroll">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> <span class="sr-only">Toggle navigation</span> Menu <i class="fa fa-bars"></i> </button>
          <a class="navbar-brand" href="#page-top">RealGame Lab</a> </div>
    
    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
          <ul class="nav navbar-nav navbar-right">
        <li class="hidden"> <a href="#page-top"></a> </li>
        <li class="page-scroll"> <a href="#portfolio">Executive</a> </li>
        <li class="page-scroll"> <a href="#career">Career</a> </li>
        <li class="page-scroll"> <a href="#about">About Us</a> </li>
        <li class="page-scroll"> <a href="#contact">Contact</a> </li>
      </ul>
        </div>
    <!-- /.navbar-collapse --> 
  </div>
      <!-- /.container-fluid --> 
    </nav>

<!-- Header -->
<header>
      <div class="container">
    <div class="row">
        <div class="col-lg-12"> <img class="img-responsive" src="<c:url value="/resources/img/numan.png"></c:url>" alt="">
        <div class="intro-text"> <span class="name">RealGame Lab</span>
              <hr class="star-light">
              <span class="skills">Game Developer - Graphic Artist - User Experience Designer</span> </div>
      </div>
        </div>
  </div>
    </header>

<!-- Portfolio Grid Section -->
<section id="portfolio">
      <div class="container">
    <div class="row">
          <div class="col-lg-12 text-center">
        <h2>Executives</h2>
        <hr class="star-primary">
      </div>
        </div>
    <div class="row">
          <div class="col-sm-4 portfolio-item"> <a href="#portfolioModal1" class="portfolio-link" data-toggle="modal">
            <div class="caption">
            <div class="caption-content"> <i class="fa fa-search-plus fa-3x"></i> <b>HR Manager</b> </div>
          </div>
                  <img src="<c:url value="/resources/img/Faiq.JPG"></c:url>" class="img-responsive" alt=""> </a> </div>
          <div class="col-sm-4 portfolio-item"> <a href="#portfolioModal2" class="portfolio-link" data-toggle="modal">
            <div class="caption">
            <div class="caption-content"> <i class="fa fa-search-plus fa-3x"></i><b>Subject Matter Expert</b>  </div>
          </div>
                  <img src="<c:url value="/resources/img/IMGP0220.JPG"></c:url>" class="img-responsive" alt=""> </a> </div>
          <div class="col-sm-4 portfolio-item"> <a href="#portfolioModal3" class="portfolio-link" data-toggle="modal">
            <div class="caption">
            <div class="caption-content"> <i class="fa fa-search-plus fa-3x"></i> <b>HR Personnal</b> </div>
          </div>
                  <img src="<c:url value="/resources/img/IMGP0199.JPG"></c:url>" class="img-responsive" alt=""> </a> </div>
        </div>
  </div>
    </section>
    
    <!-- Career Section-->
<section id="career">
      <div class="container">
    <div class="row">
          <div class="col-lg-12 text-center">
        <h2>Job Opportunities</h2>
        <hr class="star-primary">
      </div>
        </div>
    <div class="row">
          <div class="col-lg-12 col-sm-12">
        <div class="table-responsive">
              <table class="table table-hover table-responsive table-condensed">
            <thead>
                  <tr class="active">
                <th>#</th>
                <th>Posting Title</th>
                <th>Work Experience</th>
                <th>Job Description</th>
                <th>&nbsp</th>
              </tr>
                </thead>
            <tbody>
                
            <c:forEach var="jobIt" items="${jobs}">
              <tr>
                <th scope="row">1</th>
                <td>${jobIt.jobTitle}</td>
                <td>${jobIt.jobExperience}</td>
                <td>${jobIt.jobDescription}</td>
                <td><a href="#jobModal" class="btn btn-default" data-toggle="modal">Apply Now</a></td>
              </tr>
              </c:forEach>
              
                </tbody>
          </table>
            </div>
      </div>
        </div>
  </div>
    </section>
<!-- About Section -->
<section class="success" id="about">
      	<div class="container">
			<div class="row">
				<div class="col-lg-12 text-center">
				<h2>About Us!</h2>
				<hr class="star-light">
				</div>
			</div>
			<div class="row">
				<div class="col-lg-6 col-lg-offset-2">
					<p>RealGame Lab being one of the market leaders in game and android development, is focusing on creating business value and promotion for clients internationally and locally. For us, fulfilling customer needs, our commitment and providing best solutions to their problems are our fore most priorities.</p>
				</div>
				<div class="col-lg-4">
					<p>We strive for continuous quality improvement in everything that we do, so we will rank among the world's premier firms in customer and employee satisfaction.</p>
				</div>
			</div>
  		</div>
</section>

<!-- Contact Section -->
<section id="contact">
      <div class="container">
    <div class="row">
          <div class="col-lg-12 text-center">
        <h2>Contact Me</h2>
        <hr class="star-primary">
      </div>
        </div>
    <div class="row">
          <div class="col-lg-8 col-lg-offset-2"> 
        <!-- To configure the contact form email address, go to mail/contact_me.php and update the email address in the PHP file on line 19. --> 
        <!-- The form should work on most web servers, but if the form is not working you may need to configure your web server differently. -->
        <form name="sentMessage" id="contactForm">
              <div class="row control-group">
            <div class="form-group col-xs-12 floating-label-form-group controls">
                  <label>Name</label>
                  <input type="text" class="form-control" placeholder="Name" id="name" required data-validation-required-message="Please enter your name.">
                  <p class="help-block text-danger"></p>
                </div>
          </div>
              <div class="row control-group">
            <div class="form-group col-xs-12 floating-label-form-group controls">
                  <label>Email Address</label>
                  <input type="email" class="form-control" placeholder="Email Address" id="email" required data-validation-required-message="Please enter your email address.">
                  <p class="help-block text-danger"></p>
                </div>
          </div>
              <div class="row control-group">
            <div class="form-group col-xs-12 floating-label-form-group controls">
                  <label>Phone Number</label>
                  <input type="tel" class="form-control" placeholder="Phone Number" id="phone" required data-validation-required-message="Please enter your phone number.">
                  <p class="help-block text-danger"></p>
                </div>
          </div>
              <div class="row control-group">
            <div class="form-group col-xs-12 floating-label-form-group controls">
                  <label>Message</label>
                  <textarea rows="5" class="form-control" placeholder="Message" id="message" required data-validation-required-message="Please enter a message."></textarea>
                  <p class="help-block text-danger"></p>
                </div>
          </div>
              <br>
              <div class="successContact"></div>
              <div id="success"></div>
              <div class="row">
            <div class="form-group col-xs-12">
                  <button type="submit" class="btn btn-success btn-lg">Send</button>
                </div>
          </div>
            </form>
      </div>
        </div>
  </div>
    </section>

<!-- Footer -->
<footer class="text-center">
      <div class="footer-above">
    		<div class="container">
          		<div class="row">
        			<div class="footer-col col-md-6">
					  <h3>Location</h3>
					  <p>Office xyz<br>
					   Siddiq Trade Centre, <br>
					   Main Blvd Gulberg, CA 90210</p>
            		</div>
					<div class="footer-col col-md-6">
					  <h3>Around the Web</h3>
					  <ul class="list-inline">
						<li> <a href="#" class="btn-social btn-outline"><i class="fa fa-fw fa-facebook"></i></a> </li>
						<li> <a href="#" class="btn-social btn-outline"><i class="fa fa-fw fa-google-plus"></i></a> </li>
						<li> <a href="#" class="btn-social btn-outline"><i class="fa fa-fw fa-twitter"></i></a> </li>
						<li> <a href="#" class="btn-social btn-outline"><i class="fa fa-fw fa-linkedin"></i></a> </li>
						<li> <a href="#" class="btn-social btn-outline"><i class="fa fa-fw fa-dribbble"></i></a> </li>
					  </ul>
					</div>
     	 		</div>
        	</div>
  		</div>
      	<div class="footer-below">
    		<div class="container">
          		<div class="row">
        			<div class="col-lg-12"> Copyright &copy; RealGame Lab '17 </div>
      			</div>
        	</div>
  		</div>
</footer>

<!-- Scroll to Top Button (Only visible on small and extra-small screen sizes) -->
<div class="scroll-top page-scroll"> <a class="btn btn-primary" href="#page-top"> <i class="fa fa-chevron-up"></i> </a> </div>

<!-- Portfolio Modals -->
<div class="portfolio-modal modal fade" id="portfolioModal1" tabindex="-1" role="dialog" aria-hidden="true">
      <div class="modal-content">
    <div class="close-modal" data-dismiss="modal">
          <div class="lr">
        <div class="rl"> </div>
      </div>
        </div>
    <div class="container">
          <div class="row">
        <div class="col-lg-8 col-lg-offset-2">
              <div class="modal-body">
            <h3>Faiq Ahsan-HR Manager</h3>
            <img src="<c:url value="/resources/img/Faiq.JPG"></c:url>" class="img-responsive img-centered" alt="">
            <p> <b>HR Managers</b> are involved with recruitment, training, career development, compensation and benefits, employee relations, industrial relations, employment law, compliance, disciplinary and grievance issues, redundancies etc. </p>
            <button type="button" class="btn btn-default" data-dismiss="modal"><i class="fa fa-times"></i> Close</button>
          </div>
            </div>
      </div>
        </div>
  </div>
    </div>
<div class="portfolio-modal modal fade" id="portfolioModal2" tabindex="-1" role="dialog" aria-hidden="true">
      <div class="modal-content">
    <div class="close-modal" data-dismiss="modal">
          <div class="lr">
        <div class="rl"> </div>
      </div>
        </div>
    <div class="container">
          <div class="row">
        <div class="col-lg-8 col-lg-offset-2">
              <div class="modal-body">
            <h3>Ryuzaki Sultan-SME</h3>
            <img src="<c:url value="/resources/img/IMGP0220.JPG"></c:url>" class="img-responsive img-centered" alt="">
            <p> <b>Subject Matter Expert</b> or domain expert is a person who is an authority in a particular area or topic. The term domain expert is frequently used in expert systems software development, and there the term always refers to the domain other than the software domain.</p>
            <button type="button" class="btn btn-default" data-dismiss="modal"><i class="fa fa-times"></i> Close</button>
          </div>
            </div>
      </div>
        </div>
  </div>
    </div>
    <div class="portfolio-modal modal fade" id="portfolioModal3" tabindex="-1" role="dialog" aria-hidden="true">
      <div class="modal-content">
    <div class="close-modal" data-dismiss="modal">
          <div class="lr">
        <div class="rl"> </div>
      </div>
        </div>
    <div class="container">
          <div class="row">
        <div class="col-lg-8 col-lg-offset-2">
              <div class="modal-body">
            <h3>Ali-HR Personnal</h3>
            <img src="<c:url value="/resources/img/IMGP0199.JPG"></c:url>" class="img-responsive img-centered" alt="">
            <p> <b>HR Managers</b> management and human resource management are both involved in managing the members of an organization and engage in similar activities, including staffing, job analysis, planning, employee development, compensation, policy development, health and safety and employee relations. </p>
            <button type="button" class="btn btn-default" data-dismiss="modal"><i class="fa fa-times"></i> Close</button>
          </div>
            </div>
      </div>
        </div>
  </div>
    </div>
<!-- Job Modal-->
<div class="portfolio-modal modal fade" id="jobModal" tabindex="-1" role="dialog" aria-hidden="true">
 	<div class="modal-content">
		<div class="close-modal" data-dismiss="modal">
          	<div class="lr">
        		<div class="rl"> </div>
      		</div>
        </div>
              <div class="modal-body">
                            <div class="container">
                                    <div class="row">
                                            <div class="col-lg-12 text-center">
                                                    <h2>Applying for: Unity Game Development</h2>
                                                    <hr class="star-primary">
                                            </div>
                                    </div>
                                    <div class="row">
                                            <div class="col-lg-8 col-lg-offset-2"> 
                                            <form:form id="jobApply" action="jobApplication" method="post" commandName="jobApply">
                                                <div class="row control-group">
                                                    <div class="form-group col-xs-12 floating-label-form-group controls">
                                                      <label>First Name</label>
                                                      <form:input path="firstName" class="form-control" data-validation-required-message="Please enter your name."></form:input>
                                                    </div>
                                                </div>
                                                <div class="row control-group">
                                                        <div class="form-group col-xs-12 floating-label-form-group controls">
                                                          <label>Last Name</label>
                                                          <form:input path="lastName" class="form-control"  data-validation-required-message="Please enter your name."/>
                                                        </div>
                                                </div>
                                                <div class="row control-group">
                                                        <div class="form-group col-xs-12 floating-label-form-group controls">
                                                          <label>Email Address</label>
                                                          <form:input path="email" class="form-control"  data-validation-required-message="Please enter your email address."/>
                                                        </div>
                                                </div>
                                                <div class="row control-group">
                                                        <div class="form-group col-xs-12 floating-label-form-group controls">
                                                            <label>Phone Number</label>
                                                            <form:input path="email" class="form-control" data-validation-required-message="Please enter your phone number."/>
                                                        </div>
                                                </div>
                                                <div class="row control-group">
                                                        <div class="form-group col-xs-12 floating-label-form-group controls">
                                                            <label>Job Info.</label>
                                                            <form:input path="srcOfInfo" class="form-control"/>
                                                        </div>
                                                </div>
                                                <div class="row control-group">
                                                        <div class="form-group col-xs-12 floating-label-form-group controls">
                                                            <label>Address</label>
                                                            <form:textarea path="mailingAddress" rows="5" class="form-control" data-validation-required-message="Please enter your phone number."></form:textarea>
                                                        </div>
                                                </div>
                                                <div class="row control-group">
                                                        <div class="form-group col-xs-12 floating-label-form-group controls">
                                                         <label>Work Experience</label>
                                                        <form:input path="experience" class="form-control" data-validation-required-message="Please enter your exprience."/>
                                                        <p class="help-block text-danger"></p>
                                                        </div>
                                                </div>
                                                <div class="row control-group">
                                                        <div class="form-group col-xs-12 floating-label-form-group controls">
                                                            <label>Cover Letter</label>
                                                            <form:textarea path="coverLetter" class="form-control" id="coverletter"></form:textarea>
                                                        </div>
                                                </div>
                                                <div class="row control-group">
                                                        <div class="form-group col-xs-12 floating-label-form-group controls">
                                                                <label>Attach Resume</label>
                                                                <input type="file" class="form-control" placeholder="Attach Resume"
                                                                id="resume">
                                                        </div>
                                                </div>
                          <br>
                                <div id="successJob"></div>
                                        <div class="row">
                                                <div class="form-group col-xs-12">
                                                        <button type="submit" class="btn btn-success btn-lg">Send</button>
                                                </div>
                                        </div>
                                    </form:form>
                      </div>
                            </div>
              </div>
        </div>
	</div>
</div>

<!-- jQuery -->
<script src="<c:url value="/resources/vendor/jquery/jquery.min.js"></c:url>" ></script> 

<!-- Bootstrap Core JavaScript --> 
<script src="<c:url value="/resources/vendor/bootstrap/js/bootstrap.min.js"></c:url>"></script> 

<!-- Plugin JavaScript --> 
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script> 

<!-- Contact Form JavaScript --> 
<script src="<c:url value="/resources/js/jqBootstrapValidation.js"></c:url>"></script> 

<!-- Apply Job Form JavaScript -->
<!--<script src="js/Apply_Job.js"></script>-->
<!-- Theme JavaScript --> 
<script src=" <c:url value="/resources/js/freelancer.min.js"></c:url>"></script>
</body>
</html>
