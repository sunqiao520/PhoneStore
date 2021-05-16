package com.sq.phonestore.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author SunQiao
 * @create 2021-05-16 10:49
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhoneCategoryVO {
    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;
}
