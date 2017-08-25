package com.xuetang9.xm.javabase.ancher.service;

import java.util.Arrays;

import com.xuetang9.xm.javabase.ancher.entity.Ancher;


/**
 *  主播管理服务类
 * @author 老九学堂-大师兄
 * @time 2017年8月10日 - 下午7:47:41
 * @copy Copyright &copy; 2015-2017 Extreme Academy
 * @home http://www.xuetang9.com
 * @address 成都市锦江区大慈寺路22号电信5所
 * @version 1.0.0
 */
public class Manager {
	/**
	 * 主播对象数组
	 */
	private Ancher [] anchers = new Ancher[100];
	
	/**
	 * 添加操作
	 * @param ancher
	 */
	public void add(Ancher ancher) {
		int index = -1;
		for (int i = 0; i < anchers.length; i++) {
			if(anchers[i]==null) {
				index = i;
			}
		}
		if(index==-1) {
			System.err.println("房间已满、暂时无法入住新主播，睡街边好了!");
		}else {
			anchers[index] = ancher;
		}
	}
	
	/**
	 * 展示操作
	 */
	public void display() {
		for (Ancher ancher : anchers) {
			if(null!=ancher) {
				System.out.println(ancher.toString()); // 在直接输出对象的时候、会调用对象的toString 方法。
			}
		}
	}
	
	/**
	 * 根据姓名查找主播
	 * @param name
	 * @return
	 */
	public Ancher findAncherByName(String name) {
		if(null==name) {
			System.err.println("名字还是要有的，不然就不好玩了。");
			return null;
		}
		for (Ancher ancher : anchers) { // 循环所有主播
			// 1. 保证当前元素不为空
			// 2. 主播的名字和传入的名字匹配
			if(null!=ancher && ancher.getName().equals(name)) {
				return ancher;
			}
		}
		return null; // 所有主播都找完了，发现还是没有返回空
	}
	
	/**
	 * 根据姓名删除主播
	 * @param name
	 */
	public void removeAncher(String name) {
		if(null==name) {
			System.err.println("名字还是要有的，不然就不好玩了。");
			return;
		}
		for (int i = 0; i < anchers.length; i++) {
			Ancher ancher = anchers[i];
			if(null!=ancher && ancher.getName().equals(name)) {
				anchers[i] = null;
				System.out.println("主播已经被关进小黑屋，暂时没有释放!");
				break;
			}
		}
	}
	
	/**
	 * 财富榜
	 */
	public void moneyDisplay() {
		Ancher [] listAnchers = Arrays.copyOf(anchers, 100); // 使用了数组工具类的 数组复制方法
		
		for (int i = 0; i < listAnchers.length - 1; i++) { // 外层循环长度减一
			for (int j = i; j < listAnchers.length - 1; j++) { // 内层循环从 i 开始到长度减一
				// 对象数组需要注意对空元素进行判断 ，否则会引发NullPointerException 
				// 对初学者尤其容易出现的一个问题
				if(listAnchers[j+1]==null || listAnchers[j]==null) { 
					continue;
				}
				// 根据财富进行顺序的交换
				if(listAnchers[j].getMoney() < listAnchers[j+1].getMoney()) {
					Ancher temp = listAnchers[j];
					listAnchers[j] = listAnchers[j+1];
					listAnchers[j+1] = temp;
				}
			}
		}
		// 交换完成之后直接输出
		for (Ancher ancher : listAnchers) {
			if(null!=ancher) {
				System.out.println(ancher);
			}
		}
	}
	
	/**
	 * 人气榜
	 */
	public void papulatilyDisplay() {
		Ancher [] listAnchers = Arrays.copyOf(anchers, 100);
		for (int i = 0; i < listAnchers.length - 1; i++) {
			for (int j = i; j < listAnchers.length - 1; j++) {
				if(listAnchers[j+1]==null || listAnchers[j]==null) {
					continue;
				}
				if(listAnchers[j].getPapulatily() < listAnchers[j+1].getPapulatily()) {
					Ancher temp = listAnchers[j];
					listAnchers[j] = listAnchers[j+1];
					listAnchers[j+1] = temp;
				}
			}
		}
		for (Ancher ancher : listAnchers) {
			if(null!=ancher) {
				System.out.println(ancher);
			}
		}
	}
}
