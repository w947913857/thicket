package com.jungle.bean;

import java.util.Date;

public class Clxjorder {
    private String oid;

    private Integer cid;

    private Integer uid;

    private Date checkstartdate;

    private Date checkenddate;

    private Long total;

    private String checkperson;

    private String relperson;

    private String relphone;

    private String relemail;

    private Integer state;

    private Date reservetime;

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid == null ? null : oid.trim();
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Date getCheckstartdate() {
        return checkstartdate;
    }

    public void setCheckstartdate(Date checkstartdate) {
        this.checkstartdate = checkstartdate;
    }

    public Date getCheckenddate() {
        return checkenddate;
    }

    public void setCheckenddate(Date checkenddate) {
        this.checkenddate = checkenddate;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public String getCheckperson() {
        return checkperson;
    }

    public void setCheckperson(String checkperson) {
        this.checkperson = checkperson == null ? null : checkperson.trim();
    }

    public String getRelperson() {
        return relperson;
    }

    public void setRelperson(String relperson) {
        this.relperson = relperson == null ? null : relperson.trim();
    }

    public String getRelphone() {
        return relphone;
    }

    public void setRelphone(String relphone) {
        this.relphone = relphone == null ? null : relphone.trim();
    }

    public String getRelemail() {
        return relemail;
    }

    public void setRelemail(String relemail) {
        this.relemail = relemail == null ? null : relemail.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getReservetime() {
        return reservetime;
    }

    public void setReservetime(Date reservetime) {
        this.reservetime = reservetime;
    }
}