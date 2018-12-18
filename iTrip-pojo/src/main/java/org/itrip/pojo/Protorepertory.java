package org.itrip.pojo;

public class Protorepertory {
    private Integer id;

    private Integer producttype;

    private Integer productid;

    private Integer store;

    public Protorepertory(Integer id, Integer producttype, Integer productid, Integer store) {
        this.id = id;
        this.producttype = producttype;
        this.productid = productid;
        this.store = store;
    }

    public Protorepertory() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProducttype() {
        return producttype;
    }

    public void setProducttype(Integer producttype) {
        this.producttype = producttype;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getStore() {
        return store;
    }

    public void setStore(Integer store) {
        this.store = store;
    }
}