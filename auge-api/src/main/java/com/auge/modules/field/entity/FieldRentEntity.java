package com.auge.modules.field.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by soya on 2018/4/15.
 */
@ApiModel
@TableName("field_rent")
public class FieldRentEntity {

    @TableId
    private Long id;
    @ApiModelProperty("场地id")
    private Long filedId;
    @ApiModelProperty("场地快照id")
    private Long filedShotId;
    @ApiModelProperty("租金")
    private BigDecimal rentAmount;
    @ApiModelProperty("折扣租金")
    private BigDecimal rentAmountDiscount;
    @ApiModelProperty("租期单位")
    private Integer rentUnit;
    @ApiModelProperty("是否需要预约")
    private Boolean needReserve;
    @ApiModelProperty("租期")
    private Integer rentTime;
    @ApiModelProperty("租赁开始时间")
    private Date startTime;
    @ApiModelProperty("租赁结束时间")
    private Date endTime;
    @ApiModelProperty("假日是否可用")
    private Boolean holidayAble;
    @ApiModelProperty("是否支持分期")
    private Boolean installmentAble;
    @ApiModelProperty("状态 1发布中 2待支付 3成交 4到期 8退款 9作废")
    private Integer status;
    private Integer valid;
    @ApiModelProperty("创建时间")
    private Date createTime;
    @ApiModelProperty("修改时间")
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFiledId() {
        return filedId;
    }

    public void setFiledId(Long filedId) {
        this.filedId = filedId;
    }

    public Long getFiledShotId() {
        return filedShotId;
    }

    public void setFiledShotId(Long filedShotId) {
        this.filedShotId = filedShotId;
    }

    public BigDecimal getRentAmount() {
        return rentAmount;
    }

    public void setRentAmount(BigDecimal rentAmount) {
        this.rentAmount = rentAmount;
    }

    public BigDecimal getRentAmountDiscount() {
        return rentAmountDiscount;
    }

    public void setRentAmountDiscount(BigDecimal rentAmountDiscount) {
        this.rentAmountDiscount = rentAmountDiscount;
    }

    public Integer getRentUnit() {
        return rentUnit;
    }

    public void setRentUnit(Integer rentUnit) {
        this.rentUnit = rentUnit;
    }

    public Boolean getNeedReserve() {
        return needReserve;
    }

    public void setNeedReserve(Boolean needReserve) {
        this.needReserve = needReserve;
    }

    public Integer getRentTime() {
        return rentTime;
    }

    public void setRentTime(Integer rentTime) {
        this.rentTime = rentTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Boolean getHolidayAble() {
        return holidayAble;
    }

    public void setHolidayAble(Boolean holidayAble) {
        this.holidayAble = holidayAble;
    }

    public Boolean getInstallmentAble() {
        return installmentAble;
    }

    public void setInstallmentAble(Boolean installmentAble) {
        this.installmentAble = installmentAble;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
