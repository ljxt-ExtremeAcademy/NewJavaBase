/**
 * 
 */
package com.xuetang9.xm.javabase.oop.base;

import com.xuetang9.xm.javabase.utils.StringDataUtilsUp;

/**
 *  
 * @author <a href="http://www.xuetang9.com">老九学堂</a>-大师兄
 * @time 2017年8月17日 - 下午8:38:28
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
		SingleInstance.me().display(); // 直接调用一次
		SingleInstance instance = SingleInstance.me(); // 获取引用
		instance.display(); // 利用引用调用一次
		SingleInstance.me().showCount(); // 统计调用次数
		// 
		//System.in; 
		// 调用升级后的方法
		String randName = StringDataUtilsUp.me().randName();
		System.out.println(randName);
	}

}
