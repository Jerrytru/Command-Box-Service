package com.wellsFargo.CommBo.dto.nlu;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Entity {

    String entity;
    Integer start;
    Integer end;
    BigDecimal confidence_entity;
    String value;
    String extractor;
    String role;
}
