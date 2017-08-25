/**
 * 
 */
package com.xuetang9.xm.javabase.oop.polymorphic;

/**
 *  
 * @author <a href="http://www.xuetang9.com">老九学堂</a>-大师兄
 * @time 2017年8月24日 - 下午9:49:42
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
		Teacher [] teacher = {new ChineseTeacher("余秋雨"),new MathTeacher("钱学森"),new EnglishTeacher("罗永浩")};
		ClassRom room = new ClassRom();
		room.setName("三楼二教");
		
		Education edu = new Education();
		edu.setRom(room);
		for (Teacher teach : teacher) {
			edu.setTeacher(teach);
			edu.attend();
		}
	}

}
