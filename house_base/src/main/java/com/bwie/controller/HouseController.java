package com.bwie.controller;

import com.bwie.pojo.House;
import com.bwie.service.HouseService;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author:chenGang
 * @time:2020/5/17 20:54
 * @ms:
 */
@RestController
@RequestMapping("/house")
@CrossOrigin
public class HouseController {
    @Autowired
    private HouseService houseService;

    /**
     * 查询
     */
    @GetMapping
    public Result queryAllHouseList(){
        List<House> houses = houseService.queryAllHouseList();
        return new Result(true, StatusCode.OK,"查询成功",houses);
    }
    /**
     * 添加
     */
    @PostMapping
    public Result addHouse(@RequestBody House house){
        houseService.addHouse(house);
        return new Result(true,StatusCode.OK,"添加成功");
    }
    /**
     * 删除
     */
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable("id")String id){
        houseService.deleteById(id);
        return new Result(true,StatusCode.OK,"删除成功");
    }
    /**
     * 修改
     */
    @PutMapping("/{id}")
    public Result updateById(@RequestBody House house,@PathVariable("id") String id){
        house.setId(id);
        houseService.updateById(house);
        return new Result(true,StatusCode.OK,"修改成功");
    }
}
