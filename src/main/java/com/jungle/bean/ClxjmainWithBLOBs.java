package com.jungle.bean;

public class ClxjmainWithBLOBs extends Clxjmain {
    private String introduction;

    private String abbotresume;

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getAbbotresume() {
        return abbotresume;
    }

    public void setAbbotresume(String abbotresume) {
        this.abbotresume = abbotresume == null ? null : abbotresume.trim();
    }
}