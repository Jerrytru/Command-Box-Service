package com.wellsFargo.CommBo.service;

import com.wellsFargo.CommBo.dto.Result;
import com.wellsFargo.CommBo.dto.UserBalanceResponse;
import com.wellsFargo.CommBo.dto.UserBalanceRequest;
import com.wellsFargo.CommBo.dto.nlu.NLURequest;
import com.wellsFargo.CommBo.dto.nlu.NLUResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class IntentService {

    @Autowired
    NLUService nluService;

    public Mono<Result> parseCommand(String message) {
        return nluService.retrieveNLUResponse(new NLURequest(message)).flatMap(this::handleNluResponse);
    }

    private Mono<Result> handleNluResponse(NLUResponse response) {
        Result result = new Result();
        result.setActionType(response.getIntent().name());
        switch (response.getIntent()) {
            case openUserProfile:
                break;
            case getUserBalance:
                UserBalanceRequest request = new UserBalanceRequest(response.getEntities());
                //TODO
                result.setData(this.getUserBalance(request));
                break;
            case transferUserBalance:
                break;
            default:
                return Mono.just(result);
        }
        throw new RuntimeException("Unsupported Command");
    }

    private Mono<UserBalanceResponse> getUserBalance(UserBalanceRequest request) {
        //TODO
        UserBalanceResponse userBalance = new UserBalanceResponse();
        return  Mono.just(userBalance);
    }
}
