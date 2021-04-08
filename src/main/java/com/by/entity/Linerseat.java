package com.by.entity;

public class Linerseat {
    private String linerseatSeq;

    /**
     * 班次日期
     */
    private String linerDate;

    /**
     * 班次号
     */
    private String linerId;

    /**
     * 座位号
     */
    private Integer seatId;

    /**
     * 票号
     */
    private String ticketId;

    /**
     * 座位状态：(0禁售,1可售,2已售,3预留)
     */
    private Integer seatState;

    /**
     * 席位类别：(0表示本地1表示网售)
     */
    private Integer seatType;

    /**
     * 售票机构名称
     */
    private String saleMacName;

    /**
     * 机构简写
     */
    private String macShorname;

    /**
     * 售票人员姓名
     */
    private String userName;

    private String remark;

    private String lastupdateTime;

    /***
     * 上次记录锁位时间
     */
    private String recordTime;

    public String getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(String recordTime) {
        this.recordTime = recordTime;
    }

    public String getLinerseatSeq() {
        return linerseatSeq;
    }

    public void setLinerseatSeq(String linerseatSeq) {
        this.linerseatSeq = linerseatSeq;
    }

    public String getLinerDate() {
        return linerDate;
    }

    public void setLinerDate(String linerDate) {
        this.linerDate = linerDate;
    }

    public String getLinerId() {
        return linerId;
    }

    public void setLinerId(String linerId) {
        this.linerId = linerId;
    }

    public Integer getSeatId() {
        return seatId;
    }

    public void setSeatId(Integer seatId) {
        this.seatId = seatId;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public Integer getSeatState() {
        return seatState;
    }

    public void setSeatState(Integer seatState) {
        this.seatState = seatState;
    }

    public Integer getSeatType() {
        return seatType;
    }

    public void setSeatType(Integer seatType) {
        this.seatType = seatType;
    }

    public String getSaleMacName() {
        return saleMacName;
    }

    public void setSaleMacName(String saleMacName) {
        this.saleMacName = saleMacName;
    }

    public String getMacShorname() {
        return macShorname;
    }

    public void setMacShorname(String macShorname) {
        this.macShorname = macShorname;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getLastupdateTime() {
        return lastupdateTime;
    }

    public void setLastupdateTime(String lastupdateTime) {
        this.lastupdateTime = lastupdateTime;
    }
}
