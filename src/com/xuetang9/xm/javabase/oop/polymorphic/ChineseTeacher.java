/**
 * 
 */
package com.xuetang9.xm.javabase.oop.polymorphic;

/**
 *  
 * @author <a href="http://www.xuetang9.com">老九学堂</a>-大师兄
 * @time 2017年8月24日 - 下午9:40:04
 * @copy Copyright &copy; 2015-2017 Extreme Academy
 * @home <a href="http://www.xuetang9.com">http://www.xuetang9.com</a>
 * @address 成都市锦江区大慈寺路22号电信5所
 * @version 1.0.0
 */
public class ChineseTeacher extends Teacher {
	

	public ChineseTeacher(String name) {
		super(name);
	}

	/* (non-Javadoc)
	 * @see com.xuetang9.xm.javabase.oop.polymorphic.Teacher#teach()
	 */
	@Override
	public void teach() {
		System.out.println("窈窕淑女，君子好逑！");
	}

}
