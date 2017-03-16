// JavaScript Document
$(document).ready(function(){
	"use strict";
	
	$(".confirm").click(function(){
		$("#confirmModal").modal();
	});
});
$( ".conForm" ).submit(function( event ) {
  	"use strict";
	$(".conSuccess").html("<div class='alert alert-success alert-dismissable'>");
	$('.conSuccess > .alert-success').html("<a href='#' class='close' data-dismiss='alert' aria-label='close'>&times;</a>").append(
		"Applicant has been called for Interview! at Local Time " + $("#timeinterview").val())
	.append("</div>");
	$('.conForm').trigger("reset");
  	event.preventDefault();
});




