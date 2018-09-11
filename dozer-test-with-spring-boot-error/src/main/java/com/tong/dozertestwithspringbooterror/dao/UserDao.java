package com.tong.dozertestwithspringbooterror.dao;


import com.tong.dozertestwithspringbooterror.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {

}
