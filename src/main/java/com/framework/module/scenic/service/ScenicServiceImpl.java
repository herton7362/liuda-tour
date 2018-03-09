package com.framework.module.scenic.service;

import com.framework.module.scenic.domain.Scenic;
import com.framework.module.scenic.domain.ScenicRepository;
import com.kratos.common.AbstractCrudService;
import com.kratos.common.PageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class ScenicServiceImpl extends AbstractCrudService<Scenic> implements ScenicService {
    private final ScenicRepository scenicRepository;
    @Override
    protected PageRepository<Scenic> getRepository() {
        return scenicRepository;
    }

    @Autowired
    public ScenicServiceImpl(ScenicRepository scenicRepository) {
        this.scenicRepository = scenicRepository;
    }
}
