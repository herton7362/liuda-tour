package com.framework.module.checkinuser.web;

import com.framework.module.checkinuser.domain.CheckInUser;
import com.framework.module.checkinuser.service.CheckInUserService;
import com.kratos.common.AbstractCrudController;
import com.kratos.common.CrudService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "取票用户管理")
@RestController
@RequestMapping("/api/checkInUser")
public class CheckInUserController extends AbstractCrudController<CheckInUser> {
    private final CheckInUserService checkInUserService;
    @Override
    protected CrudService<CheckInUser> getService() {
        return checkInUserService;
    }

    @Autowired
    public CheckInUserController(CheckInUserService checkInUserService) {
        this.checkInUserService = checkInUserService;
    }
}
