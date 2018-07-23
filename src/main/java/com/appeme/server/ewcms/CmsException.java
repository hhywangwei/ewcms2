package com.appeme.server.ewcms;

public class CmsException extends RuntimeException {
    private final int code;

    public CmsException(String message){
        this(1000, message);
    }

    public CmsException(int code, String message){
        super(message);
        this.code = code;
    }

    public CmsException(int code, String message, Throwable throwable){
        super(message, throwable);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
