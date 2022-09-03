package com.wxs;

import com.wxs.Facatory.MessageFacatory;

public class Test {
    public static void main(String[] args) {
        System.out.println(MessageFacatory.error());
        System.out.println(MessageFacatory.error("错误1！"));
        System.out.println(MessageFacatory.error("错误2！", "data=123"));


        System.out.println(MessageFacatory.success());
        System.out.println(MessageFacatory.success("错误1！"));
        System.out.println(MessageFacatory.error("错误2！", "data=990"));


    }
}
