package com.kn.castleblack.common.api.service;

import com.kn.castleblack.common.api.dto.BaseDTO;
import com.kn.castleblack.common.api.exception.CastleBlackException;

/**
 * Created by kirshnachaitanya.gumma on 28/04/16.
 */

public interface BaseService<T extends BaseDTO, ID extends String >
        extends BaseReadOnlyService<T, ID> {

    void save(T entity) throws CastleBlackException;

    void delete(T entity) throws CastleBlackException;

    void delete(ID id) throws CastleBlackException;
}
