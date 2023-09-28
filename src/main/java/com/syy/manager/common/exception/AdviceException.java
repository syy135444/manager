package com.syy.manager.common.exception;

import com.syy.manager.common.resp.RespResultType;

public class AdviceException extends BaseException{
    public AdviceException(RespResultType respResultType) {
        super(respResultType);
    }
}
