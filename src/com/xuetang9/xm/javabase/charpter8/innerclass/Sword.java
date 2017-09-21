/**
 * 
 */
package com.xuetang9.xm.javabase.charpter8.innerclass;

/**
 *  刀剑类
 * @author <a href="http://www.xuetang9.com">老九学堂</a>-大师兄
 * @time 2017年9月21日 - 下午8:33:35
 * @copy Copyright &copy; 2015-2017 Extreme Academy
 * @home <a href="http://www.xuetang9.com">http://www.xuetang9.com</a>
 * @address 成都市锦江区大慈寺路22号电信5所
 * @version 1.0.0
 */
public class Sword {
	/**
	 * 佩剑名称
	 */
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 攻击的方法
	 * @param name 被攻击者的名称
	 */
	public void attack(String attakName) {
		System.out.println(name+"刺向了"+attakName);
	}
	
	/**
	 * 获得增强的剑的对象
	 * @return
	 */
	public static Sword addviceSword() {
		/**
		 * 这一个类型是方法中的内部类，即局部的内部类
		 *  
		 * @author <a href="http://www.xuetang9.com">老九学堂</a>-大师兄
		 * @time 2017年9月21日 - 下午8:41:06
		 * @copy Copyright &copy; 2015-2017 Extreme Academy
		 * @home <a href="http://www.xuetang9.com">http://www.xuetang9.com</a>
		 * @address 成都市锦江区大慈寺路22号电信5所
		 * @version 1.0.0
		 */
		class AddVicesword extends Sword{
			@Override
			public void attack(String attakName) {
				StringBuilder sbd = new StringBuilder();
				sbd.append(this.getName()).append("以不可见的速度飞向了").append(attakName);
				sbd.append("的身体。").append(attakName).append("身体流出了鲜红的液体.");
				System.out.println(sbd);
			}
		}
		// 返回通过增强的类
		AddVicesword adsword = new AddVicesword();
		adsword.setName("大光明之剑");
		return adsword;
	}
}
