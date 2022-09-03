package com.wxs.Facatory;

import com.wxs.domain.ResponseMessage;

public class MessageFacatory {

    public static ResponseMessage success() {
        ResponseMessage rm = new ResponseMessage();
        rm.setCode(200);
        rm.setSuccess(true);
        return rm;
    }

    public static ResponseMessage success(Object data) {
        ResponseMessage rm = new ResponseMessage();
        rm.setCode(200);
        rm.setSuccess(true);
        rm.setData(data);
        return rm;
    }

    public static ResponseMessage error() {
        ResponseMessage rm = new ResponseMessage();
        rm.setCode(500);
        rm.setSuccess(false);
        return rm;
    }

    public static ResponseMessage error(Object data) {
        ResponseMessage rm = new ResponseMessage();
        rm.setCode(500);
        rm.setSuccess(false);
        rm.setData(data);
        return rm;
    }


    public static ResponseMessage success(String msg) {
        ResponseMessage rm = new ResponseMessage();
        rm.setCode(200);
        rm.setSuccess(true);
        rm.setMsg(msg);
        return rm;
    }

    public static ResponseMessage success(String msg, Object data) {
        ResponseMessage rm = new ResponseMessage();
        rm.setCode(200);
        rm.setSuccess(true);
        rm.setData(data);
        rm.setMsg(msg);
        return rm;
    }

    public static ResponseMessage error(String msg) {
        ResponseMessage rm = new ResponseMessage();
        rm.setCode(500);
        rm.setSuccess(false);
        rm.setMsg(msg);
        return rm;
    }

    public static ResponseMessage error(String msg, Object data) {
        ResponseMessage rm = new ResponseMessage();
        rm.setCode(500);
        rm.setSuccess(false);
        rm.setData(data);
        rm.setMsg(msg);
        return rm;
    }
}
