package com.example.universitymanagement.dtos;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Getter
@NoArgsConstructor
@ToString
public final class ApiResponse {

    private Map<String, Object> data = new HashMap<>();
    private Map<String, Object> error = new HashMap<>();

    public ApiResponse(String key, Object value) {
        System.out.println("key = "+key+"  value = "+value);
        this.data.put(key, value);
    }

    public ApiResponse addData(String key, Object value) {
        this.data.put(key, value);
        return this;
    }


    public ApiResponse addError(String key, Object value) {
        this.error.put(key, value);
        return this;
    }

}
