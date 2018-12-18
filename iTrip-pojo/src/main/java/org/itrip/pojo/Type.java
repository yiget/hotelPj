package org.itrip.pojo;

public class Type {
    private Integer id;

    private String typeName;

    public Type(Integer id, String typeName) {
        this.id = id;
        this.typeName = typeName;
    }

    public Type() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }
}