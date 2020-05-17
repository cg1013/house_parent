package com.bwie.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.ws.Service;

/**
 * @author:chenGang
 * @time:2020/5/17 20:46
 * @ms:
 */
@Entity
@Table(name = "t_house")
public class House {
    @Id
    private String id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "lou_num")
    private String louNum;

    @Column(name = "unit_num")
    private String unitNum;

    @Column(name = "room_num")
    private String roomNum;

    private String address;

    @Column(name = "create_time")
    private String createTime;

    private String phone;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLouNum() {
        return louNum;
    }

    public void setLouNum(String louNum) {
        this.louNum = louNum;
    }

    public String getUnitNum() {
        return unitNum;
    }

    public void setUnitNum(String unitNum) {
        this.unitNum = unitNum;
    }

    public String getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
