package com.csqf.zx.result;

import com.csqf.zx.common.SystemCode;
import lombok.Data;

/**
 * @Author xinforever
 * @Date 2023/7/13 001314:12
 */
@Data
public class ResponseResult<T> {

    private Long code;
    private String message;
    private T data;

    public ResponseResult(Long code){
        this.code = code;
    }

    public ResponseResult(Long code,String message){
        this.code = code;
        this.message = message;
    }

    public ResponseResult(Long code,String message,T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 默认成功
     * @return
     */
    public static ResponseResult SUCCESS(){
        return new ResponseResult(SystemCode.SYSTEM_SUCCESS_CODE);
    }

    /**
     * 通用失败
     * @return
     */
    public static ResponseResult FAIL(){
        return new ResponseResult(SystemCode.SYSTEM_FAIL_CODE);
    }

}
