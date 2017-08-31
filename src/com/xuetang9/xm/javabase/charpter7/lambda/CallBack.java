/**
 * 
 */
package com.xuetang9.xm.javabase.charpter7.lambda;

/**
 *  回掉操作
 *  回调模式，在做一件事情的时候。帮助调用者先做一部分前置或者后置的操作
 *  中间的代码由用户自己来完成
 *  Painter ,打印操作。 先要替用户准备好画笔，以及画笔的颜色与画笔的大小
 * @author <a href="http://www.xuetang9.com">老九学堂</a>-大师兄
 * @time 2017年8月31日 - 下午8:19:43
 * @copy Copyright &copy; 2015-2017 Extreme Academy
 * @home <a href="http://www.xuetang9.com">http://www.xuetang9.com</a>
 * @address 成都市锦江区大慈寺路22号电信5所
 * @version 1.0.0
 */
public interface CallBack {
	/**
	 * 给用户一直笔，让用户自行绘制相关的内容
	 * @param pen
	 */
	void call(Pen pen);
}
