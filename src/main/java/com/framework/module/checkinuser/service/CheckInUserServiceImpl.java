package com.framework.module.checkinuser.service;

import com.framework.module.checkinuser.domain.CheckInUser;
import com.framework.module.checkinuser.domain.CheckInUserRepository;
import com.kratos.common.AbstractCrudService;
import com.kratos.common.PageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class CheckInUserServiceImpl extends AbstractCrudService<CheckInUser> implements CheckInUserService {
    private final CheckInUserRepository checkInUserRepository;
    @Override
    protected PageRepository<CheckInUser> getRepository() {
        return checkInUserRepository;
    }

    @Autowired
    public CheckInUserServiceImpl(CheckInUserRepository checkInUserRepository) {
        this.checkInUserRepository = checkInUserRepository;
    }
}
