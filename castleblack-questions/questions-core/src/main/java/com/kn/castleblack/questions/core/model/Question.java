package com.kn.castleblack.questions.core.model;

import com.kn.castleblack.common.api.model.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by kirshnachaitanya.gumma on 29/04/16.
 */
@Data
@Entity
@Table(name = "Questions")
public class Question extends BaseEntity {

    private String question;

    private String category;

    private String complexity;

}
