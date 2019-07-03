package com.criss.wang.service;

import com.criss.wang.base.Observer;
import com.criss.wang.entity.ActiveSend;
import com.criss.wang.entity.PassiveReceiver;

public class Test {
	public static void main(String[] sa) {
		 ActiveSend server = new ActiveSend();

	     Observer userZhang = new PassiveReceiver("ZhangSan");
	     Observer userLi = new PassiveReceiver("LiSi");
	     Observer userWang = new PassiveReceiver("WangWu");

	     server.registerObserver(userZhang);
	     server.registerObserver(userLi);
	     server.registerObserver(userWang);
	     server.sendMessage("PHP是世界上最好用的语言！");

	     System.out.println("----------------------------------------------");
	     server.removeObserver(userZhang);
	     server.sendMessage("JAVA是世界上最好用的语言！");
	}

}
