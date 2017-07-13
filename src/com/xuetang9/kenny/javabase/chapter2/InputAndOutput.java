package com.xuetang9.kenny.javabase.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputAndOutput {
	public static void main(String[] args) throws IOException {
		//System.out.println("计算机屏幕上输出一句话");
		
		//读取用户输入的整型
		int num = System.in.read();	//阿三
		
		Scanner input = new Scanner(System.in);
		//input.nextLine()
		//带缓冲的读取器 --早期的用法，建议使用Scanner
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		//bReader.readLine()
		
		System.out.println(num);
	}
}
