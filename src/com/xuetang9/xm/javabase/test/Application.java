/**
 * 
 */
package com.xuetang9.xm.javabase.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 *  演示字符串数组直接输出
 * @author 老九学堂-大师兄
 * @time 2017年8月10日 - 下午8:31:24
 * @copy Copyright &copy; 2015-2017 Extreme Academy
 * @home http://www.xuetang9.com
 * @address 成都市锦江区大慈寺路22号电信5所
 * @version 1.0.0
 */
public class Application {

	public static void main(String[] args) throws IOException {
//		Scanner in = new Scanner(System.in);
//		System.out.print("请输入:");
//		int read = System.in.read();
		//new FileInputStream("").read(null);
		
		/*if(read==13) {
			System.out.println("接收到回车!");
		}else {
			// 由于在使用Scanner 读入之前，已经产生过一次read  。
			// 对于输入流来说读过一次，就只能读取后续的数据了
			// 此处最开始read 那一次的数据已经丢失了
			//String str = in.next(); 
			// 输出字符串的二进制数据
			//String string = Arrays.toString(str.getBytes());
			//System.out.println(string);
			byte [] buff = new byte[1024]; // 建立缓存
			buff[0] = (byte)read; // 设置第一个值
			byte readByte = 13; // 设置读取每一个值的变量
			int idx = 1; // 用于记录的下表
			// 循环读取，如果读取的内容是回车就结束
			while((readByte=(byte)System.in.read())!=13) { 
				buff[idx++]=readByte;	// 否则放入缓存中			
			}
			
			System.out.println(Arrays.toString(buff));
			System.out.println(new String(buff)); // 最终转换成字符串
			
			// 把要输入的中文的二进制数据打印出来
			System.out.println(Arrays.toString("张三".getBytes()));
			
			//System.out.println("Scanner 接收的值:".concat(str));
		}
		System.out.println("程序已经结束!");*/
	}
	
	/**
	 * @param args
	 */
	public static void main_bak(String[] args) {
		
		// 定义字符数组
		String[] strs = {"小桐\n","月亮先森\n","江西大帅\n"};
//		System.out.println(strs); // 直接打印
		// 通过数组的工具类输出字符串数组
		String str = Arrays.toString(strs);
//		System.out.println(str); 
		// 得到字符串之后，去除字符串中不需要的符号 [ 、]、 ,。
		// String replaceAll 方法主要提供了两个参数，第一个参数表示增则表达式用于匹配具体需要替换的字符
		// 第二个参数表示最总想要替换成的字符 
		// 在这里希望 [ ] , 替换成空白
		str = str.replaceAll("\\[|\\]|,", ""); 
		System.out.println(str);
		str = new Scanner(System.in).next();
		System.out.println(str);
	}

}
