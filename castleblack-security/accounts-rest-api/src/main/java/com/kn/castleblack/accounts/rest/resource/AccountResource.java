package com.kn.castleblack.accounts.rest.resource;

import com.kn.castleblack.accounts.api.model.AccountDTO;
import com.kn.castleblack.accounts.api.service.AccountService;
import com.kn.castleblack.common.api.resource.AbstractRestResource;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.stereotype.Component;

import javax.ws.rs.Path;

/**
 * Created by kirshnachaitanya.gumma on 29/04/16.
 */

@Data
@Slf4j
@Component
@EnableCircuitBreaker
@Path("accounts")
public class AccountResource extends AbstractRestResource<AccountDTO, String> {

    @Autowired
    private AccountService service;

}
