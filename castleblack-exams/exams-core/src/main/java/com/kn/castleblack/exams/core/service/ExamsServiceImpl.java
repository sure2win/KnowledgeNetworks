package com.kn.castleblack.exams.core.service;

import com.kn.castleblack.common.api.service.impl.AbstractServiceImpl;
import com.kn.castleblack.exams.api.model.ExamDTO;
import com.kn.castleblack.exams.api.service.ExamsService;
import com.kn.castleblack.exams.core.model.Exam;
import com.kn.castleblack.exams.core.repository.ExamsRepository;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kirshnachaitanya.gumma on 29/04/16.
 */

@Service
@Data
@Slf4j
public class ExamsServiceImpl
        extends AbstractServiceImpl<ExamDTO, Exam, String>
        implements ExamsService {

    @Autowired
    private ExamsRepository repository;

    @Override
    public Class<?> getDtoClazz() {
        return ExamDTO.class;
    }

    @Override
    public Class<?> getEntityClazz() {
        return Exam.class;
    }

}