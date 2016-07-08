package com.kn.castleblack.questions.api.service;

import com.kn.castleblack.common.api.service.BaseReadOnlyService;
import com.kn.castleblack.common.api.service.BaseService;
import com.kn.castleblack.questions.api.model.QuestionDTO;

/**
 * Created by kirshnachaitanya.gumma on 29/04/16.
 */
public interface QuestionsService
        extends BaseReadOnlyService<QuestionDTO, String>, BaseService<QuestionDTO, String>{

//    QuestionDTO findByUsername(String username) throws CastleBlackException;
//
//    QuestionDTO findByEmail(String email) throws CastleBlackException;
}
