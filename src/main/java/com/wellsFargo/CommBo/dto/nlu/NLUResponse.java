package com.wellsFargo.CommBo.dto.nlu;

import com.wellsFargo.CommBo.enums.NluIntents;
import lombok.Getter;

import java.util.List;

@Getter
public class NLUResponse {
    private NluIntents intent;
    private List<NluEntity> entities;
}
