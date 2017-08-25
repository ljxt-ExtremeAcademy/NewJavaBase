package com.xuetang9.xm.javabase.ancher.entity;


/**
 * 主播实体类
 * @author 老九学堂-大师兄
 * @time 2017年8月10日 - 下午7:47:26
 * @copy Copyright &copy; 2015-2017 Extreme Academy
 * @home http://www.xuetang9.com
 * @address 成都市锦江区大慈寺路22号电信5所
 * @version 1.0.0
 */
public class Ancher {
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 性别
	 */
	private final String gender = "女";
	/**
	 * 财富
	 */
	private int money;
	/**
	 * 魅力值
	 */
	private int papulatily;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getPapulatily() {
		return papulatily;
	}
	public void setPapulatily(int papulatily) {
		this.papulatily = papulatily;
	}
	public String getGender() {
		return gender;
	}
	
	@Override
	public String toString() {
		StringBuilder sbd = new StringBuilder();
		sbd.append("姓名:").append(name);
		sbd.append("\t性别:").append(gender);
		sbd.append("\t财富:").append(money);
		sbd.append("\t魅力值:").append(papulatily);
		return sbd.toString();
	}
	
}
