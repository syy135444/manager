package com.syy.manager.common.resp;

import lombok.Getter;

@Getter
public enum RespResultType {
    SUCCESS(200,"success"),
    SYS_ERROR(4000,"sys error");
    private Integer code;//业务状态码
    private String message;//信息
    RespResultType(Integer code,String message){
        this.code = code;
        this.message = message;
    }
}
