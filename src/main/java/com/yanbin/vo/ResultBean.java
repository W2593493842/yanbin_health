package com.yanbin.vo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class ResultBean  {
    private int code;
    private String msg;
    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ResultBean(String msg, Object data) {
        this.msg = msg;
        this.data = data;
    }

    public ResultBean() {
    }
}
