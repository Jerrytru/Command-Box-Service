package com.wellsFargo.CommBo.dto.nlu;

import com.wellsFargo.CommBo.enums.EntityTypes;
import lombok.Getter;

@Getter
public class NluEntity {

    private EntityTypes entity;
    private int start;
    private int end;
    private String value;
    private String confidence_entity;
    private String extractor;

}
