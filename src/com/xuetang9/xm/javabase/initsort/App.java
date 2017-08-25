/**
 * 
 */
package com.xuetang9.xm.javabase.initsort;

/**
 *  
 * @author <a href="http://www.xuetang9.com">老九学堂</a>-大师兄
 * @time 2017年8月24日 - 下午8:41:26
 * @copy Copyright &copy; 2015-2017 Extreme Academy
 * @home <a href="http://www.xuetang9.com">http://www.xuetang9.com</a>
 * @address 成都市锦江区大慈寺路22号电信5所
 * @version 1.0.0
 */
public class App {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person person =  new Person(); // Person 构造方法到底有没有返回值。 没有返回。new 关键字
		// 会获取到构造方法创建的对象的引用 。然后赋值给前边的引用变量
		person.display();
	}

}
