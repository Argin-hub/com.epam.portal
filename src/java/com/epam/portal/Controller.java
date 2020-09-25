package com.epam.portal;

import org.springframework.web.bind.annotation.*;



@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("hell")
    public String sayHell(){
        return "hello_w";
    }
}
