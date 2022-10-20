package com.wellsFargo.CommBo.intent.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("intent")
public class IntentController {

    @PostMapping("/postintent")
    public String postIntent(@RequestBody String message){
        return message;
    }
}
