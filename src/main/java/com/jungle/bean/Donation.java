package com.jungle.bean;

import java.math.BigDecimal;
import java.util.Date;

public class Donation {
    private Integer id;

    private String donationname;

    private String type;

    private BigDecimal money;

    private Date donationtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDonationname() {
        return donationname;
    }

    public void setDonationname(String donationname) {
        this.donationname = donationname == null ? null : donationname.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Date getDonationtime() {
        return donationtime;
    }

    public void setDonationtime(Date donationtime) {
        this.donationtime = donationtime;
    }
}