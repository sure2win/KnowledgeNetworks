package com.kn.castleblack.accounts.core.model;

import com.kn.castleblack.common.api.model.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by kirshnachaitanya.gumma on 29/04/16.
 */
@Data
@Entity
@Table(name = "Accounts")
public class Account extends BaseEntity {

    private String username;

    private String password;

    private String email;

    private String mobile;

    private boolean locked;

    private int noOfFailedLogins = 0;

    private String firstName;

    private String lastName;

}
