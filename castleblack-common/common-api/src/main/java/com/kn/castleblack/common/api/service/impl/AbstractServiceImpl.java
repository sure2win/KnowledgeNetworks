package com.kn.castleblack.common.api.service.impl;

import com.kn.castleblack.common.api.dto.BaseDTO;
import com.kn.castleblack.common.api.exception.CastleBlackException;
import com.kn.castleblack.common.api.model.BaseEntity;
import com.kn.castleblack.common.api.service.BaseService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Created by kirshnachaitanya.gumma on 28/04/16.
 */

@Component
@Data
@Slf4j
public abstract class AbstractServiceImpl <DTO extends BaseDTO, ENTITY extends BaseEntity, ID extends String>
        extends AbstractReadOnlyServiceImpl<DTO, ENTITY, ID> implements BaseService<DTO, ID> {

    @Override
    public void save(DTO dto) throws CastleBlackException {
        ENTITY entity = (ENTITY) mapper.map(dto, getEntityClazz());
        getRepository().save(entity);
    }

    @Override
    public void delete(DTO dto) throws CastleBlackException {
        ENTITY entity = (ENTITY) mapper.map(dto, getEntityClazz());
        getRepository().delete(entity);
    }

    @Override
    public void delete(ID id) throws CastleBlackException {
        getRepository().delete(id);
    }

}
