package com.mintmap.pojo;

import java.util.Date;

public class Travel {
    private Integer tid;

    private Integer uid;

    private String tname;

    private Date createtime;

    private Date endtime;

    private String coverimg;

    private Integer ispublic;

    private Long count;

    private Long favour;

    public Travel(Integer tid, Integer uid, String tname, Date createtime, Date endtime, String coverimg, Integer ispublic, Long count, Long favour) {
        this.tid = tid;
        this.uid = uid;
        this.tname = tname;
        this.createtime = createtime;
        this.endtime = endtime;
        this.coverimg = coverimg;
        this.ispublic = ispublic;
        this.count = count;
        this.favour = favour;
    }

    public Travel() {
        super();
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getCoverimg() {
        return coverimg;
    }

    public void setCoverimg(String coverimg) {
        this.coverimg = coverimg == null ? null : coverimg.trim();
    }

    public Integer getIspublic() {
        return ispublic;
    }

    public void setIspublic(Integer ispublic) {
        this.ispublic = ispublic;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Long getFavour() {
        return favour;
    }

    public void setFavour(Long favour) {
        this.favour = favour;
    }
}