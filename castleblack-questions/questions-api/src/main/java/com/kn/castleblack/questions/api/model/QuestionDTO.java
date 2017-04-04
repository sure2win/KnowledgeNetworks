package com.kn.castleblack.questions.api.model;

import com.kn.castleblack.common.api.dto.BaseDTO;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * Created by kirshnachaitanya.gumma on 29/04/16.
 */
@Data
public class QuestionDTO extends BaseDTO {

    @NotNull
    private String question;

    @NotNull
    private String category;

}
