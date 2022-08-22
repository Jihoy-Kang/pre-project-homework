package com.codestates.preprejecthomework;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homework {

    @GetMapping("/")
    public String print(){
        return "To-do Application !" + "pull request" ;
    }
}
