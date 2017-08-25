/**
 * 
 */
package com.xuetang9.xm.javabase.oop.polymorphic;

/**
 *  英语老师
 * @author <a href="http://www.xuetang9.com">老九学堂</a>-大师兄
 * @time 2017年8月24日 - 下午9:43:22
 * @copy Copyright &copy; 2015-2017 Extreme Academy
 * @home <a href="http://www.xuetang9.com">http://www.xuetang9.com</a>
 * @address 成都市锦江区大慈寺路22号电信5所
 * @version 1.0.0
 */
public class EnglishTeacher extends Teacher {

	/**
	 * 
	 */
	public EnglishTeacher(String name) {
		super(name);
	}
	
	@Override
	public void teach() {
		System.out.println("No zuo,No Die!");
	}

}
