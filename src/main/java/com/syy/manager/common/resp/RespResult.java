package com.syy.manager.common.resp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RespResult<T> {
    private Integer code;//业务状态码
    private String message;//信息
    private T data;//数据
    public static <T> RespResult<T> success(T data){
        return new RespResult<>(RespResultType.SUCCESS.getCode(),RespResultType.SUCCESS.getMessage(),data);
    }
    public static <T> RespResult<T> error(RespResultType respResultType){
        return new RespResult<>(respResultType.getCode(),respResultType.getMessage(),null);
    }
}
