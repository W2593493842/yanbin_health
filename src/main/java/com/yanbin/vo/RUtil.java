package com.yanbin.vo;

public class RUtil {
    public static R setOK(String msg,Object data){
        return new R(1000,msg,data);
    }
    public static R setERROR(String msg,Object data){
        return new R(2000,msg,null);
    }




}
