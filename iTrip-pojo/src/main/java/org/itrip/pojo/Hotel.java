package org.itrip.pojo;

import java.util.Date;
import java.util.List;

public class Hotel {
    private Integer id;

    private String hotelname;

    private Integer provinceid;

    private Integer cityid;

    private String address;

    private String details;

    private String facilities;

    private String hotelpolicy;
    private String picturepath;
    private String maxroomPrice;
    private String minroomPrice;

    private Integer hoteltype;

    private Integer hotellevel;

 

	private Integer isgrouppurchase;

    private Date creationdate;

    private Integer createdby;

    private Date modifydate;

    private Integer modifiedby;

    private String logopath;

    private Date checkintime;
    private List<House> houses;

    public List<House> getHouses() {
		return houses;
	}

	public void setHouses(List<House> houses) {
		this.houses = houses;
	}

	public Hotel(Integer id, String hotelname, Integer provinceid, Integer cityid, String address, String details, String facilities, String hotelpolicy, Integer hoteltype, Integer hotellevel, Integer isgrouppurchase, Date creationdate, Integer createdby, Date modifydate, Integer modifiedby, String logopath, Date checkintime) {
        this.id = id;
        this.hotelname = hotelname;
        this.provinceid = provinceid;
        this.cityid = cityid;
        this.address = address;
        this.details = details;
        this.facilities = facilities;
        this.hotelpolicy = hotelpolicy;
        this.hoteltype = hoteltype;
        this.hotellevel = hotellevel;
        this.isgrouppurchase = isgrouppurchase;
        this.creationdate = creationdate;
        this.createdby = createdby;
        this.modifydate = modifydate;
        this.modifiedby = modifiedby;
        this.logopath = logopath;
        this.checkintime = checkintime;
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
    public String getPicturepath() {
 		return picturepath;
 	}

 	public void setPicturepath(String picturepath) {
 		this.picturepath = picturepath;
 	}

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
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities == null ? null : facilities.trim();
    }

    public String getHotelpolicy() {
        return hotelpolicy;
    }

    public void setHotelpolicy(String hotelpolicy) {
        this.hotelpolicy = hotelpolicy == null ? null : hotelpolicy.trim();
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

    public String getLogopath() {
        return logopath;
    }

    public void setLogopath(String logopath) {
        this.logopath = logopath == null ? null : logopath.trim();
    }

    public Date getCheckintime() {
        return checkintime;
    }

    public void setCheckintime(Date checkintime) {
        this.checkintime = checkintime;
    }
}