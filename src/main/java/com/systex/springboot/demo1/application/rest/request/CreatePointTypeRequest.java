package com.systex.springboot.demo1.application.rest.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreatePointTypeRequest {
    private String type;
    private String description;
}
