package com.wellsFargo.CommBo.service;

import com.wellsFargo.CommBo.dto.nlu.NLURequest;
import com.wellsFargo.CommBo.dto.nlu.NLUResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class NLUService {

    private final WebClient webClient;

    public NLUService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("nlu_url_root").build();
    }

    public Mono<NLUResponse> retrieveNLUResponse(NLURequest request) {
        return this.webClient.post().uri("/{name}/details")
                .retrieve().bodyToMono(NLUResponse.class);
    }
}
