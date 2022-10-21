package com.wellsFargo.CommBo.controller;

import com.wellsFargo.CommBo.dto.Query;
import com.wellsFargo.CommBo.dto.Result;
import com.wellsFargo.CommBo.service.IntentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("intent")
public class CommandBoxController {

    @Autowired
    private IntentService intentService;

    @PostMapping("/postCommand")
    public Result postCommand(@RequestBody Query data){
        Result result = intentService.parseCommand(data.getMessage());
        return result;
    }
}
