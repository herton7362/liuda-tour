package com.framework.module.scenic.web;

import com.framework.module.scenic.domain.ScenicOrder;
import com.framework.module.scenic.service.ScenicOrderService;
import com.framework.module.scenic.service.ScenicService;
import com.kratos.common.AbstractCrudController;
import com.kratos.common.CrudService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "景区订单管理")
@RestController
@RequestMapping("/api/scenicOrder")
public class ScenicOrderController extends AbstractCrudController<ScenicOrder> {
    private final ScenicOrderService scenicOrderService;
    @Override
    protected CrudService<ScenicOrder> getService() {
        return scenicOrderService;
    }

    @Autowired
    public ScenicOrderController(ScenicOrderService scenicOrderService) {
        this.scenicOrderService = scenicOrderService;
    }
}
