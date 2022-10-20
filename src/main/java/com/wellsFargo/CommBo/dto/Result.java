package com.wellsFargo.CommBo.dto;

import com.wellsFargo.CommBo.enums.NluIntent;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
public class Result {
    private boolean success = false;
    private String actionType;
    private NluIntent intent;
    private Object data;
    //transfer: {}
}
