/**
 * 
 */
package com.xuetang9.xm.javabase.oop.polymorphic;

/**
 *  数学老师
 * @author <a href="http://www.xuetang9.com">老九学堂</a>-大师兄
 * @time 2017年8月24日 - 下午9:41:47
 * @copy Copyright &copy; 2015-2017 Extreme Academy
 * @home <a href="http://www.xuetang9.com">http://www.xuetang9.com</a>
 * @address 成都市锦江区大慈寺路22号电信5所
 * @version 1.0.0
 */
public class MathTeacher extends Teacher {

	/**
	 * @param name
	 */
	public MathTeacher(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.xuetang9.xm.javabase.oop.polymorphic.Teacher#teach()
	 */
	@Override
	public void teach() {
		System.out.println("x²-3x+1=0的值是?");
	}

}
