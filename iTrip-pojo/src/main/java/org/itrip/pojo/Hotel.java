package org.itrip.pojo;

import java.util.Date;

public class Hotel {
    private Integer id;

    private String hotelname;
    
    private String picturepath;

    private Integer provinceid;

    private String maxroomPrice;
    
    private String minroomPrice;

	

	public String getMaxroomPrice() {
		return maxroomPrice;
	}

	public void setMaxroomPrice(String maxroomPrice) {
		this.maxroomPrice = maxroomPrice;
	}

	public String getMinroomPrice() {
		return minroomPrice;
	}

	public void setMinroomPrice(String minroomPrice) {
		this.minroomPrice = minroomPrice;
	}

	

	private Integer cityid;

    private String address;

    private Integer hoteltype;

    private Integer hotellevel;

    private Integer isgrouppurchase;

    private Date creationdate;

    private Integer createdby;

    private Date modifydate;

    private Integer modifiedby;

    public Hotel(Integer id, String hotelname, Integer provinceid, Integer cityid, String address, Integer hoteltype, Integer hotellevel, Integer isgrouppurchase, Date creationdate, Integer createdby, Date modifydate, Integer modifiedby) {
        this.id = id;
        this.hotelname = hotelname;
        this.provinceid = provinceid;
        this.cityid = cityid;
        this.address = address;
        this.hoteltype = hoteltype;
        this.hotellevel = hotellevel;
        this.isgrouppurchase = isgrouppurchase;
        this.creationdate = creationdate;
        this.createdby = createdby;
        this.modifydate = modifydate;
        this.modifiedby = modifiedby;
    }

    public Hotel() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHotelname() {
        return hotelname;
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname == null ? null : hotelname.trim();
    }

    public Integer getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
    }

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getHoteltype() {
        return hoteltype;
    }

    public void setHoteltype(Integer hoteltype) {
        this.hoteltype = hoteltype;
    }

    public Integer getHotellevel() {
        return hotellevel;
    }
    public String getPicturepath() {
		return picturepath;
	}

	public void setPicturepath(String picturepath) {
		this.picturepath = picturepath;
	}
    public void setHotellevel(Integer hotellevel) {
        this.hotellevel = hotellevel;
    }

    public Integer getIsgrouppurchase() {
        return isgrouppurchase;
    }

    public void setIsgrouppurchase(Integer isgrouppurchase) {
        this.isgrouppurchase = isgrouppurchase;
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
    
}