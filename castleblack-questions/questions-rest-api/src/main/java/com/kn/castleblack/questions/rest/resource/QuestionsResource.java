package com.kn.castleblack.questions.rest.resource;

import com.kn.castleblack.common.api.resource.AbstractRestResource;
import com.kn.castleblack.questions.api.model.QuestionDTO;
import com.kn.castleblack.questions.api.service.QuestionsService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.Path;

/**
 * Created by kirshnachaitanya.gumma on 29/04/16.
 */

@Data
@Slf4j
@Component
@Path("q")
public class QuestionsResource extends AbstractRestResource<QuestionDTO, String> {

    @Autowired
    private QuestionsService service;

}
