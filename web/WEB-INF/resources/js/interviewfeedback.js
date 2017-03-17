// JavaScript Document
$(document).ready(function(){
	"use strict";
	$("#newFeedForm").submit(function(event) {
		alert("dafd");
		$(".feedSuccess").html("<div class='alert alert-success alert-dismissable'>");
		$('.feedSuccess > .alert-success').html("<a href='#' class='close' data-dismiss='alert' aria-label='close'>&times;</a>").append(
			"Feedback submitted")
		.append("</div>");
		$('#newFeedForm').trigger("reset");
		event.preventDefault();
	});
});