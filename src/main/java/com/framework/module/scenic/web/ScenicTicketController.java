package com.framework.module.scenic.web;

import com.framework.module.scenic.domain.ScenicTicket;
import com.framework.module.scenic.service.ScenicTicketService;
import com.kratos.common.AbstractCrudController;
import com.kratos.common.CrudService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "园内票管理")
@RestController
@RequestMapping("/api/scenicTicket")
public class ScenicTicketController extends AbstractCrudController<ScenicTicket> {
    private final ScenicTicketService scenicTicketService;
    @Override
    protected CrudService<ScenicTicket> getService() {
        return scenicTicketService;
    }

    @Autowired
    public ScenicTicketController(ScenicTicketService scenicTicketService) {
        this.scenicTicketService = scenicTicketService;
    }
}
