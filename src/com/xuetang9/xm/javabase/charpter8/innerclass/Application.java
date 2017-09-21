/**
 * 
 */
package com.xuetang9.xm.javabase.charpter8.innerclass;

import com.xuetang9.xm.javabase.charpter8.innerclass.Cup.Head;

/**
 *  
 * @author <a href="http://www.xuetang9.com">老九学堂</a>-大师兄
 * @time 2017年9月21日 - 下午8:08:42
 * @copy Copyright &copy; 2015-2017 Extreme Academy
 * @home <a href="http://www.xuetang9.com">http://www.xuetang9.com</a>
 * @address 成都市锦江区大慈寺路22号电信5所
 * @version 1.0.0
 */
public class Application {
	/**
	 * 实现接口的匿名内部类
	 * @param args
	 */
	public static void main(String[] args) {
		// 假设说我是一个小孩子，我只是知道拿着东西就往嘴里塞
		EatAble eat = new EatAble() {
			@Override
			public String desc() {
				StringBuilder sbd = new StringBuilder();
				sbd.append("小伙子很幸运，顺手在小山坡。偷了王阿姨家的梨。咬到口里流出了清甜果汁。");
				return sbd.toString();
			}
		};
		System.out.println(eat.desc());
	}
	
	/**
	 * 继承父类的匿名内部类
	 * 
	 * 当调用构造方法语法之后添加大括号时。
	 * java虚拟机会帮助我们生成一个匿名的内部类
	 * 名称通常是外部类名$数字
	 * 数字通常表示这个匿名内部类是外部内的第几个内部类
	 * @param args
	 */
	public static void extends_parent_main(String[] args) {
		
		Object obj = new Object() {
			@Override
			public String toString() {
				StringBuilder sbd = new StringBuilder();
				sbd.append("登鹳雀楼\n");
				sbd.append("\t王之涣\n");
				sbd.append("白日依山尽,\t");
				sbd.append("黄河入海流。\t\n");
				sbd.append("欲穷千里目，\t");
				sbd.append("更上一层楼。\t\n");
				return sbd.toString();
			}
		}; //
		System.out.println(obj); // ActionListener . MouseAdapter
		
	}
	
	/**
	 * 方法中的内部类
	 * @param args
	 */
	public static void method_inner_main(String[] args) {
		Sword swrd_normal = new Sword();
		swrd_normal.setName("普通的铁剑");
		swrd_normal.attack("欣欣");
		System.out.println("---------------------------------");
		Sword swrd_advice = Sword.addviceSword();
		swrd_advice.attack("马蓉");
		
	}
	
	/**
	 * 测试成员内部类
	 * @param args
	 */
	public static void menber_inner_main(String[] args) {
		
		//new Cup().new Head("青花瓷");
		Cup cup = new Cup(); // 创建外部类对象
		Head head = cup.new Head("青花瓷");// 通过对象.new 的方式创建成员内部内的对象
		cup.setHead(head);
		cup.setBody(cup.new Body("青花瓷")); // 成员内部内的创建与调用
	}
	
	/**
	 * 当使用静态内部类的时候，外部类类似于普通类的包名
	 * @param args
	 */
	public static void static_inner_main(String[] args) {
		StudentManager stumanager = new StudentManager();
		//Student stu = new Student("李白",20);
		stumanager.add("李小白",20);
		stumanager.add("小师妹", 18);
		
		stumanager.display();
		
	}

}
