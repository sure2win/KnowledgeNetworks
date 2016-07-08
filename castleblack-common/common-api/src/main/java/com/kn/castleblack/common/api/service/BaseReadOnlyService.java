package com.kn.castleblack.common.api.service;

import com.kn.castleblack.common.api.dto.BaseDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by kirshnachaitanya.gumma on 28/04/16.
 */

public interface BaseReadOnlyService <T extends BaseDTO, ID extends String> {

    /**
     * Find entity by id
     * @param id
     * @return T extends {@link BaseDTO}
     */
    T findById(ID id);

    Page<T> findAllByStatus(Pageable pageable, int status);

    Page<T> findAllByStatusIn(Pageable pageable, int... status);

    Page<T> findAll(Pageable pageable);
}
