/**
 * 
 */
package com.xuetang9.xm.javabase.oop.base;

/**
 *  银行卡实体类
 * @author <a href="http://www.xuetang9.com">老九学堂</a>-大师兄
 * @time 2017年8月17日 - 下午8:19:42
 * @copy Copyright &copy; 2015-2017 Extreme Academy
 * @home <a href="http://www.xuetang9.com">http://www.xuetang9.com</a>
 * @address 成都市锦江区大慈寺路22号电信5所
 * @version 1.0.0
 */
public class BankCard {
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 余额
	 */
	private int blance;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBlance() {
		return blance;
	}
	public void setBlance(int blance) {
		this.blance = blance;
	}
	public BankCard(String name, int blance) {
		this.name = name;
		this.blance = blance;
	}
	public BankCard() {
	}
	
}
