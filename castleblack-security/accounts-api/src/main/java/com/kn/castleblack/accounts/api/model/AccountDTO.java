package com.kn.castleblack.accounts.api.model;

import com.kn.castleblack.common.api.dto.BaseDTO;
import lombok.Data;
import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by kirshnachaitanya.gumma on 29/04/16.
 */
@Data
public class AccountDTO extends BaseDTO {

    @NotNull
    @Size(min = 4, max = 12)
    private String username;

    @NotNull
    @Size(min = 4, max = 12)
    private String password;

    @NotNull(message = "Email cannot be null")
    @Email(message = "Email is not valid")
    private String email;

    @NotNull
    private String mobile;

    @NotNull
    private boolean locked;

    private int noOfFailedLogins = 0;

    private String firstName;

}
