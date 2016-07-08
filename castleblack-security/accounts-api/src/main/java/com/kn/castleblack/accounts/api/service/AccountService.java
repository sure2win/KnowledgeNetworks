package com.kn.castleblack.accounts.api.service;

import com.kn.castleblack.accounts.api.model.AccountDTO;
import com.kn.castleblack.common.api.exception.CastleBlackException;
import com.kn.castleblack.common.api.service.BaseReadOnlyService;
import com.kn.castleblack.common.api.service.BaseService;

/**
 * Created by kirshnachaitanya.gumma on 29/04/16.
 */
public interface AccountService
        extends BaseReadOnlyService<AccountDTO, String>, BaseService<AccountDTO, String>{

    AccountDTO findByUsername(String username) throws CastleBlackException;

    AccountDTO findByEmail(String email) throws CastleBlackException;
}
