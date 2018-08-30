package com.yglink.otalk.common.util.exception;

/**
 * @author zhangtusheng
 * 403 授权拒绝
 */
public class OTalkDeniedException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public OTalkDeniedException() {
    }

    public OTalkDeniedException(String message) {
        super(message);
    }

    public OTalkDeniedException(Throwable cause) {
        super(cause);
    }

    public OTalkDeniedException(String message, Throwable cause) {
        super(message, cause);
    }

    public OTalkDeniedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
