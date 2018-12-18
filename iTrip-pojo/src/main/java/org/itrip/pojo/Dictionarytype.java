package org.itrip.pojo;

public class Dictionarytype {
    private Long id;

    private Long parentid;

    private String name;

    private Integer seq;

    private Integer haschild;

    private String property;

    public Dictionarytype(Long id, Long parentid, String name, Integer seq, Integer haschild, String property) {
        this.id = id;
        this.parentid = parentid;
        this.name = name;
        this.seq = seq;
        this.haschild = haschild;
        this.property = property;
    }

    public Dictionarytype() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentid() {
        return parentid;
    }

    public void setParentid(Long parentid) {
        this.parentid = parentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Integer getHaschild() {
        return haschild;
    }

    public void setHaschild(Integer haschild) {
        this.haschild = haschild;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property == null ? null : property.trim();
    }
}