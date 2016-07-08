package com.kn.castleblack.exams.rest.resource;

import com.kn.castleblack.common.api.resource.AbstractRestResource;
import com.kn.castleblack.exams.api.model.ExamDTO;
import com.kn.castleblack.exams.api.service.ExamsService;
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
@Path("e")
public class ExamsResource extends AbstractRestResource<ExamDTO, String> {

    @Autowired
    private ExamsService service;

}
