package com.framework.module.scenic.domain;

import com.kratos.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * 景区
 * @author tang he
 * @since 1.0.0
 */
@Entity
@ApiModel("景区")
public class Scenic extends BaseEntity {
    @ApiModelProperty("景区名称")
    @Column(length = 50)
    private String name;
    @ApiModelProperty("景区描述")
    @Column(length = 2000)
    private String description;
    @ApiModelProperty("详细地址")
    @Column(length = 500)
    private String detailAddress;
    @ApiModelProperty("营业时间")
    @Column(length = 500)
    private String businessHours;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    public String getBusinessHours() {
        return businessHours;
    }

    public void setBusinessHours(String businessHours) {
        this.businessHours = businessHours;
    }
}
