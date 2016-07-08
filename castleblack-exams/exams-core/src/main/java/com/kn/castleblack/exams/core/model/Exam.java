package com.kn.castleblack.exams.core.model;

import com.kn.castleblack.common.api.model.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by kirshnachaitanya.gumma on 29/04/16.
 */
@Data
@Entity
@Table(name = "Exams")
public class Exam extends BaseEntity {

    private String examName;

    private String category;

    private String complexity;

}
