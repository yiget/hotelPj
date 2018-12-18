package org.itrip.pojo;

import java.util.Date;

public class Order {
    private Integer id;

    private Integer userid;

    private Integer ordertype;

    private String orderno;

    private String tradeno;

    private Integer hotelid;

    private String hotelname;

    private Integer roomid;

    private Integer count;

    private Integer bookingdays;

    private Date checkindate;

    private Date checkoutdate;

    private Integer orderstatus;

    private Long payamount;

    private Integer paytype;

    private String noticephone;

    private String noticeemail;

    private Integer isneedinvoice;

    private Integer invoicetype;

    private Integer invoicehead;

    private String linkusername;

    private Integer booktype;

    private Date creationdate;

    private Integer createdby;

    private Date modifydate;

    private Integer modifiedby;

    private String specialrequirement;

    public Order(Integer id, Integer userid, Integer ordertype, String orderno, String tradeno, Integer hotelid, String hotelname, Integer roomid, Integer count, Integer bookingdays, Date checkindate, Date checkoutdate, Integer orderstatus, Long payamount, Integer paytype, String noticephone, String noticeemail, Integer isneedinvoice, Integer invoicetype, Integer invoicehead, String linkusername, Integer booktype, Date creationdate, Integer createdby, Date modifydate, Integer modifiedby, String specialrequirement) {
        this.id = id;
        this.userid = userid;
        this.ordertype = ordertype;
        this.orderno = orderno;
        this.tradeno = tradeno;
        this.hotelid = hotelid;
        this.hotelname = hotelname;
        this.roomid = roomid;
        this.count = count;
        this.bookingdays = bookingdays;
        this.checkindate = checkindate;
        this.checkoutdate = checkoutdate;
        this.orderstatus = orderstatus;
        this.payamount = payamount;
        this.paytype = paytype;
        this.noticephone = noticephone;
        this.noticeemail = noticeemail;
        this.isneedinvoice = isneedinvoice;
        this.invoicetype = invoicetype;
        this.invoicehead = invoicehead;
        this.linkusername = linkusername;
        this.booktype = booktype;
        this.creationdate = creationdate;
        this.createdby = createdby;
        this.modifydate = modifydate;
        this.modifiedby = modifiedby;
        this.specialrequirement = specialrequirement;
    }

    public Order() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(Integer ordertype) {
        this.ordertype = ordertype;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public String getTradeno() {
        return tradeno;
    }

    public void setTradeno(String tradeno) {
        this.tradeno = tradeno == null ? null : tradeno.trim();
    }

    public Integer getHotelid() {
        return hotelid;
    }

    public void setHotelid(Integer hotelid) {
        this.hotelid = hotelid;
    }

    public String getHotelname() {
        return hotelname;
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname == null ? null : hotelname.trim();
    }

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getBookingdays() {
        return bookingdays;
    }

    public void setBookingdays(Integer bookingdays) {
        this.bookingdays = bookingdays;
    }

    public Date getCheckindate() {
        return checkindate;
    }

    public void setCheckindate(Date checkindate) {
        this.checkindate = checkindate;
    }

    public Date getCheckoutdate() {
        return checkoutdate;
    }

    public void setCheckoutdate(Date checkoutdate) {
        this.checkoutdate = checkoutdate;
    }

    public Integer getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(Integer orderstatus) {
        this.orderstatus = orderstatus;
    }

    public Long getPayamount() {
        return payamount;
    }

    public void setPayamount(Long payamount) {
        this.payamount = payamount;
    }

    public Integer getPaytype() {
        return paytype;
    }

    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }

    public String getNoticephone() {
        return noticephone;
    }

    public void setNoticephone(String noticephone) {
        this.noticephone = noticephone == null ? null : noticephone.trim();
    }

    public String getNoticeemail() {
        return noticeemail;
    }

    public void setNoticeemail(String noticeemail) {
        this.noticeemail = noticeemail == null ? null : noticeemail.trim();
    }

    public Integer getIsneedinvoice() {
        return isneedinvoice;
    }

    public void setIsneedinvoice(Integer isneedinvoice) {
        this.isneedinvoice = isneedinvoice;
    }

    public Integer getInvoicetype() {
        return invoicetype;
    }

    public void setInvoicetype(Integer invoicetype) {
        this.invoicetype = invoicetype;
    }

    public Integer getInvoicehead() {
        return invoicehead;
    }

    public void setInvoicehead(Integer invoicehead) {
        this.invoicehead = invoicehead;
    }

    public String getLinkusername() {
        return linkusername;
    }

    public void setLinkusername(String linkusername) {
        this.linkusername = linkusername == null ? null : linkusername.trim();
    }

    public Integer getBooktype() {
        return booktype;
    }

    public void setBooktype(Integer booktype) {
        this.booktype = booktype;
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

    public String getSpecialrequirement() {
        return specialrequirement;
    }

    public void setSpecialrequirement(String specialrequirement) {
        this.specialrequirement = specialrequirement == null ? null : specialrequirement.trim();
    }
}