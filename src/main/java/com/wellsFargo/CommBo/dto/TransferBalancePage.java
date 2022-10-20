package com.wellsFargo.CommBo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class TransferBalancePage extends PageData {
    private String transferTo;
    private String transferFrom;
    private Double amount;
}
