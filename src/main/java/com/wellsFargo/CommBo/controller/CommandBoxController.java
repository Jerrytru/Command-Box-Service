package com.wellsFargo.CommBo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("intent")
public class CommandBoxController {

    @PostMapping("/postCommand")
    public String postCommand(@RequestBody String message){
        //TODO
        return message;
    }
}
