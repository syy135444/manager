package com.syy.manager.common.exception;

import com.syy.manager.common.resp.RespResultType;

public class ServiceException extends BaseException{
    public ServiceException(RespResultType respResultType) {
        super(respResultType);
    }
}
