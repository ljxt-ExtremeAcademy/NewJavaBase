/**
 * 
 */
package com.xuetang9.xm.javabase.charpter8.enums;

/**
 *  
 * @author <a href="http://www.xuetang9.com">老九学堂</a>-大师兄
 * @time 2017年9月21日 - 下午9:15:24
 * @copy Copyright &copy; 2015-2017 Extreme Academy
 * @home <a href="http://www.xuetang9.com">http://www.xuetang9.com</a>
 * @address 成都市锦江区大慈寺路22号电信5所
 * @version 1.0.0
 */
public class Application {

	/**
	 * 枚举泛型方式的继承操作
	 * @param args
	 */
	public static void main(String[] args) {
		class Gen extends GenTest<Gen>{
			
		}
		
		System.out.println(new Gen().toString());
	}
	
	/**
	 * 模拟枚举的实现
	 * @param args
	 */
	public static void study_enum_main(String [] args) {
		MyGender fe =  MyGender.MALE;
		System.out.println(fe.getZhName());
	}
	
	/**
	 * 枚举的实现细节
	 * 枚举是 Enum 类型的子类
	 * 
	 * @param args
	 */
	public static void reason_main(String[] args) {
		//System.out.println(Gender.MALE.ordinal());
		//System.out.println(Gender.FEMALE.ordinal());
		Gender gender = Gender.valueOf("MALE");
		System.out.println(gender.getZhName());
	}
	
	/**
	 * 常用的枚举的使用
	 * @param args
	 */
	public static void normal_main(String[] args) {
		Person person  = new Person();
		person.setName("曹操");
		person.setGender(Gender.MALE);
		System.out.println(person);
	}

}
