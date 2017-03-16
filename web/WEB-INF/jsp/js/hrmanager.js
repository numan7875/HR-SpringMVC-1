// JavaScript Document

$(document).ready(function(){
	"use strict";
	$("div#page-wrapper > div.container-fluid").load("InterviewConfirm.html");

	$(".interview").click(function(){
		$("div#page-wrapper > div.container-fluid").load("InterviewConfirm.html");
	});	
	$(".feedForm").click(function(){
		$("div#page-wrapper > div.container-fluid").load("FeedbackForm.html");
	});	
	$("#profile").click(function(){
		$("div#page-wrapper > div.container-fluid").load("../LogIn-SignUp/EditProfile.html");
	});
});