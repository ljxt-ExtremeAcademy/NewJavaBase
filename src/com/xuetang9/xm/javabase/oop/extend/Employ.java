/**
 * 
 */
package com.xuetang9.xm.javabase.oop.extend;

/**
 *  员工
 * @author <a href="http://www.xuetang9.com">老九学堂</a>-大师兄
 * @time 2017年8月24日 - 下午8:58:48
 * @copy Copyright &copy; 2015-2017 Extreme Academy
 * @home <a href="http://www.xuetang9.com">http://www.xuetang9.com</a>
 * @address 成都市锦江区大慈寺路22号电信5所
 * @version 1.0.0
 */
public class Employ extends Person {
	/**
	 * 有两个地方需要强制使用super 关键字
	 * 1. 构造方法中需要调用父类的构造方法
	 * 2. 重载父类方法的时候，还需要调用父类的方法。使用super
	 */
	public Employ() {
		super();
	}
	
	private String empNo;
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	
	/*@Override
	public String toString() {
		return super.toString();
	}*/
}
