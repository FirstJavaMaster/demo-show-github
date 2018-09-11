package com.tong.dozertestwithspringbooterror.dao;


import com.tong.dozertestwithspringbooterror.entity.Corporation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CorporationDao extends JpaRepository<Corporation, Long> {

}
