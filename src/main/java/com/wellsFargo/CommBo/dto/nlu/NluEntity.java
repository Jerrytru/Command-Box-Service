package com.wellsFargo.CommBo.dto.nlu;

import lombok.Getter;

@Getter
public class NluEntity {
    String userName;
    String transferTo;
    String transferFrom;
    Double amount;
    String pageName;
    String accountType;
    String noteMessage;
    String recommendationType;

}
