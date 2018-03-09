package com.framework.module.scenic.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.kratos.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

/**
 * 景区园内票
 * @author tang he
 * @since 1.0.0
 */
@Entity
@ApiModel("景区园内票")
public class ScenicOrderItem extends BaseEntity {
    @ApiModelProperty("购票数量")
    @Column(length = 11)
    private Integer count;
    @ApiModelProperty("使用日期")
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
    private Date useDate;
    @ApiModelProperty("购票数量")
    @Column(length = 36)
    private String scenicOrderId;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Date getUseDate() {
        return useDate;
    }

    public void setUseDate(Date useDate) {
        this.useDate = useDate;
    }

    public String getScenicOrderId() {
        return scenicOrderId;
    }

    public void setScenicOrderId(String scenicOrderId) {
        this.scenicOrderId = scenicOrderId;
    }
}
