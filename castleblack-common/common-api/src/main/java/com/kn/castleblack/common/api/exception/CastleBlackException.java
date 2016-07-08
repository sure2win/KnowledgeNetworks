package com.kn.castleblack.common.api.exception;

import lombok.Data;

/**
 * Created by kirshnachaitanya.gumma on 28/04/16.
 */
@Data
public class CastleBlackException extends Exception {

    private String errorCode = "ERROR";

    private int httpErrorCode = 500;

    public CastleBlackException() {
        super();
    }

    public CastleBlackException(String message) {
        super(message);
    }

    public CastleBlackException(Throwable cause) {
        super(cause);
    }

    public CastleBlackException(String message, Throwable cause,
                                boolean enableSuppression,
                                boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
