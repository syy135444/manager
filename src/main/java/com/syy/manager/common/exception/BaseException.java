package com.syy.manager.common.exception;

import com.syy.manager.common.resp.RespResultType;
import lombok.Getter;

@Getter
public class BaseException extends RuntimeException{
    protected RespResultType respResultType;
    public BaseException(RespResultType respResultType){
        this.respResultType = respResultType;
    }
}
