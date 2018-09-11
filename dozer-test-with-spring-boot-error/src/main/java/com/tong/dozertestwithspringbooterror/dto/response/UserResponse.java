package com.tong.dozertestwithspringbooterror.dto.response;

import com.github.dozermapper.core.Mapping;
import lombok.Data;

import java.util.Date;

@Data
public class UserResponse {
    private Long id;

    @Mapping("corporation.id")
    private Long corporationId;

    private String userName;
}
