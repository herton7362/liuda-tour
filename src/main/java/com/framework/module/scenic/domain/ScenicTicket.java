package com.framework.module.scenic.domain;

import com.kratos.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javafx.scene.layout.BackgroundSize;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * 景区园内票
 * @author tang he
 * @since 1.0.0
 */
@Entity
@ApiModel("景区园内票")
public class ScenicTicket extends BaseEntity {
    @ApiModelProperty("园内票名称")
    @Column(length = 100)
    private String name;
    @ApiModelProperty("园内票描述")
    @Column(length = 2000)
    private String description;
    @ApiModelProperty("购买须知")
    @Column(length = 2000)
    private String needKnow;
    @ApiModelProperty("景区id")
    @Column(length = 36)
    private String scenicId;

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

    public String getNeedKnow() {
        return needKnow;
    }

    public void setNeedKnow(String needKnow) {
        this.needKnow = needKnow;
    }

    public String getScenicId() {
        return scenicId;
    }

    public void setScenicId(String scenicId) {
        this.scenicId = scenicId;
    }
}
