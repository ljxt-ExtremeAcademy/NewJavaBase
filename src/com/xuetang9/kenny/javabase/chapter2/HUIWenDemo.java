package com.xuetang9.kenny.javabase.chapter2;

import java.util.Scanner;

/**
 * �ж��ַ����Ƿ����
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��7��13�� ����9:06:09
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class HUIWenDemo {
	public static void main(String[] args) {
		//��һ��Ԫ�غ͵�����һ��Ԫ�ء���������
		System.out.println("������һ���ַ�����");
		String value = new Scanner(System.in).next();
		boolean isHuiWen = true;	//�Ƿ��ǻ��Ĵ�
//		int lowIndex = 0;
//		int hightIndex = value.length() - 1;
		for(int i = 0; i < value.length() / 2; i++){
			if(!(value.charAt(i) == value.charAt(value.length() - i - 1))){
				isHuiWen = false;
				break;
			}
		}
		if(isHuiWen){
			System.out.println("�ǻ���");
		}else{
			System.out.println("���ǻ���");
		}

	}

}









