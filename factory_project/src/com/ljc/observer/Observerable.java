package com.ljc.observer;

import com.ljc.observer.Observers;

/***
 * 抽象被观察者接口
 * 声明了添加、删除、通知观察者方法
 * @author
 *
 */
public interface Observerable {

    public void registerObserver(Observers o);
    public void removeObserver(Observers o);
    public void notifyObserver();

}
