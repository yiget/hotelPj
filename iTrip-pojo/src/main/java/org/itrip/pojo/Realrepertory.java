package org.itrip.pojo;

import java.util.Date;

public class Realrepertory {
    private Integer id;

    private Integer hotelld;

    private Integer roomid;

    private Date recorddate;

    private Integer store;

    private Date creationdate;

    private Integer createdby;

    public Realrepertory(Integer id, Integer hotelld, Integer roomid, Date recorddate, Integer store, Date creationdate, Integer createdby) {
        this.id = id;
        this.hotelld = hotelld;
        this.roomid = roomid;
        this.recorddate = recorddate;
        this.store = store;
        this.creationdate = creationdate;
        this.createdby = createdby;
    }

    public Realrepertory() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHotelld() {
        return hotelld;
    }

    public void setHotelld(Integer hotelld) {
        this.hotelld = hotelld;
    }

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public Date getRecorddate() {
        return recorddate;
    }

    public void setRecorddate(Date recorddate) {
        this.recorddate = recorddate;
    }

    public Integer getStore() {
        return store;
    }

    public void setStore(Integer store) {
        this.store = store;
    }

    public Date getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    public Integer getCreatedby() {
        return createdby;
    }

    public void setCreatedby(Integer createdby) {
        this.createdby = createdby;
    }
}