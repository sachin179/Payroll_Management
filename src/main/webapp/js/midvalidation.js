
$(document).ready(function()
{ 
if ($("#alertSuccess").text().trim() == "") 
 { 
 $("#alertSuccess").hide(); 
 } 
 $("#alertError").hide(); 
}); 



$(document).on("click", "#submit", function(event)
{ 
// Clear alerts---------------------
 $("#alertSuccess").text(""); 
 $("#alertSuccess").hide(); 
 $("#alertError").text(""); 
 $("#alertError").hide(); 
// Form validation-------------------
var status = validateItemForm(); 
if (status != true) 
 { 
 $("#alertError").text(status); 
 $("#alertError").show(); 
 return; 
 } 
 


function validateItemForm() 
{ 
// CODE
if ($("#username").val().trim() == "") 
 { 
 return "Insert Item Code."; 
 } 
// NAME



if ($("#Lastname").val().trim() == "") 
 { 
 return "Insert Item Name."; 


 }
// PRICE-------------------------------
if ($("#phone").val().trim() == "") 
 { 
 return "Insert Item Price."; 
 } 
// is numerical value
var nic = $("#itemPrice").val().trim(); 
if (!$.isNumeric(nic)) 
 { 
 return "Insert a numerical value for Item Price."; 
 } 

return true; 
}