package org.itrip.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class House {
    private Integer id;

    private Integer hotelid;

    private String roomtitle;

    private BigDecimal roomprice;

    private Integer roombedtypeid;

    private Integer ishavingbreakfast;

    private Integer ishavingbathroom;

    private Integer ishavingbroadband;

    private Integer paytype;

    private BigDecimal satisfaction;

    private Integer isbook;

    private Integer iscancel;

    private Integer istimelyresponse;

    private Date creationdate;

    private Integer createdby;

    private Date modifydate;

    private Integer modifiedby;

    private Integer store;


    public House(Integer id, Integer hotelid, String roomtitle, BigDecimal roomprice, Integer roombedtypeid, Integer ishavingbreakfast, Integer ishavingbathroom, Integer ishavingbroadband, Integer paytype, BigDecimal satisfaction, Integer isbook, Integer iscancel, Integer istimelyresponse, Date creationdate, Integer createdby, Date modifydate, Integer modifiedby, Integer store) {
        this.id = id;
        this.hotelid = hotelid;
        this.roomtitle = roomtitle;
        this.roomprice = roomprice;
        this.roombedtypeid = roombedtypeid;
        this.ishavingbreakfast = ishavingbreakfast;
        this.ishavingbathroom = ishavingbathroom;
        this.ishavingbroadband = ishavingbroadband;
        this.paytype = paytype;
        this.satisfaction = satisfaction;
        this.isbook = isbook;
        this.iscancel = iscancel;
        this.istimelyresponse = istimelyresponse;
        this.creationdate = creationdate;
        this.createdby = createdby;
        this.modifydate = modifydate;
        this.modifiedby = modifiedby;
        this.store = store;
    }

    public House() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHotelid() {
        return hotelid;
    }

    public void setHotelid(Integer hotelid) {
        this.hotelid = hotelid;
    }

    public String getRoomtitle() {
        return roomtitle;
    }

    public void setRoomtitle(String roomtitle) {
        this.roomtitle = roomtitle == null ? null : roomtitle.trim();
    }

    public BigDecimal getRoomprice() {
        return roomprice;
    }

    public void setRoomprice(BigDecimal roomprice) {
        this.roomprice = roomprice;
    }

    public Integer getRoombedtypeid() {
        return roombedtypeid;
    }

    public void setRoombedtypeid(Integer roombedtypeid) {
        this.roombedtypeid = roombedtypeid;
    }

    public Integer getIshavingbreakfast() {
        return ishavingbreakfast;
    }

    public void setIshavingbreakfast(Integer ishavingbreakfast) {
        this.ishavingbreakfast = ishavingbreakfast;
    }

    public Integer getIshavingbathroom() {
        return ishavingbathroom;
    }

    public void setIshavingbathroom(Integer ishavingbathroom) {
        this.ishavingbathroom = ishavingbathroom;
    }

    public Integer getIshavingbroadband() {
        return ishavingbroadband;
    }

    public void setIshavingbroadband(Integer ishavingbroadband) {
        this.ishavingbroadband = ishavingbroadband;
    }

    public Integer getPaytype() {
        return paytype;
    }

    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }

    public BigDecimal getSatisfaction() {
        return satisfaction;
    }

    public void setSatisfaction(BigDecimal satisfaction) {
        this.satisfaction = satisfaction;
    }

    public Integer getIsbook() {
        return isbook;
    }

    public void setIsbook(Integer isbook) {
        this.isbook = isbook;
    }

    public Integer getIscancel() {
        return iscancel;
    }

    public void setIscancel(Integer iscancel) {
        this.iscancel = iscancel;
    }

    public Integer getIstimelyresponse() {
        return istimelyresponse;
    }

    public void setIstimelyresponse(Integer istimelyresponse) {
        this.istimelyresponse = istimelyresponse;
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

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public Integer getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(Integer modifiedby) {
        this.modifiedby = modifiedby;
    }

    public Integer getStore() {
        return store;
    }

    public void setStore(Integer store) {
        this.store = store;
    }

}