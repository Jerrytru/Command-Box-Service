package com.wellsFargo.CommBo.intent.service;

import com.wellsFargo.CommBo.intent.model.dto.NLUResponseData;
import com.wellsFargo.CommBo.intent.model.request.NLURequest;

public interface IntentService {
    //parseCommand(NLURequest requestBody) make call to NLU server
    // text - String
    // return NLUResponse

    NLUResponseData parseCommand(String message);
    //Mono<NLUDetailsResponse> retrieveNLRUResponseMono(NLURequest requestBody);
}
