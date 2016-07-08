package com.kn.castleblack.questions.api.model;

import com.kn.castleblack.common.api.dto.BaseDTO;
import lombok.Data;
import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
