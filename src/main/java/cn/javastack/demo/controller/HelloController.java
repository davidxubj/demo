package cn.javastack.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/helloworld")
    public String HelloWorld() {
        return "Hello World!, My mame is david. I'm very OK. ";
    }
}