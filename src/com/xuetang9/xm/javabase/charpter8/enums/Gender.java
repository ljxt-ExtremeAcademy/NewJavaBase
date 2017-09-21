/**
 * 
 */
package com.xuetang9.xm.javabase.charpter8.enums;

/**
 * 枚举的的对象是被指定的。
 * 解决的问题是，一个类型只能创建指定个数的对象。
 * 枚举中的选项是一个静态的常量。通过调用枚举的私有构造方法创建的常量
 * @author <a href="http://www.xuetang9.com">老九学堂</a>-大师兄
 * @time 2017年9月21日 - 下午9:13:12
 * @copy Copyright &copy; 2015-2017 Extreme Academy
 * @home <a href="http://www.xuetang9.com">http://www.xuetang9.com</a>
 * @address 成都市锦江区大慈寺路22号电信5所
 * @version 1.0.0
 */
public enum Gender {
	/**
	 * 男
	 */
	MALE("男"),
	/**
	 * 女
	 */
	FEMALE("女");
	/**
	 * 枚举的私有构造方法
	 */
	private Gender(String zh) {
		zhName = zh;
	}
	
	private String zhName;
	public String getZhName() {
		return zhName;
	}
	
}
