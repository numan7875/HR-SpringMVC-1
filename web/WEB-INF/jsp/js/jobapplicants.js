// JavaScript Document


$(document).ready(function(){
	"use strict";

	$(".review").click(function(){
        $("#myModal").modal();
    });
	
	$( ".smeForm" ).submit(function( event ) {
		$(".smeSuccess").html("<div class='alert alert-success alert-dismissable'>");
		$('.smeSuccess > .alert-success').html("<a href='#' class='close' data-dismiss='alert' aria-label='close'>&times;</a>").append(
			"Successfully sent to SME")
		.append("</div>");
		$('.smeForm').trigger("reset");
		event.preventDefault();
	});
});


