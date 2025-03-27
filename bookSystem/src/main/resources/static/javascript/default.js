/**
 * 	 default.js
 */

$(function(){ // window.onload=function(){}
	
	$("#menuToggle").click(function(){ 
		$(".menuShow").toggle();
		$(".menuHide").toggle();
		var left = $("#userBox").css("left");
		left = Math.abs(parseInt(left));
		console.log(left);
		$("#userBox").css("left", (left-125)+"px");
	});

});