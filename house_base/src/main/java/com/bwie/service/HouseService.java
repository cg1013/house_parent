package com.bwie.service;

import com.bwie.dao.HouseDao;
import com.bwie.pojo.House;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author:chenGang
 * @time:2020/5/17 20:53
 * @ms:
 */
@Service
public class HouseService {
    @Autowired
    private HouseDao houseDao;

    public List<House> queryAllHouseList() {
        return houseDao.findAll();
    }

    public void addHouse(House house) {
        houseDao.save(house);
    }

    public void deleteById(String id) {
        houseDao.deleteById(id);
    }

    @Modifying
    @Transactional
    public House updateById(House house) {
        return houseDao.save(house);
    }
}
