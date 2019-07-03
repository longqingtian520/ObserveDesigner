package com.criss.wang.entity;

import com.criss.wang.base.Observer;

/**
 * author: wangqiubao
 *
 * date: 2019-07-03 18:04:21
 *
 * describe:观察者
 */
public class PassiveReceiver implements Observer {

	private String username;

	private String message;

	public PassiveReceiver(String username) {
		super();
		this.username = username;
	}

	@Override
	public void update(String message) {
		this.message = message;
		read();
	}

	public void read() {
		System.out.println(username + "收到推送的消息：" + message);
	}

}
