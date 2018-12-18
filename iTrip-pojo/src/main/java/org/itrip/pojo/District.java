package org.itrip.pojo;

public class District {
    private Integer id;

    private Integer ctid;

    private String districtname;

    public District(Integer id, Integer ctid, String districtname) {
        this.id = id;
        this.ctid = ctid;
        this.districtname = districtname;
    }

    public District() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCtid() {
        return ctid;
    }

    public void setCtid(Integer ctid) {
        this.ctid = ctid;
    }

    public String getDistrictname() {
        return districtname;
    }

    public void setDistrictname(String districtname) {
        this.districtname = districtname == null ? null : districtname.trim();
    }
}