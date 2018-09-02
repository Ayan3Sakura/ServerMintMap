package com.mintmap.pojo;

import java.util.Date;

public class Favour {
    private Integer favourid;

    private Integer uid;

    private Integer tid;

    private Date favourtime;

    private Date createtime;

    public Favour(Integer favourid, Integer uid, Integer tid, Date favourtime, Date createtime) {
        this.favourid = favourid;
        this.uid = uid;
        this.tid = tid;
        this.favourtime = favourtime;
        this.createtime = createtime;
    }

    public Favour() {
        super();
    }

    public Integer getFavourid() {
        return favourid;
    }

    public void setFavourid(Integer favourid) {
        this.favourid = favourid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Date getFavourtime() {
        return favourtime;
    }

    public void setFavourtime(Date favourtime) {
        this.favourtime = favourtime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}