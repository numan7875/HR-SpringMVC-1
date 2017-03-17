// JavaScript Document
$(document).ready(function(){
	"use strict";
	
	$("div#page-wrapper > div.container-fluid").load("InterviewConfirmation.html");
	
	$(".interviewCon").click(function(){
	$("#page-wrapper > .container-fluid").load("InterviewConfirmation.html");
	});
	$(".takeInterview").click(function(){
		$("#page-wrapper > .container-fluid").load("InterviewFeedback.html");
	});
	$("#profile").click(function(){
		$("div#page-wrapper > div.container-fluid").load("../LogIn-SignUp/EditProfile.html");
	});
});



