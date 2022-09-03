package com.wxs.domain;

public class ResponseMessage<T> {
    @Override
    public String toString() {
        return "ResponseMessage{" +
                "success=" + success +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                ", notify=" + notify +
                '}';
    }

    private Boolean success;
    private Integer code;
    private String msg;
    private T data;
    private Boolean notify;


    public ResponseMessage() {
    }

    public ResponseMessage(boolean success) {
        this.success = success;
    }

    public ResponseMessage(boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public ResponseMessage(boolean success, String msg, T data) {
        this.success = success;
        this.msg = msg;
        this.data = data;
    }

    public ResponseMessage(boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    public ResponseMessage(boolean success, String msg, T data, Boolean notify) {
        this.success = success;
        this.msg = msg;
        this.data = data;
        this.notify = notify;
    }

    public ResponseMessage(boolean success, T data, Boolean notify) {
        this.success = success;
        this.data = data;
        this.notify = notify;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Boolean getNotify() {
        return notify;
    }

    public void setNotify(Boolean notify) {
        this.notify = notify;
    }


}
