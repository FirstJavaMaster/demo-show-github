package com.tong.dozertestwithspringbooterror.service;

import com.tong.dozertestwithspringbooterror.entity.User;

public interface UserService {
    User findById(Long id);
}
