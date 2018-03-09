package com.framework.module.scenic.service;

import com.framework.module.scenic.domain.Scenic;
import com.framework.module.scenic.domain.ScenicTicket;
import com.framework.module.scenic.domain.ScenicTicketRepository;
import com.kratos.common.AbstractCrudService;
import com.kratos.common.PageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
public class ScenicTicketServiceImpl extends AbstractCrudService<ScenicTicket> implements ScenicTicketService {
    private final ScenicTicketRepository scenicTicketRepository;
    @Override
    protected PageRepository<ScenicTicket> getRepository() {
        return scenicTicketRepository;
    }

    @Autowired
    public ScenicTicketServiceImpl(ScenicTicketRepository scenicTicketRepository) {
        this.scenicTicketRepository = scenicTicketRepository;
    }
}
