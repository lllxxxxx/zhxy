package com.atguigu.zhxy.util;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author: lllxxx
 * @description: 数据统一封装格式
 * @date: 2022/4/23 21:33
 */
@Data
@ApiModel("全局统一返回结果")
public class Result<T> {

    @ApiModelProperty("返回码")
    private Integer code;

    @ApiModelProperty("返回消息")
    private String message;

    @ApiModelProperty("返回数据")
    private T data;

    public Result(){}

    /**
     * @param data:
     * @return Result<T>
     * @author lllxxx
     * @description 返回数据
     */
    protected static <T> Result<T> build(T data){
        Result<T> result=new Result<>();
        if(data!=null){
            result.setData(data);
        }
        return result;
    }

    public static <T> Result<T> build(T body,ResultCodeEnum resultCodeEnum){
        Result<T> result=build(body);
        result.setCode(resultCodeEnum.getCode());
        result.setMessage(resultCodeEnum.getMessage());
        return result;
    }

    public static <T> Result<T> ok(){
        return Result.ok(null);
    }

    public static<T> Result<T> ok(T data){
        Result<T> result = build(data);
        return build(data, ResultCodeEnum.SUCCESS);
    }

    public static <T> Result<T> fail(){
        return Result.fail(null);
    }

    public static<T> Result<T> fail(T data){
        Result<T> result = build(data);
        return build(data, ResultCodeEnum.FAIL);
    }

    public Result<T> message(String msg){
        this.setMessage(msg);
        return this;
    }

    public Result<T> code(Integer code){
        this.setCode(code);
        return this;
    }

    public boolean isOk() {
        if(this.getCode().intValue() == ResultCodeEnum.SUCCESS.getCode().intValue()) {
            return true;
        }
        return false;
    }
}
