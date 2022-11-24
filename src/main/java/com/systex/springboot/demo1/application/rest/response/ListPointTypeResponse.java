package com.systex.springboot.demo1.application.rest.response;

import com.systex.springboot.demo1.domain.PointType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class ListPointTypeResponse {
    private List<PointType> pointTypes;
}
