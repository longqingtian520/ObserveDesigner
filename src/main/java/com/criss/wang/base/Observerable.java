package com.criss.wang.base;

/**
 *
 * author: wangqiubao
 *
 * date: 2019-07-03 17:35:24
 *
 * describe: 抽象被观察者接口
 * 声明了添加、删除、通知观察者方法
 */
public interface Observerable {

	void registerObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObserver();
}
