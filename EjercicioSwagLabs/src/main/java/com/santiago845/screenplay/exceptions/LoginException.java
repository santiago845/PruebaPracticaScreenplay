package com.santiago845.screenplay.exceptions;

import com.santiago845.screenplay.utils.Constants;

public class LoginException extends AssertionError {

    public LoginException(String message, Throwable cause) {
        super(Constants.INVALIDATED_OR_BLOCKED_USER);
    }
}
