package com.xuetang9.xm.javabase.ancher.entity;


/**
 * ����ʵ����
 * @author �Ͼ�ѧ��-��ʦ��
 * @time 2017��8��10�� - ����7:47:26
 * @copy Copyright &copy; 2015-2017 Extreme Academy
 * @home http://www.xuetang9.com
 * @address �ɶ��н����������·22�ŵ���5��
 * @version 1.0.0
 */
public class Ancher {
	/**
	 * ����
	 */
	private String name;
	/**
	 * �Ա�
	 */
	private final String gender = "Ů";
	/**
	 * �Ƹ�
	 */
	private int money;
	/**
	 * ����ֵ
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
		sbd.append("����:").append(name);
		sbd.append("\t�Ա�:").append(gender);
		sbd.append("\t�Ƹ�:").append(money);
		sbd.append("\t����ֵ:").append(papulatily);
		return sbd.toString();
	}
	
}
