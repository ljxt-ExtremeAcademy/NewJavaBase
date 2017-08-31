/**
 * 
 */
package com.xuetang9.xm.javabase.charpter7.baseinterface;

/**
 *  电视屏幕
 * @author <a href="http://www.xuetang9.com">老九学堂</a>-大师兄
 * @time 2017年8月31日 - 下午8:07:26
 * @copy Copyright &copy; 2015-2017 Extreme Academy
 * @home <a href="http://www.xuetang9.com">http://www.xuetang9.com</a>
 * @address 成都市锦江区大慈寺路22号电信5所
 * @version 1.0.0
 */
public class TVScreen implements VGA {

	/* (non-Javadoc)
	 * @see com.xuetang9.xm.javabase.charpter7.baseinterface.VGA#recive(java.lang.String)
	 */
	@Override
	public void recive(String data) {
		System.out.println("电视屏幕：");
		System.err.println(data);
	}

}
