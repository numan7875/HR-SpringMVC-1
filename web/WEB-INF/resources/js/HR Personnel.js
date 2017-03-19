// JavaScript Document


$(document).ready(function(){
	"use strict";
	ajaxCall("jobAdvertisement");

	
	$(".jobAd").click(function(){
            ajaxCall("jobAdvertisement");
	});

	$(".applicants").click(function(){
            ajaxCall("applicants");
	});
	$(".interview").click(function(){
            ajaxCall("interviewStatus");
	});
	
	$("#profile").click(function(){
            ajaxCall("profile");
	});
});

function ajaxCall(action) {

	$.ajax({
		type : "GET",
		contentType : "application/json",
		url : action,
		timeout : 100000,
                cache: false,
		success : function(retPage) {
			console.log("SUCCESS: ", "");
			$("div#page-wrapper > div.container-fluid").html(retPage);
		},
		error : function(e) {
			console.log("ERROR: ", e);
			display(e);
		},
		done : function(e) {
			console.log("DONE");
		}
	});
}
