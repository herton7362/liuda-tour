package com.framework.module.scenic.web;

import com.framework.module.scenic.domain.Scenic;
import com.framework.module.scenic.service.ScenicService;
import com.kratos.common.AbstractCrudController;
import com.kratos.common.CrudService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "景区管理")
@RestController
@RequestMapping("/api/scenic")
public class ScenicController extends AbstractCrudController<Scenic> {
    private final ScenicService scenicService;
    @Override
    protected CrudService<Scenic> getService() {
        return scenicService;
    }

    @Autowired
    public ScenicController(ScenicService scenicService) {
        this.scenicService = scenicService;
    }
}
