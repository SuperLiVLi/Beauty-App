package com.cqut.beautifulapp.result;


public class ResultData {
    private Integer code; // 状态码
    private String message; // 信息
    private Object data; // 返回数据(可能是个数据，也可能是个对象，也可能是个集合，所以返回就是Object)

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ResultData() {
    }

    public ResultData(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultData{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public ResultData(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResultData(ResultCode resultcode, Object data){
        this.code = resultcode.getCode();
        this.message = resultcode.getMessage();
        this.data = data;
    }

    public ResultData(ResultCode resultcode){
        this.code = resultcode.getCode();
        this.message = resultcode.getMessage();
    }
}
