package com.wellsFargo.CommBo.service;

import com.wellsFargo.CommBo.dto.*;
import com.wellsFargo.CommBo.dto.nlu.Entity;
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

    public Result parseCommand(String message) {
        return nluService.retrieveNLUResponse(NLURequest.builder().text(message).build()).flatMap(this::handleNluResponse).block();
    }

    private Mono<Result> handleNluResponse(NLUResponse response) {
        Result result = new Result();
        result.setActionType(response.getIntent().getName());
        result.setUserName(this.getUserName(response.getEntities()));
        PageData data = new PageData();
        data.setEntityList(response.getEntities());
        data.setIntent(response.getIntent().getName());
        result.setData(data);
        /*switch (response.getIntent().getName()) {
            case "transfer_funds":
                PageData data = new PageData();
                data.setEntityList(response.getEntities());
                data.setIntent(response.getIntent().getName());
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
        }*/
        return Mono.just(result);
    }

    private Mono<UserBalanceResponse> getUserBalance(UserBalanceRequest request) {
        //TODO
        UserBalanceResponse userBalance = new UserBalanceResponse();
        return  Mono.just(userBalance);
    }

    private String getUserName(List<Entity> entities) {
        Optional<String> userName = entities.stream()
                .filter(e -> e.getEntity().equalsIgnoreCase(EntityTypes.Person.name()))
                .findFirst()
                .map(e -> e.getValue());
        return userName.get();
    }
}
