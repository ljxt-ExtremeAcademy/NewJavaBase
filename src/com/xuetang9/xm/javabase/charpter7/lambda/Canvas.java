/**
 * 
 */
package com.xuetang9.xm.javabase.charpter7.lambda;

/**
 *  画布类，给外部提供绘制方法。绘制方法提前要给用户准备好笔
 * @author <a href="http://www.xuetang9.com">老九学堂</a>-大师兄
 * @time 2017年8月31日 - 下午8:32:28
 * @copy Copyright &copy; 2015-2017 Extreme Academy
 * @home <a href="http://www.xuetang9.com">http://www.xuetang9.com</a>
 * @address 成都市锦江区大慈寺路22号电信5所
 * @version 1.0.0
 */
public class Canvas {
	
	/**
	 * 用于绘制的笔的对象
	 */
	private Pen pen;
	
	
	/**
	 * 绘制对象, 在以后进行流相关处理的时候，比较实用。
	 * 需要提前准备好输入或者输入流
	 * 流最终一定要进行关闭。
	 * @param back
	 */
	public void draw(CallBack back) {
		// 准备一个笔的对象
		pen = new Pen();
		System.out.println("创建画笔对象");
		// 设置颜色
		pen.setColor("黑色");
		System.out.println("默认画笔颜色:".concat(pen.getColor()));
		// 设置笔尖尺寸
		pen.setSize(3);
		System.out.println("默认的画笔的尺寸:".concat(String.valueOf(pen.getSize())).concat("px"));
		if(null!=back) {
			back.call(pen);
		}
		// 销毁笔的对象
		pen = null;
		System.out.println("销毁画笔");
	}
}
