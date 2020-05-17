package com.bwie.dao;

import com.bwie.pojo.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @author:chenGang
 * @time:2020/5/17 20:51
 * @ms:
 */
@Repository
public interface HouseDao extends JpaRepository<House,String>, JpaSpecificationExecutor<House> {
    House getById(String id);
}
