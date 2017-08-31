/**
 * 
 */
package com.xuetang9.xm.javabase.charpter7.lambda;

/**
 *  画笔对象
 * @author <a href="http://www.xuetang9.com">老九学堂</a>-大师兄
 * @time 2017年8月31日 - 下午8:23:19
 * @copy Copyright &copy; 2015-2017 Extreme Academy
 * @home <a href="http://www.xuetang9.com">http://www.xuetang9.com</a>
 * @address 成都市锦江区大慈寺路22号电信5所
 * @version 1.0.0
 */
public class Pen {
	/**
	 * 画笔的尺寸
	 */
	private Integer size;
	/**
	 * 画笔的颜色
	 */
	private String color;
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 * 文本的绘制方法
	 * @param text
	 */
	public void drawText(String text) {
		// 提示
		StringBuilder sbd = new StringBuilder();
		sbd.append("使用").append(color).append("的画笔,尺寸是").
		append(size).append("px在绘制文本");
		System.out.println(sbd);
		// 输出内容
		System.out.println(text);
	}
	
	/**
	 * 矩形
	 */
	public void reatage() {
		StringBuilder sbd = new StringBuilder();
		sbd.append("┌┬┬┬┬┬┐").append("\n");
		sbd.append("├┼┼┼┼┼┤").append("\n");
		sbd.append("├┼┼┼┼┼┤").append("\n");
		sbd.append("├┼┼┼┼┼┤").append("\n");
		sbd.append("└┴┴┴┴┴┘");
		System.out.println(sbd);
	}
}
