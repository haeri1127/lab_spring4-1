package com.example.aop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.aop.dto.User;
/*
 * 로그 찍는 부분을 한 곳으로 모을 수 있다.
 * 바로 AOP를 활용하는 것이다.
 * 
 */
@RestController
@RequestMapping("/api_m1")
public class RestApiM1Controller {
	//테스트 url : http://localhost:8000/api_m1/get/10?name=test
    @GetMapping("/get/{id}")
    public void get(@PathVariable Long id, @RequestParam String name){
    	System.out.println("get call");
    	System.out.println("get call : "+id);//10
    	System.out.println("get call : "+name);//test
    }

    @PostMapping("/post")
    public void post(@RequestBody User user){
    	System.out.println("post call : "+user);    	
    }

}
