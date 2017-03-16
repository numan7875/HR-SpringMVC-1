// JavaScript Document


$(document).ready(function(){
	"use strict";
	$( "#jobAdForm" ).submit(function( event ) {
		$("#adSuccess").html("<div class='alert alert-success alert-dismissable'>");
		$('#adSuccess > .alert-success').html("<a href='#' class='close' data-dismiss='alert' aria-label='close'>&times;</a>").append(
			"Successfully advertised!")
		.append("</div>");
		$('#jobAdForm').trigger("reset");
		event.preventDefault();
	});
});


