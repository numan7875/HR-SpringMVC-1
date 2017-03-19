// JavaScript Document

$( "#passSend" ).submit(function( event ) {
  	"use strict";
	$("#sendSuccess").html("<div class='alert alert-success alert-dismissable'>");
	$('#sendSuccess > .alert-success').html("<a href='#' class='close' data-dismiss='alert' aria-label='close'>&times;</a>").append(
		"New Password has been sent to your Email")
	.append("</div>");
	$('#passSend').trigger("reset");
  	event.preventDefault();
});
//$( ".form-signin" ).submit(function( event ) {
//  	"use strict";
//	var user = $("#inputEmail").val();
//	if(user === "sme@a"){
//		$(location).attr("href","../SME/Home.html");
//	}
//	else if(user === "person@a"){
//		$(location).attr("href","../HR Personnal/Home.html");
//	}
//	else if(user === "manage@a"){
//		$(location).attr("href","../HR Manager/Home.html");
//	}
//  	event.preventDefault();
//});
