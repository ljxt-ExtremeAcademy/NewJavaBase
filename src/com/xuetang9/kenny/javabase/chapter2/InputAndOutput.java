package com.xuetang9.kenny.javabase.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputAndOutput {
	public static void main(String[] args) throws IOException {
		//System.out.println("�������Ļ�����һ�仰");
		
		//��ȡ�û����������
		int num = System.in.read();	//����
		
		Scanner input = new Scanner(System.in);
		//input.nextLine()
		//������Ķ�ȡ�� --���ڵ��÷�������ʹ��Scanner
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		//bReader.readLine()
		
		System.out.println(num);
	}
}
