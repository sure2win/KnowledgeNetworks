package com.kn.castleblack.exams.api.model;

import com.kn.castleblack.common.api.dto.BaseDTO;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * Created by kirshnachaitanya.gumma on 29/04/16.
 */
@Data
public class ExamDTO extends BaseDTO {

    @NotNull
    private String examName;

    @NotNull
    private String category;

}
