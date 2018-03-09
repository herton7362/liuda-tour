package com.framework.module.scenic.service;

import com.framework.module.scenic.domain.ScenicOrder;
import com.framework.module.scenic.domain.ScenicOrderRepository;
import com.kratos.common.AbstractCrudService;
import com.kratos.common.PageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class ScenicOrderServiceImpl extends AbstractCrudService<ScenicOrder> implements ScenicOrderService {
    private final ScenicOrderRepository scenicOrderRepository;
    @Override
    protected PageRepository<ScenicOrder> getRepository() {
        return scenicOrderRepository;
    }

    @Autowired
    public ScenicOrderServiceImpl(ScenicOrderRepository scenicOrderRepository) {
        this.scenicOrderRepository = scenicOrderRepository;
    }
}
