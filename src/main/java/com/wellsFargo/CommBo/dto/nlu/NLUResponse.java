package com.wellsFargo.CommBo.dto.nlu;

import com.wellsFargo.CommBo.enums.NluIntent;
import lombok.Getter;

@Getter
public class NLUResponse {
    private NluIntent intent;
    private NluEntity entities;
}
