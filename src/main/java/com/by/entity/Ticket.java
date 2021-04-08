package com.by.entity;

import java.math.BigDecimal;

public class Ticket {


    private static final long serialVersionUID = 1L;

    private String ticketSeq;

    private Integer saleType;

    private String ticketId;

    private String taxCode;

    private String linerDate;

    private String lineSeq;

    private String lineName;

    private String stationSeq;

    private String stationName;

    private String linerId;

    private String linerCartime;

    private String fareratioSeq;

    private String fareratioName;

    /**
     * 1全票 2半票,作为打印结算单的统计依据
     */
    private Integer fulltickHalfticket;

    private Integer seatId;

    private String userId;

    private String userName;

    private String ticketTime;

    private String saleMacId;

    private String saleMacName;

    /**
     * 燃油附加费
     */
    private BigDecimal fuelFare;

    private BigDecimal fare;

    private BigDecimal stationFare;

    private Integer ticketState;

    private Integer ticketType;

    private Integer ticketNum;

    private String checkUserid;

    private String checkUsername;

    private Integer checkId;

    private String gateId;

    private Integer checkType;

    private String checkTime;

    private String checkCar;

    private String reportSeq;

    private Integer ifAccount;

    private String startMacId;

    private String startMacName;

    private String telNum;

    private String remark;

    private String lastupdateTime;

    /**
     * 基础价
     */
    private BigDecimal baseFare;

    /**
     * 发票代码
     */
    private String invoiceCode;

    /**
     * 班次类型
     */
    private String linerType;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getTicketSeq() {
        return ticketSeq;
    }

    public void setTicketSeq(String ticketSeq) {
        this.ticketSeq = ticketSeq;
    }

    public Integer getSaleType() {
        return saleType;
    }

    public void setSaleType(Integer saleType) {
        this.saleType = saleType;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getLinerDate() {
        return linerDate;
    }

    public void setLinerDate(String linerDate) {
        this.linerDate = linerDate;
    }

    public String getLineSeq() {
        return lineSeq;
    }

    public void setLineSeq(String lineSeq) {
        this.lineSeq = lineSeq;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public String getStationSeq() {
        return stationSeq;
    }

    public void setStationSeq(String stationSeq) {
        this.stationSeq = stationSeq;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getLinerId() {
        return linerId;
    }

    public void setLinerId(String linerId) {
        this.linerId = linerId;
    }

    public String getLinerCartime() {
        return linerCartime;
    }

    public void setLinerCartime(String linerCartime) {
        this.linerCartime = linerCartime;
    }

    public String getFareratioSeq() {
        return fareratioSeq;
    }

    public void setFareratioSeq(String fareratioSeq) {
        this.fareratioSeq = fareratioSeq;
    }

    public String getFareratioName() {
        return fareratioName;
    }

    public void setFareratioName(String fareratioName) {
        this.fareratioName = fareratioName;
    }

    public Integer getFulltickHalfticket() {
        return fulltickHalfticket;
    }

    public void setFulltickHalfticket(Integer fulltickHalfticket) {
        this.fulltickHalfticket = fulltickHalfticket;
    }

    public Integer getSeatId() {
        return seatId;
    }

    public void setSeatId(Integer seatId) {
        this.seatId = seatId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTicketTime() {
        return ticketTime;
    }

    public void setTicketTime(String ticketTime) {
        this.ticketTime = ticketTime;
    }

    public String getSaleMacId() {
        return saleMacId;
    }

    public void setSaleMacId(String saleMacId) {
        this.saleMacId = saleMacId;
    }

    public String getSaleMacName() {
        return saleMacName;
    }

    public void setSaleMacName(String saleMacName) {
        this.saleMacName = saleMacName;
    }

    public BigDecimal getFuelFare() {
        return fuelFare;
    }

    public void setFuelFare(BigDecimal fuelFare) {
        this.fuelFare = fuelFare;
    }

    public BigDecimal getFare() {
        return fare;
    }

    public void setFare(BigDecimal fare) {
        this.fare = fare;
    }

    public BigDecimal getStationFare() {
        return stationFare;
    }

    public void setStationFare(BigDecimal stationFare) {
        this.stationFare = stationFare;
    }

    public Integer getTicketState() {
        return ticketState;
    }

    public void setTicketState(Integer ticketState) {
        this.ticketState = ticketState;
    }

    public Integer getTicketType() {
        return ticketType;
    }

    public void setTicketType(Integer ticketType) {
        this.ticketType = ticketType;
    }

    public Integer getTicketNum() {
        return ticketNum;
    }

    public void setTicketNum(Integer ticketNum) {
        this.ticketNum = ticketNum;
    }

    public String getCheckUserid() {
        return checkUserid;
    }

    public void setCheckUserid(String checkUserid) {
        this.checkUserid = checkUserid;
    }

    public String getCheckUsername() {
        return checkUsername;
    }

    public void setCheckUsername(String checkUsername) {
        this.checkUsername = checkUsername;
    }

    public Integer getCheckId() {
        return checkId;
    }

    public void setCheckId(Integer checkId) {
        this.checkId = checkId;
    }

    public String getGateId() {
        return gateId;
    }

    public void setGateId(String gateId) {
        this.gateId = gateId;
    }

    public Integer getCheckType() {
        return checkType;
    }

    public void setCheckType(Integer checkType) {
        this.checkType = checkType;
    }

    public String getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(String checkTime) {
        this.checkTime = checkTime;
    }

    public String getCheckCar() {
        return checkCar;
    }

    public void setCheckCar(String checkCar) {
        this.checkCar = checkCar;
    }

    public String getReportSeq() {
        return reportSeq;
    }

    public void setReportSeq(String reportSeq) {
        this.reportSeq = reportSeq;
    }

    public Integer getIfAccount() {
        return ifAccount;
    }

    public void setIfAccount(Integer ifAccount) {
        this.ifAccount = ifAccount;
    }

    public String getStartMacId() {
        return startMacId;
    }

    public void setStartMacId(String startMacId) {
        this.startMacId = startMacId;
    }

    public String getStartMacName() {
        return startMacName;
    }

    public void setStartMacName(String startMacName) {
        this.startMacName = startMacName;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
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

    public BigDecimal getBaseFare() {
        return baseFare;
    }

    public void setBaseFare(BigDecimal baseFare) {
        this.baseFare = baseFare;
    }

    public String getInvoiceCode() {
        return invoiceCode;
    }

    public void setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
    }

    public String getLinerType() {
        return linerType;
    }

    public void setLinerType(String linerType) {
        this.linerType = linerType;
    }
}
