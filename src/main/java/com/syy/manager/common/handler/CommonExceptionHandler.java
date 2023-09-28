package com.syy.manager.common.handler;

import com.syy.manager.common.exception.BaseException;
import com.syy.manager.common.resp.RespResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CommonExceptionHandler {
    @ExceptionHandler(BaseException.class)
    public RespResult handlerBaseException(Exception e){
        BaseException be = (BaseException) e;
        return RespResult.error(be.getRespResultType());
    }
}
