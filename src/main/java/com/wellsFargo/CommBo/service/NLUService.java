package com.wellsFargo.CommBo.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wellsFargo.CommBo.dto.nlu.NLURequest;
import com.wellsFargo.CommBo.dto.nlu.NLUResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class NLUService {

    @Autowired
    WebClient commandWebClient;



    public Mono<NLUResponse> retrieveNLUResponse(NLURequest request) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            System.out.println(objectMapper.writeValueAsString(request));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return this.commandWebClient.post().uri("/model/parse")
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(request)
                .retrieve().bodyToMono(NLUResponse.class);
    }
}
