package com.app.todoapp.models.response.http;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class InternalServerResponse {

    // as an example
    @Schema(type = "string" , example = "Internal Server Error")
    private String message;
}
