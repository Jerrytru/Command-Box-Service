package com.wellsFargo.CommBo.intent.model.request;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode
@ToString
public class NLURequestInput {
    private String message;
}
