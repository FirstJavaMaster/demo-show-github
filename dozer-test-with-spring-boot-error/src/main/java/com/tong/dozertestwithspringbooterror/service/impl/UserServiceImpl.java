package com.tong.dozertestwithspringbooterror.service.impl;

import com.tong.dozertestwithspringbooterror.dao.UserDao;
import com.tong.dozertestwithspringbooterror.entity.User;
import com.tong.dozertestwithspringbooterror.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao dao;

//    /**
//     * query in spring 1.x
//     */
//    @Override
//    public User findById(Long id) {
//        return dao.findOne(id);
//    }

    /**
     * query in spring 2.x
     */
    @Override
    public User findById(Long id) {
        return dao.findById(id).orElseThrow(() -> new RuntimeException("not found"));
    }
}
