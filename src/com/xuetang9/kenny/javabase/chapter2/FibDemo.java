package com.xuetang9.kenny.javabase.chapter2;
/**
 * 쳲���������
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��7��13�� ����8:55:10
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class FibDemo {

	public static void main(String[] args) {
		int a = 1, b = 1;
		System.out.print(a + ", " + b + ", ");
		for(int i = 0; i < 20; i++){//����ѭ������
			int c = a + b;
			System.out.println(c + ", ");
			a = b;
			b = c;
			
		}

	}

}
