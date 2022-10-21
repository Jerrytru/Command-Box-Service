package com.wellsFargo.CommBo.dto.nlu;

import com.wellsFargo.CommBo.enums.NluIntents;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Data
public class NLUResponse {
    String text;
    private Intent intent;
    private List<Entity> entities;
}
