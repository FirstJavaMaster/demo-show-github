package com.tong.dozertestwithspringbooterror.controller;

import com.tong.dozertestwithspringbooterror.dto.response.UserResponse;
import com.tong.dozertestwithspringbooterror.entity.User;
import com.tong.dozertestwithspringbooterror.service.UserService;
import com.tong.dozertestwithspringbooterror.util.BeanMapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/{id}")
    public Object login(@PathVariable Long id) {
        User user = userService.findById(id);
        return BeanMapperUtils.map(user, UserResponse.class);
    }
}
