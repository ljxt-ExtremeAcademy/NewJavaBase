/**
 * 
 */
package com.xuetang9.xm.javabase.oop.base;

import java.awt.event.KeyEvent;

/**
 *  演示常量的使用
 * @author <a href="http://www.xuetang9.com">老九学堂</a>-大师兄
 * @time 2017年8月17日 - 下午8:16:24
 * @copy Copyright &copy; 2015-2017 Extreme Academy
 * @home <a href="http://www.xuetang9.com">http://www.xuetang9.com</a>
 * @address 成都市锦江区大慈寺路22号电信5所
 * @version 1.0.0
 */
public class SimpleConst {
	public static void main(String[] args) {
		// 定义大师兄的性别取向（0:男，1：女）
		final int genderchoice = 1;
		int otherchoice = 1;
		
		// 修改值的内容
		otherchoice = 0;
//		genderchoice = 0; 
		
		// 创建银行卡对象
		BankCard card = new BankCard("大师兄", 10000);
		
		// 够买物品，消费了三千
		pay(card, 3000);
		// 显示最终的余额
		System.out.println(card.getBlance());
//		Integer.MAX_VALUE = 5000; // 静态常量
		System.out.println(Integer.MAX_VALUE);
		System.out.println(KeyEvent.VK_A); //  
		
	}
	
	/**
	 * 要求在支付过程中，卡不能被替换掉
	 * 虽然卡不能被替换掉，但是卡中的余额被替换掉了。（why）使用final 修饰的常量值不可修改。原因是
	 * 使用final 修饰引用类型变量的时候，要求是引用不可以被修改，但是引用指向的对象的值是可以被修改的。
	 * @param card
	 * @param money
	 */
	public static void pay(final BankCard card,int money) {
//		card = new BankCard(); // 在这里悄悄换卡的时候就不允许
		card.setBlance(card.getBlance() - money);
	}
}
