// JavaScript Document

$(document).ready(function(){
	"use strict";
        
        console.log("Hello how you doing");
        
        
});
$('.applyButton').click(function () {
            console.log("Hello","Numan");
            var title ;
            var experience;
            var description;
            title = $(this).closest("tr").find('td:eq(0)').text();
            experience = $(this).closest("tr").find('td:eq(1)').text();
            description = $(this).closest("tr").find('td:eq(2)').text();
            var index = $(this).closest("tr").index();
            
            $(".targetText").val(title);
            $(".targetText").attr("readonly",true);
            
            $(".nextTarget").val($(this).closest("tr").find('td:eq(3)').text());
            $(".nextTarget").attr("hidden",true);
        });
