package com.controller;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import com.model.Donor;
import com.service.DonorService;
@Controller
public class DonorController {
 @Autowired
 private DonorService service;
 @GetMapping("/")
 public ModelAndView home(Model m) {
	 Donor donor = new Donor();
  m.addAttribute("donor", donor);
  ModelAndView modelAndView = new ModelAndView("register");  
  return modelAndView;  
 }
 @PostMapping("/register")
 public String register(@ModelAttribute ("donor") Donor donor, Model model) {
  service.registerDonor(donor);
  model.addAttribute("success","Registered Successfully");
  return "register";
 }
 @GetMapping("/login")
 public String loginDisplay(Model m,HttpSession session) {
  
	 Donor donor = new Donor();
  
  if (session.getAttribute("donor") != null) {
   session.invalidate();
   System.out.println("here");
   m.addAttribute("success", "You have logout Successfully!!!");
  }
  m.addAttribute("donor", donor); 
  return "login";  
 }
 @PostMapping("/login")
 public String login(@ModelAttribute ("donor") Donor donor, Model model, HttpSession session) {
	 Donor donor2 = service.loginDonor(donor);
  System.out.println("donor2"+donor2);
  if(donor2 != null) {
   System.out.println("hello");
   model.addAttribute("donor",donor2);
   session.setAttribute("donor", donor2);
   return "welcome";
  }
  if(donor2 ==null) {
  System.out.println("on");
  model.addAttribute("error", "Invalid Credentials");}
  return "login";
  
 }
}