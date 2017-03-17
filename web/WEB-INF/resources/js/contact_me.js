// JavaScript Document

$( "#contactForm" ).submit(function( event ) {
  	"use strict";
	$(".successContact").html("<div class='alert alert-success alert-dismissable'>");
	$('.successContact > .alert-success').html("<a href='#' class='close' data-dismiss='alert' aria-label='close'>&times;</a>").append(
		"Message has been sent.")
	.append("</div>");
	$('#contactForm').trigger("reset");
  	event.preventDefault();
});