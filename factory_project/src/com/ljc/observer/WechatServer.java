package com.ljc.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;


/**
 * 被观察者，也就是微信公众号服务
 * 实现了Observerable接口，对Observerable接口的三个方法进行了具体实现
 * @author
 *
 */
public class WechatServer implements Observerable {

    //注意到这个List集合的泛型参数为Observer接口，设计原则：面向接口编程而不是面向实现编程
    private List<Observers> list;
    private String message;

    public WechatServer() {
        list = new ArrayList<Observers>();
    }


    //遍历
    @Override
    public void notifyObserver() {
        for(int i = 0; i < list.size(); i++) {
            Observers oserver = list.get(i);
            oserver.update(message);
        }
    }

    public void setInfomation(String s) {
        this.message = s;
        System.out.println("微信服务更新消息： " + s);
        //消息更新，通知所有观察者
        notifyObserver();
    }


    @Override
    public void registerObserver(Observers o) {

        list.add(o);
    }

    @Override
    public void removeObserver(Observers o) {
        if(!list.isEmpty())
            list.remove(o);
    }


}