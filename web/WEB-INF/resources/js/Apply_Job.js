// JavaScript Document

$( "#jobApply" ).submit(function( event ) {
  	"use strict";
	$("#successJob").html("<div class='alert alert-success alert-dismissable'>");
	$('#successJob > .alert-success').html("<a href='#' class='close' data-dismiss='alert' aria-label='close'>&times;</a>").append(
		"Job Application has been sent.")
	.append("</div>");
	$('#jobApply').trigger("reset");
  	event.preventDefault();
});