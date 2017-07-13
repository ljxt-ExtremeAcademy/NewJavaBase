package com.xuetang9.kenny.javabase.chapter2;
/**
 * 斐波那契数列
 * @author 老九学堂·窖头
 * @version 1.0
 * @date 2017年7月13日 下午8:55:10
 * @copyright 老九学堂
 * @remarks TODO
 *
 */
public class FibDemo {

	public static void main(String[] args) {
		int a = 1, b = 1;
		System.out.print(a + ", " + b + ", ");
		for(int i = 0; i < 20; i++){//控制循环次数
			int c = a + b;
			System.out.println(c + ", ");
			a = b;
			b = c;
			
		}

	}

}
