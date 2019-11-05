package com.ljc.observer;

import java.util.Observer;

public class TestObserver {

    public static void main(String[] args) {
        WechatServer server = new WechatServer();

        Observers userZhang = new User("ZhangSan");
        Observers userLi = new User("LiSi");
        Observers userWang = new User("WangWu");

        server.registerObserver(userZhang);
        server.registerObserver(userLi);
        server.registerObserver(userWang);
        server.setInfomation("PHP是世界上最好用的语言！");

        System.out.println("----------------------------------------------");
        server.removeObserver(userZhang);
        server.setInfomation("JAVA是世界上最好用的语言！");

    }
}
