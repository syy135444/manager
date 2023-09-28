package com.syy.manager.common.exception;

import com.syy.manager.common.resp.RespResultType;

public class MapperException extends BaseException{
    public MapperException(RespResultType respResultType) {
        super(respResultType);
    }
}
