package com.framework.module.checkinuser.domain;

import com.kratos.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * 取票人
 * @author tang he
 * @since 1.0.0
 */
@Entity
@ApiModel("取票人")
public class CheckInUser extends BaseEntity {
    @ApiModelProperty("取票人")
    @Column(length = 20)
    private String name;
    @ApiModelProperty("手机号")
    @Column(length = 20)
    private String mobile;
    @ApiModelProperty("所属会员id")
    @Column(length = 36)
    private String memberId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
}
