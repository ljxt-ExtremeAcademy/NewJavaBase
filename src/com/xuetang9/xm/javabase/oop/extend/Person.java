/**
 * 
 */
package com.xuetang9.xm.javabase.oop.extend;

/**
 *  人
 * @author <a href="http://www.xuetang9.com">老九学堂</a>-大师兄
 * @time 2017年8月24日 - 下午8:56:46
 * @copy Copyright &copy; 2015-2017 Extreme Academy
 * @home <a href="http://www.xuetang9.com">http://www.xuetang9.com</a>
 * @address 成都市锦江区大慈寺路22号电信5所
 * @version 1.0.0
 */
public class Person {
	
	public Person() {
	}
	
	private String name;
	private Integer age;
	private String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public final String toString() {
		return "父类公开方法！";
	}
	
}
