/**
 * 
 */
package com.xuetang9.xm.javabase.oop.polymorphic;

/**
 *  老师类
 * @author <a href="http://www.xuetang9.com">老九学堂</a>-大师兄
 * @time 2017年8月24日 - 下午9:38:05
 * @copy Copyright &copy; 2015-2017 Extreme Academy
 * @home <a href="http://www.xuetang9.com">http://www.xuetang9.com</a>
 * @address 成都市锦江区大慈寺路22号电信5所
 * @version 1.0.0
 */
public abstract class Teacher {
	private String name;
	public Teacher(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public abstract void teach();
}
