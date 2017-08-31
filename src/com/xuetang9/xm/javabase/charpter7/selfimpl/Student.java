/**
 * 
 */
package com.xuetang9.xm.javabase.charpter7.selfimpl;

/**
 *  
 * @author <a href="http://www.xuetang9.com">老九学堂</a>-大师兄
 * @time 2017年8月31日 - 下午9:36:55
 * @copy Copyright &copy; 2015-2017 Extreme Academy
 * @home <a href="http://www.xuetang9.com">http://www.xuetang9.com</a>
 * @address 成都市锦江区大慈寺路22号电信5所
 * @version 1.0.0
 */
public class Student implements SpeackAble {
	@Override
	public void say() {
		System.out.println("废话贼多，也不想想我每天要念那么多书。心有多累。休息一下很正常嘛。");
	}
}
