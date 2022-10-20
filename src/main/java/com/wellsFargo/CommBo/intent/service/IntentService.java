package com.wellsFargo.CommBo.intent.service;

import com.wellsFargo.CommBo.intent.model.builders.NLURequestBuilder;
import com.wellsFargo.CommBo.intent.model.dto.NLUResponse;
import com.wellsFargo.CommBo.intent.model.request.NLURequest;

public interface IntentService {
    //parseCommand(NLURequest requestBody) make call to NLU server
    // text - String
    // return NLUResponse

    NLUResponse parseCommand(NLURequest requestBody);
    //Mono<NLUDetailsResponse> retrieveNLRUResponseMono(NLURequest requestBody);
}
