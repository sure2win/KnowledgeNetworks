package com.kn.castleblack.accounts.core.service;

import com.kn.castleblack.accounts.api.model.AccountDTO;
import com.kn.castleblack.accounts.api.service.AccountService;
import com.kn.castleblack.accounts.core.model.Account;
import com.kn.castleblack.accounts.core.repository.AccountRepository;
import com.kn.castleblack.common.api.exception.CastleBlackException;
import com.kn.castleblack.common.api.service.impl.AbstractServiceImpl;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kirshnachaitanya.gumma on 29/04/16.
 */

@Service
@Data
@Slf4j
public class AccountServiceImpl
        extends AbstractServiceImpl<AccountDTO, Account, String>
        implements AccountService {

    @Autowired
    private AccountRepository repository;

    @Override
    public Class<?> getDtoClazz() {
        return AccountDTO.class;
    }

    @Override
    public Class<?> getEntityClazz() {
        return Account.class;
    }

    @Override
    public AccountDTO findByUsername(String username) throws CastleBlackException {
        return null;
    }

    @Override
    public AccountDTO findByEmail(String email) throws CastleBlackException {
        return null;
    }
}