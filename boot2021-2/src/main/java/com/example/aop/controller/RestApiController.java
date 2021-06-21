package com.example.aop.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.aop.annotation.Decode;
import com.example.aop.annotation.Timer;
import com.example.aop.dto.User;

@RestController
@RequestMapping("/api")
public class RestApiController {

    @GetMapping("/get/{id}")
    public String get(@PathVariable Long id, @RequestParam String name){
        // TODO

        return id+ " "+ name;
    }

    @PostMapping("/post")
    public User post(@RequestBody User user){


        return user;
    }
    //테스트시 메소드는 DELETE사용함.
    @Timer
    @DeleteMapping("/delete")
    public void delete() throws InterruptedException {
    	//스프링에서 제공하는 클래스-이것 대신 @Timer 하나로 끝낸다
        //StopWatch stopWatch = new StopWatch();
        //stopWatch.start();   	
        // db logic 데이터베이스에서 삭제하는데 2초 걸린다고 가정해 본다.
        Thread.sleep(1000 * 2);
        //stopWatch.stop();
        //System.out.println("total time : "+stopWatch.getTotalTimeSeconds());
    }

    @Decode
    @PutMapping("/put")
    public User put(@RequestBody User user){
        System.out.println("put");
        System.out.println(user);
        return user;
    }

}
