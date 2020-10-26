package com.mmt.route.planning.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class APIResponse {
    private int statusCode;
    private String message;
    private String status;
    private Object body;
}
