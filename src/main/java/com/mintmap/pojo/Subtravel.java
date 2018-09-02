package com.mintmap.pojo;

import java.util.Date;

public class Subtravel {
    private Integer sid;

    private Integer tid;

    private Date time;

    private String type;

    private String imghead;

    private String text;

    private String position;

    private Double longitude;

    private Double latitude;

    private Date createtime;

    public Subtravel(Integer sid, Integer tid, Date time, String type, String imghead, String text, String position, Double longitude, Double latitude, Date createtime) {
        this.sid = sid;
        this.tid = tid;
        this.time = time;
        this.type = type;
        this.imghead = imghead;
        this.text = text;
        this.position = position;
        this.longitude = longitude;
        this.latitude = latitude;
        this.createtime = createtime;
    }

    public Subtravel() {
        super();
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getImghead() {
        return imghead;
    }

    public void setImghead(String imghead) {
        this.imghead = imghead == null ? null : imghead.trim();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}