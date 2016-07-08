package com.kn.castleblack.common.api.service.impl;

import com.kn.castleblack.common.api.dto.BaseDTO;
import com.kn.castleblack.common.api.mapper.OrikaBeanMapper;
import com.kn.castleblack.common.api.model.BaseEntity;
import com.kn.castleblack.common.api.repository.BaseRepository;
import com.kn.castleblack.common.api.service.BaseReadOnlyService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

/**
 * Created by kirshnachaitanya.gumma on 28/04/16.
 */

@Component
@Data
@Slf4j
public abstract class AbstractReadOnlyServiceImpl<DTO extends BaseDTO, ENTITY extends BaseEntity, ID extends String>
        implements BaseReadOnlyService<DTO, ID> {

    public abstract BaseRepository<ENTITY, ID> getRepository();

    public abstract Class<?> getDtoClazz();

    public abstract Class<?> getEntityClazz();

    @Autowired
    protected OrikaBeanMapper mapper;

    @Override
    public DTO findById(ID id) {
        return (DTO) mapper.map(getRepository().findOne(id), getDtoClazz());
    }

    @Override
    public Page<DTO> findAllByStatus(Pageable pageable, int status) {
        Page<ENTITY> result = getRepository().findAllByStatus(pageable, status);
        return result.map ( entity ->
                (DTO) mapper.map( entity, getDtoClazz())
        );
    }

    @Override
    public Page<DTO> findAllByStatusIn(Pageable pageable, int... status) {
        return getRepository().findAllByStatusIn(pageable, status).map(
                entity -> (DTO) mapper.map(entity, getDtoClazz())
        );
    }

    public Page<DTO> findAll(Pageable pageable) {
        return getRepository().findAll(pageable).map(
                entity -> (DTO) mapper.map(entity, getDtoClazz())
        );
    }
}
