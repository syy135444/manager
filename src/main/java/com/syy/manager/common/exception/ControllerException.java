package com.syy.manager.common.exception;

import com.syy.manager.common.resp.RespResultType;

public class ControllerException extends BaseException{

    public ControllerException(RespResultType respResultType) {
        super(respResultType);
    }
}
