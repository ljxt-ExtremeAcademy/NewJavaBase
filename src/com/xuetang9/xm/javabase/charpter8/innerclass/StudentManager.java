/**
 * 
 */
package com.xuetang9.xm.javabase.charpter8.innerclass;

import java.util.ArrayList;
import java.util.List;

/**
 *  静态的内部类
 * @author <a href="http://www.xuetang9.com">老九学堂</a>-大师兄
 * @time 2017年9月21日 - 下午8:04:16
 * @copy Copyright &copy; 2015-2017 Extreme Academy
 * @home <a href="http://www.xuetang9.com">http://www.xuetang9.com</a>
 * @address 成都市锦江区大慈寺路22号电信5所
 * @version 1.0.0
 */
public class StudentManager {
	
	/**
	 *  学生类
	 *  在一个类文件中，不可以包含多个外部类的public 类。当public 类型作为子类的时候
	 *  可以添加任意多个。
	 *  
	 * @author <a href="http://www.xuetang9.com">老九学堂</a>-大师兄
	 * @time 2017年9月21日 - 下午8:05:00
	 * @copy Copyright &copy; 2015-2017 Extreme Academy
	 * @home <a href="http://www.xuetang9.com">http://www.xuetang9.com</a>
	 * @address 成都市锦江区大慈寺路22号电信5所
	 * @version 1.0.0
	 */
	private static class Student{
		
		public Student() {
			
		}
		
		public Student(String name, Integer age) {
			this.name = name;
			this.age = age;
			System.out.println(this.getClass().getName());
		}


		private String name;
		private Integer age;
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
		
		/**
		 * 将对象信息用字符串表示
		 */
		@Override
		public String toString() {
			StringBuilder sbd = new StringBuilder(name);
			sbd.append("\t").append(age);
			return sbd.toString();
		}
		
	}
	/**
	 * 所有的学生信息
	 */
	private List<Student> stus = new ArrayList<>();
	
	/**
	 * 添加方法
	 * @param stu
	 */
	public void add(Student stu) {
		stus.add(stu);
	}
	
	public void add(String name,Integer age) {
		add(new Student(name, age));
	}
	
	/**
	 * 展示所有的学生信息
	 */
	public void display() {
		System.out.println("姓名\t\t年龄");
		for (Student stu : stus) {
			System.out.println(stu);
		}
	}
}
