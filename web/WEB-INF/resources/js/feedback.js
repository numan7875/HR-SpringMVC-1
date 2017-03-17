// JavaScript Document
$(document).ready(function(){
	"use strict";
	
	$(".interview").click(function(){
		$("#feedbackModal").modal();
	});
});

$( ".feedbackForm" ).submit(function( event ) {
  	"use strict";
	$(".feedSuccess").html("<div class='alert alert-success alert-dismissable'>");
	$('.feedSuccess > .alert-success').html("<a href='#' class='close' data-dismiss='alert' aria-label='close'>&times;</a>").append(
		"Feedback submitted")
	.append("</div>");
	$('.feedbackForm').trigger("reset");
  	event.preventDefault();
});



