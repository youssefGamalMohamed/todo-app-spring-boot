package com.app.todoapp.models.response.other.success;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class DeleteUserResponseBody {
    private boolean deletion_status;
}
