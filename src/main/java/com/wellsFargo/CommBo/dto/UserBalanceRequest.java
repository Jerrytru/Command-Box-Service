package com.wellsFargo.CommBo.dto;

import com.wellsFargo.CommBo.dto.nlu.NluEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserBalanceRequest {

    private String userName;
    private String accountType;

    public UserBalanceRequest(NluEntity entity) {
        this.userName = entity.getUserName();
        this.accountType = entity.getAccountType();
    }
}
