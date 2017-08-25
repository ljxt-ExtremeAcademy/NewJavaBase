/**
 * 
 */
package com.xuetang9.xm.javabase.oop.base;

/**
 *  单例模式
 *  1. 将构造方法私有化
 *  2. 提供一个私有静态属性  （饿汉：在这里创建对象）
 *  3. 提供公有的外部访问方法 （懒汉：在这里创建对象）
 *  
 * @author <a href="http://www.xuetang9.com">老九学堂</a>-大师兄
 * @time 2017年8月17日 - 下午8:32:32
 * @copy Copyright &copy; 2015-2017 Extreme Academy
 * @home <a href="http://www.xuetang9.com">http://www.xuetang9.com</a>
 * @address 成都市锦江区大慈寺路22号电信5所
 * @version 1.0.0
 */
public class SingleInstance {
	
	private SingleInstance() {} // 保证外部不能够通过new 调用创建其他对象
	
	private static SingleInstance _me = new SingleInstance();
	
	public static SingleInstance me() {
		return _me;
	}
	
	private int i = 0; // 计数器
	
	public void display() {
		i++;
		System.out.println("白毛浮绿水，红掌拨清波！");
	}
	
	public void showCount() {
		System.out.println("对象的方法被调用了"+i+"次");
	}
	

}
