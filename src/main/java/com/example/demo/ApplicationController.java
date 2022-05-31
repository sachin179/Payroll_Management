 package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Admin;
import com.example.demo.model.PaySlip;
import com.example.demo.model.User;
import com.example.demo.model.Medicine;
import com.example.demo.model.Test;
import com.example.demo.services.AdminService;
import com.example.demo.services.PaySlipServices;
import com.example.demo.services.UserService;
import com.example.demo.services.MedicineService;
import com.example.demo.services.TestService;

@Controller
public class ApplicationController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private MedicineService medicineService;
	
	
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private PaySlipServices payService;
	
	@Autowired
	private TestService testService;
	
	@ResponseBody
	@RequestMapping("/home")
	public String hello() {
		return "welcome";
	}
	@RequestMapping("/welcome")
	public String welcome(HttpServletRequest req)
	{
		req.setAttribute("mode", "MODE_HOME");
		return "welcomeemployee";
	}
	
	@RequestMapping("/register")
	public String registration(HttpServletRequest req) {
		return "register";
	}
	@RequestMapping("/addNewMedi")
	public String addNewMedition(HttpServletRequest req) {
		return "addNewMedi";
	}
	@RequestMapping("/lab")
	public String labtion(HttpServletRequest req) {
		return "lab";
	}
	@RequestMapping("/allMedicine")
	public String allMedicines(HttpServletRequest req) {
		return "allMedicine";
	}
	
	@RequestMapping("/alltest")
	public String alltests(HttpServletRequest req) {
		return "alltest";
	}
	@RequestMapping("/cbctestdetails")
	public String cbctestdetail(HttpServletRequest req) {
		return "cbctestdetails";
	}
	
	
	@RequestMapping("/save-user")
	public String saveUser(@ModelAttribute User user,BindingResult bindingresult, HttpServletRequest request) {
		userService.saveMyUser(user);
		request.setAttribute("users", userService.showAllUsers());
		request.setAttribute("mode", "MODE_HOME");
		return "allusers";
	}
	
	@RequestMapping("/save-test")
	public String savetest(@ModelAttribute Test test,BindingResult bindingresult, HttpServletRequest request) {
			testService.saveMytest(test);
			System.out.println("hello im null");
		
		   request.setAttribute("tests", testService.showAllTest());
		   request.setAttribute("mode", "MODE_HOME");
		   return "alltest";
	}
	
	@RequestMapping("/save-medicine")
	public String savemedicine(@ModelAttribute Medicine medicine,BindingResult bindingresult, HttpServletRequest request) {
		medicineService.saveMymedicine(medicine);
		request.setAttribute("medicines", medicineService.showAllmedicine());
		request.setAttribute("mode", "MODE_HOME");
		return "allMedicine";
	}
	
	@RequestMapping("/delete-patient")
	public String deletePatient(@RequestParam int id,HttpServletRequest req) {
		medicineService.deletemyPatient(id);
		req.setAttribute("medicines", medicineService.showAllmedicine());
		return "allMedicine";
	}
	@RequestMapping("/delete-user")
	public String deleteUser(@RequestParam int id,HttpServletRequest req) {
		userService.deleteMyUser(id);
		req.setAttribute("users", userService.showAllUsers());
		return "allusers";
	}
	@RequestMapping("/delete-test")
	public String deletest(@RequestParam int id,HttpServletRequest req) {
		testService.deletemytest(id);
		req.setAttribute("tests", testService.showAllTest());
		return "alltest";
	}
	@RequestMapping("/edit-user")
	public String editUser(@RequestParam String username, HttpServletRequest req) {
		req.setAttribute("user", userService.editUser(username));
		return "updateuser";
	}
	
	@RequestMapping("/edit-patient")
	public String editPatient(@RequestParam String username, HttpServletRequest req) {
		req.setAttribute("medicine", medicineService.editPatient(username));
		return "UdateMedicine";
	}
	
	
	///////////////////////////////////////////
	
	@RequestMapping("/edit-test")
	public String edittest(@RequestParam String id, HttpServletRequest req) {
		req.setAttribute("test",testService.edittest(id));
		return "Updatetest";
	}
	
	@RequestMapping("/login")
	public String login(HttpServletRequest req) {
		req.setAttribute("mode", "MODE_LOGIN");
		return "welcomeemployee";
	}
	
	@RequestMapping("/login-user")
	public String loginUser(@ModelAttribute User user, HttpServletRequest req)
	{
		if(userService.findByUsernameAndPassword(user.getUsername(), user.getPassword()) != null)
		{
			return "homepage";
		}
		else {
		req.setAttribute("error", "Invalid Username or Password");
		req.setAttribute("mode", "MODE_LOGIN");
		return "welcomeemployee";
		}
	}
	
	@RequestMapping("/")
	public String homepage() {
		return "login";
	}
	
	@RequestMapping("/admin")
	public String loginadmin(@ModelAttribute Admin admin, HttpServletRequest req)
	{
		if(adminService.findByEmailAndPassword(admin.getEmail(), admin.getPassword()) != null)
		{
			return "welcomeemployee";
		}
		else {
		return "login";
		}
	}
	
	@RequestMapping("/all-users")
	public String allusers(HttpServletRequest req) {
		req.setAttribute("users", userService.showAllUsers());
		return "allusers";
	}
	////////////////////
	
	@RequestMapping("/all-medicine")
	public String allMedicine(HttpServletRequest req) {
		req.setAttribute("medicines",  medicineService.showAllmedicine());
		return "allMedicine";
	}
	
	@RequestMapping("/all-test")
	public String alltest(HttpServletRequest req) {
		req.setAttribute("tests",  testService.showAllTest());
		return "alltest";
	}
	
	@RequestMapping("/manage")
	public String manage(HttpServletRequest req) {
		req.setAttribute("users", userService.showAllUsers());
		return "manage";
	}
	
	
	
	
//	@RequestMapping("/manage")
//	public String lab(HttpServletRequest req) {
//		req.setAttribute("users", userService.showAllUsers());
//		return "lab";
//	}
	
	
	
	@RequestMapping("/save-payslip")
	public String savepayslip(@ModelAttribute PaySlip payslip,BindingResult bindingresult,HttpServletRequest req, @RequestParam String email, @RequestParam String year, @RequestParam String month,@RequestParam String deduction){
		
		req.setAttribute("user", userService.findByEmail(email));
		req.setAttribute("month", month);
		req.setAttribute("year", year);
		req.setAttribute("deduction", deduction);
		payService.savePayslip(payslip);
		return "generate";
	}
	
	

}
