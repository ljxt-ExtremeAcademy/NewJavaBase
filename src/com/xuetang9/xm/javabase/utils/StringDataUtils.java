package com.xuetang9.xm.javabase.utils;

import java.util.Random;

/**
 * 演示随机生成中国的手机号码、邮箱、中文的名称
 * @author xm
 *
 */
public class StringDataUtils {

	/**
	 * 静态常量、希望外部可以使用，但是不允许外部改变引用的时候使用静态常量
	 */
	public static final Random RAND = new Random();
	
	public static void main(String[] args) {
		String phone = randPhone(); // CTRL + L，2 方法返回，帮助生成变量
		System.out.println("随机生成的手机号码是:"+phone);
		
		/// ----------------------
		//System.out.println("随机生成数字的字符:"+numAndLetter(false));
//		for (int i = 0; i < 10; i++) {
//			System.out.print(numAndLetter(true));
//		}
		System.out.println("随机生成的邮箱是:"+randMail());
		System.out.println("随机中文名称:"+randName());
		
	}
	
	/**
	 * 思路分析：
	 * 魏忠贤
	 * 拆分
	 * 1. 姓 (单姓)
	 * 2. 名字 (通常是1-2)个汉字组成
	 * @return
	 */
	public static String randName() {
		StringBuilder sbd = new StringBuilder();
		// 有百家姓
		char [] familyNames = {'李','王','张','刘','陈','杨','黄','赵','周','吴','徐','孙','朱','马','胡','郭','林','何','高','梁','郑','罗','宋','谢','唐','韩','曹','许','邓','萧','冯','曾','程','蔡','彭','潘','袁','於','董','余','苏','叶','吕','魏','蒋','田','杜','丁','沈','姜','范','江','傅','钟','卢','汪','戴','崔','任','陆','廖','姚','方','金','邱','夏','谭','韦','贾','邹','石','熊','孟','秦','阎','薛','侯','雷','白','龙','段','郝','孔','邵','史','毛','常','万','顾','赖','武','康','贺','严','尹','钱','施','牛','洪','龚'};
		// 随机选择一个姓
		// 随机下标
		int index = RAND.nextInt(familyNames.length);
		sbd.append(familyNames[index]);
		// 名称 （Java的程序使用Unicode编码，其中汉字的边界是）
		int length = RAND.nextInt(2)+1;
		for (int i = 0; i < length; i++) {
			int ch = RAND.nextInt(0x9FA5-0x4E00)+0x4E00; // 随机生成中文的汉字
			sbd.append((char)ch);
		}
		return sbd.toString();
	}
	
	
	/**
	 * 思路分析：
	 * +8618683790763
	 * 拆分
	 * 1. +86 
	 * 2. 13、14、15、17、18
	 * 3. 9位数字
	 * @return
	 */
	public static String randPhone() {
		// 创建字符串拼接对象 ，表示需要拼接的手机号码
		StringBuilder sbd = new StringBuilder();
		sbd.append("+86"); // 拼接国家代码
		int [] prenums = {13,14,15,17,18}; // 号段
		int pre = prenums[RAND.nextInt(prenums.length)]; // 随机的号段
		sbd.append(pre); // 拼接号段
		for (int i = 0; i < 9; i++) { // 拼接9个数字
			sbd.append(RAND.nextInt(10));
		}
		return sbd.toString();
	}
	
	/**
	 * 思路分析:
	 * xiayongshengz@163.com
	 * 1. @符号之前， 由用户自己定义的名称 , 6-20个长度。依据很多网站的用户名验证规则
	 * 		用户名中的字母允许为大写
	 * 2. @ 
	 * 3. @之后，通常是网站的域名。
	 * 4. 网站的域名分析  163 , 规则，字母要求为小写。由字母和数字组成1-20 // g.cn
	 * 5. 剩余后缀，1-4之间的字母。
	 * 7. 随机判断是否有二级后缀 (.和两个字母组成)
	 * 
	 * -- 字符要求 1. 大写或者小写的字母与数字混合  2. 小写字母与数字混合  3.纯小写字母混合 
	 * @return
	 */
	public static String randMail() {
		StringBuilder sbd = new StringBuilder();
		// @符号之前 6-20个随机字符 
		int length = RAND.nextInt(15) + 6;
		numAndLetterAppend(sbd, length,true); // 邮箱用户名
		// 拼接@
		sbd.append('@');
		// 拼接域名
		// 核心部分
		length = RAND.nextInt(20)+1;
		numAndLetterAppend(sbd, length,false); // 邮箱的核心域名部分
		// 拼接.
		sbd.append('.');
		// 域名后缀
		length = RAND.nextInt(4)+1;
		letterAppend(sbd, length); // 域名后缀
		// 域名二级后缀的处理
		if(RAND.nextBoolean()) { 
			sbd.append('.');
			letterAppend(sbd, 2); // 二级域名后缀
		}
		return sbd.toString();
	}
	
	/**
	 * 随机拼接小写字母
	 * @param sbd
	 * @param length
	 */
	// sbd 得到的是一个引用 ,根据引用的指向修改引用所指向的对象的内容。可以修改成功。
	// 这里做的是一个引用传递
	private static void letterAppend(StringBuilder sbd, int length) { 
//		sbd = new StringBuilder(); // 修改完全失效
		for (int i = 0; i < length; i++) {
			int ch = RAND.nextInt(26)+'a'; // 随机生成小写字母
			sbd.append((char)ch); 
		}
	}
	
	/**
	 * 按照指定长度向拼接对象中随机拼接字符 （数字、大小写字母）
	 * @param sbd 拼接对象
	 * @param length 指定的长度
	 * @param upper 大小写字母控制 (true允许大写字母，false的时候不允许)
	 */
	private static void numAndLetterAppend(StringBuilder sbd, int length,boolean upper) {
		for (int i = 0; i < length; i++) {
			sbd.append(numAndLetter(upper));
		}
	}
	
	
	
	/**
	 * 描述
	 * 字母或者数字的随机字符生成方法。 
	 * @param upper true,允许有大写字母 、false，不允许大写字母
	 * @return
	 */
	public static char numAndLetter(boolean upper) {
		// 首先随机生成数字
		int resultch = RAND.nextInt(10) + '0';
		// 根据随机数判断是否返回字母
		if(RAND.nextBoolean()) {
			boolean upletter = upper?true:false; // true大小写都有，否则只有小写
			if(upletter) {
				resultch = RAND.nextInt(26) + (RAND.nextBoolean()?'A':'a');
			}else {
				resultch = RAND.nextInt(26) + 'a';
			}
		}
		return (char) resultch;
	}

}
