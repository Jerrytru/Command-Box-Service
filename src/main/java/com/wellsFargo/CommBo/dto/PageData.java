package com.wellsFargo.CommBo.dto;

import com.wellsFargo.CommBo.dto.nlu.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageData {
    private List<Entity> entityList;
    private String intent;
}
