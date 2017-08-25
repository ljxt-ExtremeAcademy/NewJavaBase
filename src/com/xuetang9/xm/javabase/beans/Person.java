/**
 * 
 */
package com.xuetang9.xm.javabase.beans;

/**
 *  人的类型
 * @author <a href="http://www.xuetang9.com">老九学堂</a>-大师兄
 * @time 2017年8月24日 - 下午8:09:00
 * @copy Copyright &copy; 2015-2017 Extreme Academy
 * @home <a href="http://www.xuetang9.com">http://www.xuetang9.com</a>
 * @address 成都市锦江区大慈寺路22号电信5所
 * @version 1.0.0
 */
public class Person {
	
	{
		System.out.println("nihao");
	}// 代码片段，一般在java中不推荐使用
	
	public Person() {
		this(null, 0, false);
	}
	
	public Person(String name) {
		this(name,0,false);
	}
	
	public Person(String name,int age,boolean gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	private String name;
	private int age;
	private boolean gender;
	public String getName() {
		return name; // this 关键字被省略掉了 getter /setter
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	
}
