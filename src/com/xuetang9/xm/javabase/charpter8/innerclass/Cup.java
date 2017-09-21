/**
 * 
 */
package com.xuetang9.xm.javabase.charpter8.innerclass;

/**
 *  杯子
 * @author <a href="http://www.xuetang9.com">老九学堂</a>-大师兄
 * @time 2017年9月21日 - 下午8:20:52
 * @copy Copyright &copy; 2015-2017 Extreme Academy
 * @home <a href="http://www.xuetang9.com">http://www.xuetang9.com</a>
 * @address 成都市锦江区大慈寺路22号电信5所
 * @version 1.0.0
 */
public class Cup {
	/**
	 * 杯盖
	 *  普通成员内部类，
	 *  在外部需要创建对象时候，必须使用外内部类所在的外部类来创建
	 * @author <a href="http://www.xuetang9.com">老九学堂</a>-大师兄
	 * @time 2017年9月21日 - 下午8:22:50
	 * @copy Copyright &copy; 2015-2017 Extreme Academy
	 * @home <a href="http://www.xuetang9.com">http://www.xuetang9.com</a>
	 * @address 成都市锦江区大慈寺路22号电信5所
	 * @version 1.0.0
	 */
	public class Head{
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		public Head(String name) {
			this.name = name;
		}
	}
	/**
	 * 杯身
	 *  
	 * @author <a href="http://www.xuetang9.com">老九学堂</a>-大师兄
	 * @time 2017年9月21日 - 下午8:24:31
	 * @copy Copyright &copy; 2015-2017 Extreme Academy
	 * @home <a href="http://www.xuetang9.com">http://www.xuetang9.com</a>
	 * @address 成都市锦江区大慈寺路22号电信5所
	 * @version 1.0.0
	 */
	public class Body{
		private String name;
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public Body(String name) {
			this.name = name;
		}
	}
	
	private Head head;
	private Body body;
	public Head getHead() {
		return head;
	}
	public void setHead(Head head) {
		this.head = head;
	}
	public Body getBody() {
		return body;
	}
	public void setBody(Body body) {
		this.body = body;
	}
	
}
