package com.xuetang9.kenny.javabase.chapter2;

import java.util.Scanner;

/**
 * 判断字符串是否回文
 * @author 老九学堂·窖头
 * @version 1.0
 * @date 2017年7月13日 下午9:06:09
 * @copyright 老九学堂
 * @remarks TODO
 *
 */
public class HUIWenDemo {
	public static void main(String[] args) {
		//第一个元素和倒数第一个元素。。。。。
		System.out.println("请输入一个字符串：");
		String value = new Scanner(System.in).next();
		boolean isHuiWen = true;	//是否是回文串
//		int lowIndex = 0;
//		int hightIndex = value.length() - 1;
		for(int i = 0; i < value.length() / 2; i++){
			if(!(value.charAt(i) == value.charAt(value.length() - i - 1))){
				isHuiWen = false;
				break;
			}
		}
		if(isHuiWen){
			System.out.println("是回文");
		}else{
			System.out.println("不是回文");
		}

	}

}









