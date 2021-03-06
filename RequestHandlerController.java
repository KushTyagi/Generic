package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Userentity;
import com.example.demo.service.User;

@RestController
public class RequestHandlerController<T> {
    
	@Autowired
	User<Userentity> usr;
	
	
	 @PostMapping("api/createuser") 
	 public String createUser(@RequestBody Userentity user){ 
	 usr.createUser(user); 
	 
	 return "Success"; 
	 }
	 
	
	
	 @GetMapping("api/getuser") 
	 public Object fetchAll() {
	   return usr.getUser();
	 }
	 
	@PutMapping("api/putuser")
	public void Update(@RequestBody Userentity user, @RequestParam long id) {
		usr.Update(user, id);
	}
}
