/**
 * 
 */
package com.xuetang9.xm.javabase.charpter8.enums;

/**
 *  
 * @author <a href="http://www.xuetang9.com">老九学堂</a>-大师兄
 * @time 2017年9月21日 - 下午9:15:51
 * @copy Copyright &copy; 2015-2017 Extreme Academy
 * @home <a href="http://www.xuetang9.com">http://www.xuetang9.com</a>
 * @address 成都市锦江区大慈寺路22号电信5所
 * @version 1.0.0
 */
public class Person {
	private String name;
	private Gender gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public Person() {
	}
	
	@Override
	public String toString() {
		StringBuilder sbd = new StringBuilder();
		sbd.append("name->").append(name);
		//String disgender = gender.equals(Gender.MALE)?"雌":"雄";
		sbd.append(",gender->").append(gender.getZhName());
		return sbd.toString();
	}
}
