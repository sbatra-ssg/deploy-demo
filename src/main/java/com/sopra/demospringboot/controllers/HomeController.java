package com.sopra.demospringboot.controllers;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class HomeController {
	
	@GetMapping("/DemoSpringBoot")
	public void home(HttpServletResponse response) throws IOException {
		
		response.sendRedirect("/swagger-ui/index.html");
		
	}
	@GetMapping("/home")
	public void fun() throws IOException {
		
		
	}

}
