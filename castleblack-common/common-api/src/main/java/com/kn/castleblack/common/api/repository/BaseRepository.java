package com.kn.castleblack.common.api.repository;

import com.kn.castleblack.common.api.model.BaseEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by kirshnachaitanya.gumma on 28/04/16.
 */

public interface BaseRepository<T extends BaseEntity, ID extends String>
        extends PagingAndSortingRepository<T, ID> {

    Page<T> findAllByStatus(Pageable pageable, int status);

    Page<T> findAllByStatusIn(Pageable pageable, int... status);
}