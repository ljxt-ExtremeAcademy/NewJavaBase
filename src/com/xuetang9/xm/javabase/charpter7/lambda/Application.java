/**
 * 
 */
package com.xuetang9.xm.javabase.charpter7.lambda;

import com.xuetang9.xm.javabase.oop.extend.MyString;

/**
 *  演示Lambda 表达式
 *  Lambda 表达式，是对于接口实现的一种高度抽象的写法而已。适用于在接口中只有一个
 *  方法的时候。（Runable , Callable）
 * @author <a href="http://www.xuetang9.com">老九学堂</a>-大师兄
 * @time 2017年8月31日 - 下午8:17:33
 * @copy Copyright &copy; 2015-2017 Extreme Academy
 * @home <a href="http://www.xuetang9.com">http://www.xuetang9.com</a>
 * @address 成都市锦江区大慈寺路22号电信5所
 * @version 1.0.0
 */
class DrawUtil{
	public void draw(Pen pen) {
		pen.drawText("君不见.黄河之水天上来,奔流到海不复还。");
	}
}

public class Application {
	
	/**
	 * 一个外部的对象
	 */
	private static DrawUtil util = new DrawUtil();
	
	/**
	 * 在实现接口调用的时候,发现某一个对象方法和当前方法需要实现的内容完全一致.
	 * 此时可以使用对象方法的引用
	 * 语法: 对象名::方法名
	 * @param args
	 */
	public static void main(String[] args) {
		Canvas canvas = new Canvas();
		canvas.draw(util::draw);
	}
	
	/**
	 * 在实现接口调用的时候,发现某一个静态方法和当前方法需要实现的内容完全一致.
	 * 此时可以使用静态方法的引用
	 * 语法: 静态方法所在类名::方法名
	 * @param args
	 */
	public static void main_static_method_reference(String[] args) {
		Canvas canvas = new Canvas(); // 创建绘制对象
		/*canvas.draw(new CallBack() {
			@Override
			public void call(Pen pen) {
				Application.contentdraw(pen);
			}
		});*/
		/*canvas.draw((pen)->Application.contentdraw(pen));*/
		canvas.draw(Application::contentdraw); // 静态方法的引用
	}
	
	/**
	 * 有一个静态的方法实现了绘制
	 * @param pen
	 */
	public static void contentdraw(Pen pen) {
		System.out.println("使用多条语句的lambda表达式的使用");
		pen.drawText(" 乾、兑、 离、震、巽、坎、艮、坤"); // 八卦
		pen.reatage();
	}
	
	/**
	 * 如果实现方法有两句以及以上代码的时候,如何实现
	 * 可以在lambda 表达式的 -> 之后使用大括号将操作代码包裹起来
	 * @param args
	 */
	public static void main_labmda_muilt(String[] args) {
		Canvas canvas = new Canvas(); // 创建画布对象
		canvas.draw((pen)->{
			System.out.println("使用多条语句的lambda表达式的使用");
			pen.drawText(" 乾、兑、 离、震、巽、坎、艮、坤"); // 八卦
			pen.reatage();
		});
	}
	
	
	
	/**
	 * () -> 操作
	 * 其中,小括号表示的是接口实现类中的方法的调用的小括号. 如果方法的调用拥有参数,
	 * 那么直接设置参数名.参数的类型虚拟机可以帮我们判断.
	 * -> 在java中代表lambda 表达式的语法规则
	 * 后续的操作即具体的代码调用
	 * 当代码的调用只有一条的时候, 直接写上代码语句.并且语句结束之后不要使用分号作为语句结束符
	 * @param args
	 */
	public static void main_lambdabase(String[] args) {
		Canvas canvas = new Canvas();
		canvas.draw((pen)->pen.drawText("君不见. 黄河之水天上来!")); // 2. 初级的lambda 表达式的使用 使用lambda 表达式.
	}
	
	
	/**
	 * @param args
	 */
	public static void main_old(String[] args) {
		// 用户的操作
		// 创建画布对象，
		Canvas canvas = new Canvas();
		// 开始绘制处理
//		canvas.draw(new MyDraw()); 0.
//		/**
//		 * 直接使用new 关键字调用接口。 会直接产生一个匿名的内部类。 
//		 * 这个类的类名是当前类类名加上$再加上一个数值 
//		 */
//		canvas.draw(new CallBack() { 
//			@Override
//			public void call(Pen pen) {
//				pen.reatage();
//			}
//		}); 2 . 使用内部类的实现方式
	}
	

}

/*class MyDraw implements CallBack{ // 0. 最原始的操作， 实现接口
	@Override
	public void call(Pen pen) {
		pen.drawText("留得青山在不愁没柴烧。");
	}
}*/
