package com.kn.castleblack.questions.core.service;

import com.kn.castleblack.common.api.exception.CastleBlackException;
import com.kn.castleblack.common.api.service.impl.AbstractServiceImpl;
import com.kn.castleblack.questions.api.model.QuestionDTO;
import com.kn.castleblack.questions.api.service.QuestionsService;
import com.kn.castleblack.questions.core.model.Question;
import com.kn.castleblack.questions.core.repository.QuestionsRepository;
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
public class QuestionsServiceImpl
        extends AbstractServiceImpl<QuestionDTO, Question, String>
        implements QuestionsService {

    @Autowired
    private QuestionsRepository repository;

    @Override
    public Class<?> getDtoClazz() {
        return QuestionDTO.class;
    }

    @Override
    public Class<?> getEntityClazz() {
        return Question.class;
    }

}