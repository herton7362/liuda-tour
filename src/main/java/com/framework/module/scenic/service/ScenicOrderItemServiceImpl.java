package com.framework.module.scenic.service;

import com.framework.module.scenic.domain.ScenicOrderItem;
import com.framework.module.scenic.domain.ScenicOrderItemRepository;
import com.kratos.common.AbstractCrudService;
import com.kratos.common.PageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class ScenicOrderItemServiceImpl extends AbstractCrudService<ScenicOrderItem> implements ScenicOrderItemService {
    private final ScenicOrderItemRepository scenicOrderItemRepository;
    @Override
    protected PageRepository<ScenicOrderItem> getRepository() {
        return scenicOrderItemRepository;
    }

    @Autowired
    public ScenicOrderItemServiceImpl(ScenicOrderItemRepository scenicOrderItemRepository) {
        this.scenicOrderItemRepository = scenicOrderItemRepository;
    }
}
