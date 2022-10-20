package com.wellsFargo.CommBo.intent.controller;

import com.wellsFargo.CommBo.intent.model.dto.NLUResponseData;
import com.wellsFargo.CommBo.intent.model.request.NLURequest;
import com.wellsFargo.CommBo.intent.model.request.NLURequestInput;
import com.wellsFargo.CommBo.intent.service.IntentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IntentController {
    private IntentService intentService;

    @PostMapping("/api/postintent")
    public ResponseEntity<NLUResponseData> getIntent(String message){
        return new ResponseEntity<>(intentService.parseCommand(message), HttpStatus.OK);
    }
}
