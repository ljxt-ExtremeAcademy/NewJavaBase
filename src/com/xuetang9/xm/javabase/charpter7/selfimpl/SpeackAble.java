/**
 * 
 */
package com.xuetang9.xm.javabase.charpter7.selfimpl;

/**
 *  能够说话的接口 ，完全当作抽象类使用。多实现
 *  在JDK1.8 中，方法是可以提供默认实现的。通过default 关键字修饰即可
 * @author <a href="http://www.xuetang9.com">老九学堂</a>-大师兄
 * @time 2017年8月31日 - 下午9:30:35
 * @copy Copyright &copy; 2015-2017 Extreme Academy
 * @home <a href="http://www.xuetang9.com">http://www.xuetang9.com</a>
 * @address 成都市锦江区大慈寺路22号电信5所
 * @version 1.0.0
 */
public interface SpeackAble {
	/**
	 * 接口中默认方法实现
	 */
	default void say() {
		System.out.println("君不见.黄河之水天上来,奔流到海不复还。");
		System.out.println("君不见.我为你学好掏心掏肺，你为游戏绞尽脑汁.");
	}
	
	default boolean hi() {
		System.out.println("美女，留个电话呗");
		return true;
	}
}
