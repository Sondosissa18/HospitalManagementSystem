//package com.project.HospitalManagementSystem.controller;
//
//
//import net.bytebuddy.implementation.bind.MethodDelegationBinder;
//import org.springframework.security.authentication.AnonymousAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.parameters.P;
//import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.net.http.HttpRequest;
//import java.net.http.HttpResponse;
//import java.security.Security;
//
//@Controller
//public class LoginController {
//
//
//    @GetMapping("/login")
//    public String LoginForm(){
//
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        if(authentication == null || authentication instanceof AnonymousAuthenticationToken){
//            return "login";
//
//        }
//        return "redirect:index";
//
//    }
//
//    @GetMapping("/logout")
//    public String Logout(HttpServletRequest request, HttpServletResponse response){
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        if (auth!=null){
//            new SecurityContextLogoutHandler().logout(request,response,auth);
//        }
//    return "redirect:login";
//    }
//
//
//}
