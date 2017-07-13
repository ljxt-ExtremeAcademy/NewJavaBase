package com.xuetang9.kenny.javabase.chapter2;

import java.util.Scanner;

/**
 * 求两个数的最大公约数
 * @author 老九学堂·窖头
 * @version 1.0
 * @date 2017年7月13日 下午8:59:39
 * @copyright 老九学堂
 * @remarks TODO
 *
 */
public class GCDDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int gcd = 1;	//最大公约数
		int i = 2;		//从数字2开始整除
		System.out.println("请输入两个数字：");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		//最大公约数：从2开始，到num1 或  num2结束   求某个数字可以同时被num1和num2整除
		while(i < num1 && i < num2){
			if(num1 % i == 0 && num2 % i == 0){//某次循环求的是约数
				gcd = i;//不需要跳出循环，每次的约数进行覆盖
			}
			i++;
		}
		System.out.println(num1 + "和" + num2 + "的最大公约数是：" + gcd);

	}

}








