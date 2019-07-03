package com.criss.wang.entity;

import java.util.ArrayList;
import java.util.List;

import com.criss.wang.base.Observer;
import com.criss.wang.base.Observerable;

/**
 *
 * author: wangqiubao
 *
 * date: 2019-07-03 17:39:46
 *
 * describe: 主动发送方
 */
public class ActiveSend implements Observerable {

	private List<Observer> list = new ArrayList<>();
	private String message;

	@Override
	public void registerObserver(Observer o) {
		list.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		if(!list.isEmpty()) {
			list.remove(o);
		}
	}

	@Override
	public void notifyObserver() {
		for(Observer o : list) {
			o.update(message);
		}
	}

	public void sendMessage(String str) {
		this.message = str;
		System.out.println("发送方：" + message);
		notifyObserver();
	}

}
