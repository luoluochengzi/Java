package com.test1;

public class privateException extends Exception {
    public privateException() {
    }

    public privateException(String message) {
        super(message);
    }

    public privateException(String message, Throwable cause) {
        super(message, cause);
    }

    public privateException(Throwable cause) {
        super(cause);
    }

    public privateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
