package com.by.entity;


public class Liner {


    private static final long serialVersionUID = 1L;

    /**
     * 班次序号
     */
    private String linerSeq;

    /**
     * 线路序号
     */

    private String lineSeq;

    /**
     * 线路名称
     */
    private String lineName;

    /**
     * 班次日期
     */
    private String linerDate;

    /**
     * 班次号
     */
    private String linerId;

    /**
     * 班次类型
     * <p>
     * 普通；滚动；加班
     */
    private String linerType;

    /**
     * 车辆等级序号
     */
    private String cargradeSeq;

    /**
     * 车辆等级名称
     */
    private String cargradeName;

    /**
     * 班次状态
     * <p>
     * 正常；停班；保班 ；作废 ；脱班
     */
    private String linerState;

    /**
     * 发车时间
     */
    private String linerCartime;

    /**
     * 到达时间
     */
    private String estimateTime;

    /**
     * 班次默认检票口
     */
    private Integer linerAutocheckid;

    /**
     * 登车口
     */
    private String linerGateid;

    /**
     * 班次席位数量
     */
    private Integer linerSeatnum;

    /**
     * 班次半票数量
     */
    private Integer linerHalfnum;

    /**
     * 班次免票数量
     */
    private Integer linerFreenum;

    /**
     * 报班车牌号
     */
    private String reportCar;

    /**
     * 是否打印座位
     * 0-否；1-是
     */
    private Integer ifPrintseat;

    /**
     * 是否配载
     * 0-否；1-是
     */
    private Integer ifAssort;

    /**
     * 配载模式
     * 1,从配载无席位：共享模式
     * 2,从配载有席位：预分配模式
     */
    private Integer assortMode;

    /**
     * 是否报班
     * 0-否；1-是
     */
    private Integer ifReport;

    /**
     * 是否打印结算
     * 0-否；1-是
     */
    private Integer ifPrintbill;

    /**
     * 是否网络售票
     * 0-否；1-是
     */
    private Integer ifNetsale;

    /**
     * 是否晚点0/否，1/是
     */
    private Integer ifLate;

    /**
     * 售票数量
     */
    private Integer saleNum;

    /**
     * 检票数量
     */
    private Integer checkNum;

    /**
     * 退票数量
     */
    private Integer returnNum;

    /**
     * 废票数量
     */
    private Integer invalidNum;

    /**
     * 席位预留数
     */
    private Integer seatreverseNum;

    /**
     * 席位禁售数
     */
    private Integer seatstopsaleNum;

    /**
     * 结算单位号
     */
    private String unitId;

    /**
     * 备注
     */
    private String remark;

    /**
     * 最后修改时间
     */
    private String lastupdateTime;

    private Integer ifTrip;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getLinerSeq() {
        return linerSeq;
    }

    public void setLinerSeq(String linerSeq) {
        this.linerSeq = linerSeq;
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

    public String getLinerType() {
        return linerType;
    }

    public void setLinerType(String linerType) {
        this.linerType = linerType;
    }

    public String getCargradeSeq() {
        return cargradeSeq;
    }

    public void setCargradeSeq(String cargradeSeq) {
        this.cargradeSeq = cargradeSeq;
    }

    public String getCargradeName() {
        return cargradeName;
    }

    public void setCargradeName(String cargradeName) {
        this.cargradeName = cargradeName;
    }

    public String getLinerState() {
        return linerState;
    }

    public void setLinerState(String linerState) {
        this.linerState = linerState;
    }

    public String getLinerCartime() {
        return linerCartime;
    }

    public void setLinerCartime(String linerCartime) {
        this.linerCartime = linerCartime;
    }

    public String getEstimateTime() {
        return estimateTime;
    }

    public void setEstimateTime(String estimateTime) {
        this.estimateTime = estimateTime;
    }

    public Integer getLinerAutocheckid() {
        return linerAutocheckid;
    }

    public void setLinerAutocheckid(Integer linerAutocheckid) {
        this.linerAutocheckid = linerAutocheckid;
    }

    public String getLinerGateid() {
        return linerGateid;
    }

    public void setLinerGateid(String linerGateid) {
        this.linerGateid = linerGateid;
    }

    public Integer getLinerSeatnum() {
        return linerSeatnum;
    }

    public void setLinerSeatnum(Integer linerSeatnum) {
        this.linerSeatnum = linerSeatnum;
    }

    public Integer getLinerHalfnum() {
        return linerHalfnum;
    }

    public void setLinerHalfnum(Integer linerHalfnum) {
        this.linerHalfnum = linerHalfnum;
    }

    public Integer getLinerFreenum() {
        return linerFreenum;
    }

    public void setLinerFreenum(Integer linerFreenum) {
        this.linerFreenum = linerFreenum;
    }

    public String getReportCar() {
        return reportCar;
    }

    public void setReportCar(String reportCar) {
        this.reportCar = reportCar;
    }

    public Integer getIfPrintseat() {
        return ifPrintseat;
    }

    public void setIfPrintseat(Integer ifPrintseat) {
        this.ifPrintseat = ifPrintseat;
    }

    public Integer getIfAssort() {
        return ifAssort;
    }

    public void setIfAssort(Integer ifAssort) {
        this.ifAssort = ifAssort;
    }

    public Integer getAssortMode() {
        return assortMode;
    }

    public void setAssortMode(Integer assortMode) {
        this.assortMode = assortMode;
    }

    public Integer getIfReport() {
        return ifReport;
    }

    public void setIfReport(Integer ifReport) {
        this.ifReport = ifReport;
    }

    public Integer getIfPrintbill() {
        return ifPrintbill;
    }

    public void setIfPrintbill(Integer ifPrintbill) {
        this.ifPrintbill = ifPrintbill;
    }

    public Integer getIfNetsale() {
        return ifNetsale;
    }

    public void setIfNetsale(Integer ifNetsale) {
        this.ifNetsale = ifNetsale;
    }

    public Integer getIfLate() {
        return ifLate;
    }

    public void setIfLate(Integer ifLate) {
        this.ifLate = ifLate;
    }

    public Integer getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(Integer saleNum) {
        this.saleNum = saleNum;
    }

    public Integer getCheckNum() {
        return checkNum;
    }

    public void setCheckNum(Integer checkNum) {
        this.checkNum = checkNum;
    }

    public Integer getReturnNum() {
        return returnNum;
    }

    public void setReturnNum(Integer returnNum) {
        this.returnNum = returnNum;
    }

    public Integer getInvalidNum() {
        return invalidNum;
    }

    public void setInvalidNum(Integer invalidNum) {
        this.invalidNum = invalidNum;
    }

    public Integer getSeatreverseNum() {
        return seatreverseNum;
    }

    public void setSeatreverseNum(Integer seatreverseNum) {
        this.seatreverseNum = seatreverseNum;
    }

    public Integer getSeatstopsaleNum() {
        return seatstopsaleNum;
    }

    public void setSeatstopsaleNum(Integer seatstopsaleNum) {
        this.seatstopsaleNum = seatstopsaleNum;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
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

    public Integer getIfTrip() {
        return ifTrip;
    }

    public void setIfTrip(Integer ifTrip) {
        this.ifTrip = ifTrip;
    }
}
