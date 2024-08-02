package ru.axproject.ax_lip_gateway.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class PageDTO {

    @JsonProperty("service")
    private final String service;

    @JsonProperty("page")
    private final Integer page;
}
