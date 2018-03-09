package com.framework.module.scenic.web;

import com.framework.module.scenic.domain.ScenicOrderItem;
import com.framework.module.scenic.service.ScenicOrderItemService;
import com.kratos.common.AbstractCrudController;
import com.kratos.common.CrudService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "景区订单园内票管理")
@RestController
@RequestMapping("/api/scenicOrderItem")
public class ScenicOrderItemController extends AbstractCrudController<ScenicOrderItem> {
    private final ScenicOrderItemService scenicOrderItemService;
    @Override
    protected CrudService<ScenicOrderItem> getService() {
        return scenicOrderItemService;
    }

    @Autowired
    public ScenicOrderItemController(ScenicOrderItemService scenicOrderItemService) {
        this.scenicOrderItemService = scenicOrderItemService;
    }
}
