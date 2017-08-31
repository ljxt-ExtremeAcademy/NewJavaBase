/**
 * 
 */
package com.xuetang9.xm.javabase.charpter7.baseinterface;

/**
 *  测试类，演示不同屏幕的不同输出
 * @author <a href="http://www.xuetang9.com">老九学堂</a>-大师兄
 * @time 2017年8月31日 - 下午8:08:21
 * @copy Copyright &copy; 2015-2017 Extreme Academy
 * @home <a href="http://www.xuetang9.com">http://www.xuetang9.com</a>
 * @address 成都市锦江区大慈寺路22号电信5所
 * @version 1.0.0
 */
public class Application {

	/**
	 * new VGA[]{} , 创建VGA 类型的数组对象
	 * 大括号中的new DefaultScreen() , 才是获得接口的实现类对象
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/*VGA [] vgas = new VGA[] {// 定义接口数组
			new DefaultScreen(),
			new TVScreen()
		}; */
		VGA [] vgas = new VGA[2]; 
		vgas[0] = new DefaultScreen();
		vgas[1] = new TVScreen();
		
		// 定义一个用于显示的数据
		String data = "书山有路勤为径，学海无涯苦作舟。";
		for (VGA vga : vgas) { // 让所有屏幕显示数据
			vga.recive(data);
		}
	}

}
