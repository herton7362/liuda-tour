package com.framework.module.scenic.domain;

import com.kratos.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * 景区订单
 * @author tang he
 * @since 1.0.0
 */
@Entity
@ApiModel("景区订单")
public class ScenicOrder extends BaseEntity {
    @ApiModelProperty("取票人")
    @Column(length = 36)
    private String checkInUserId;
    @ApiModelProperty(value = "现金支付")
    @Column(length = 11, precision = 2)
    private Double cash;
    @ApiModelProperty(value = "储值支付")
    @Column(length = 11, precision = 2)
    private Double balance;
    @ApiModelProperty(value = "积分支付")
    private Integer point;
    @ApiModelProperty(value = "退款金额")
    @Column(length = 11, precision = 2)
    private Double returnedMoney;
    @ApiModelProperty(value = "退款余额")
    @Column(length = 11, precision = 2)
    private Double returnedBalance;
    @ApiModelProperty(value = "退款积分")
    private Integer returnedPoint;
    @ApiModelProperty(value = "退款备注")
    @Column(length = 500)
    private String returnedRemark;
    @ApiModelProperty(value = "申请退款备注")
    @Column(length = 500)
    private String applyRejectRemark;
    @ApiModelProperty(value = "结单日期")
    private Long finishedDate;
    @ApiModelProperty(value = "订单状态")
    @Column(length = 20)
    @Enumerated(EnumType.STRING)
    private OrderStatus status;
    @ApiModelProperty(value = "支付方式")
    @Column(length = 20)
    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;
    @ApiModelProperty(value = "支付状态")
    @Column(length = 20)
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    public enum OrderStatus {
        UN_PAY("待支付"),
        PAYED("已支付"),
        DELIVERED("已验收"),
        APPLY_REJECTED("申请退款"),
        REJECTED("已退款"),
        CANCEL("已取消");
        private String displayName;
        OrderStatus(String displayName) {
            this.displayName = displayName;
        }
        public String getDisplayName() {
            return displayName;
        }
    }
    public enum PaymentType {
        ONLINE("在线支付"),
        IN_SHOP("到店支付");
        private String displayName;
        PaymentType(String displayName) {
            this.displayName = displayName;
        }
        public String getDisplayName() {
            return displayName;
        }
    }
    public enum PaymentStatus {
        UN_PAY("待支付"), PAYED("已支付");
        private String displayName;
        PaymentStatus(String displayName) {
            this.displayName = displayName;
        }

        public String getDisplayName() {
            return displayName;
        }
    }
}
