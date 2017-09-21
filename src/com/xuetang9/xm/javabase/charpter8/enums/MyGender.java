/**
 * 
 */
package com.xuetang9.xm.javabase.charpter8.enums;

/**
 *  
 * @author <a href="http://www.xuetang9.com">老九学堂</a>-大师兄
 * @time 2017年9月21日 - 下午9:34:34
 * @copy Copyright &copy; 2015-2017 Extreme Academy
 * @home <a href="http://www.xuetang9.com">http://www.xuetang9.com</a>
 * @address 成都市锦江区大慈寺路22号电信5所
 * @version 1.0.0
 */
public class MyGender {
	/**
	 * 男
	 */
	public static final MyGender MALE = new MyGender("MALE", "男");
	/**
	 * 女
	 */
	public static final MyGender FEMALE = new MyGender("MALE", "女");
	
	
	private MyGender(String name,String zhName) {
		this.name = name;
		this.zhName = zhName;
	}
	private String name;
	private String zhName;
	
	
	public String getZhName() {
		return zhName;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
