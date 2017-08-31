/**
 * 
 */
package com.xuetang9.xm.javabase.charpter7.selfimpl;

/**
 *  测试接口的默认实现
 * @author <a href="http://www.xuetang9.com">老九学堂</a>-大师兄
 * @time 2017年8月31日 - 下午9:33:37
 * @copy Copyright &copy; 2015-2017 Extreme Academy
 * @home <a href="http://www.xuetang9.com">http://www.xuetang9.com</a>
 * @address 成都市锦江区大慈寺路22号电信5所
 * @version 1.0.0
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpeackAble speack = new SpeackAble() {}; // 这对小括号代表的就是匿名内部类
		speack.say();
		speack = new Student();
		speack.say();
	}

}
