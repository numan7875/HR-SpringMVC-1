// JavaScript Document


$(document).ready(function(){
	"use strict";
	
	$("div#page-wrapper > div.container-fluid").load("JobAdvertisement.html");
	
	
	$( "#jobAdForm" ).submit(function( event ) {
		$("#adSuccess").html("<div class='alert alert-success alert-dismissable'>");
		$('#adSuccess > .alert-success').html("<a href='#' class='close' data-dismiss='alert' aria-label='close'>&times;</a>").append(
			"Successfully advertised!")
		.append("</div>");
		$('#jobAdForm').trigger("reset");
		event.preventDefault();
	});
	
	$(".jobAd").click(function(){
		$("div#page-wrapper > div.container-fluid").load("JobAdvertisement.html");
	});

	$(".applicants").click(function(){
		$("div#page-wrapper > div.container-fluid").load("JobApplicants.html");
	});
	$(".interview").click(function(){
		$("div#page-wrapper > div.container-fluid").load("InterviewStatus.html");
	});
	
	$("#profile").click(function(){
		$("div#page-wrapper > div.container-fluid").load("../LogIn-SignUp/EditProfile.html");
	});
});


