package com.xuetang9.kenny.javabase.chapter2;

import java.util.Scanner;

/**
 * �������������Լ��
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��7��13�� ����8:59:39
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class GCDDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int gcd = 1;	//���Լ��
		int i = 2;		//������2��ʼ����
		System.out.println("�������������֣�");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		//���Լ������2��ʼ����num1 ��  num2����   ��ĳ�����ֿ���ͬʱ��num1��num2����
		while(i < num1 && i < num2){
			if(num1 % i == 0 && num2 % i == 0){//ĳ��ѭ�������Լ��
				gcd = i;//����Ҫ����ѭ����ÿ�ε�Լ�����и���
			}
			i++;
		}
		System.out.println(num1 + "��" + num2 + "�����Լ���ǣ�" + gcd);

	}

}








