package com.wellsFargo.CommBo.dto;

import com.wellsFargo.CommBo.enums.NluIntents;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
public class Result {
    private boolean success = false;
    private String query;
    private String userName;
    private String actionType;
    private NluIntents intent;
    private Object data;
}
