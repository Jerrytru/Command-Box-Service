package com.wellsFargo.CommBo.service;

import com.wellsFargo.CommBo.dto.*;
import com.wellsFargo.CommBo.dto.nlu.NLURequest;
import com.wellsFargo.CommBo.dto.nlu.NLUResponse;
import com.wellsFargo.CommBo.dto.nlu.NluEntity;
import com.wellsFargo.CommBo.enums.EntityTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;

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
        result.setUserName(this.getUserName(response.getEntities()));
        switch (response.getIntent()) {
            case openUserProfile:
                PageData data = new PageData("user_profile_url");
                result.setData(data);
                break;
            case getUserBalance:
                UserBalanceRequest request = new UserBalanceRequest();
                //TODO
                result.setData(this.getUserBalance(request));
                break;
            case transferUserBalance:
                TransferBalancePage tbData = new TransferBalancePage();
                result.setData(tbData);
                break;
            default:
                throw new RuntimeException("Command Not Supported");
        }
        return Mono.just(result);
    }

    private Mono<UserBalanceResponse> getUserBalance(UserBalanceRequest request) {
        //TODO
        UserBalanceResponse userBalance = new UserBalanceResponse();
        return  Mono.just(userBalance);
    }

    private String getUserName(List<NluEntity> entities) {
        Optional<String> userName = entities.stream()
                .filter(e -> e.getEntity().name().equalsIgnoreCase(EntityTypes.Person.name()))
                .findFirst()
                .map(e -> e.getValue().toUpperCase());
        return userName.get();
    }
}
