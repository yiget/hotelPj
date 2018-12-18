package org.itrip.pojo;

public class Picture {
    private Integer pictureid;

    private String picturepath;

    private Integer hotelid;

    public Picture(Integer pictureid, String picturepath, Integer hotelid) {
        this.pictureid = pictureid;
        this.picturepath = picturepath;
        this.hotelid = hotelid;
    }

    public Picture() {
        super();
    }

    public Integer getPictureid() {
        return pictureid;
    }

    public void setPictureid(Integer pictureid) {
        this.pictureid = pictureid;
    }

    public String getPicturepath() {
        return picturepath;
    }

    public void setPicturepath(String picturepath) {
        this.picturepath = picturepath == null ? null : picturepath.trim();
    }

    public Integer getHotelid() {
        return hotelid;
    }

    public void setHotelid(Integer hotelid) {
        this.hotelid = hotelid;
    }
}