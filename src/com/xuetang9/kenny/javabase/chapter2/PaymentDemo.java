package com.xuetang9.kenny.javabase.chapter2;

import java.util.Scanner;

/**
 * ��д�������û���������ܶ���������Լ����ʣ���ʾ���ڻ���ʱ���
	��֧����(�̶�ֵ) = �����ܶ� / �����·���
	����Ϣ = ������ * ���
	ÿ�³����ı��� = ��֧���� �C ����Ϣ
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��7��13�� ����9:11:11
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class PaymentDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�����ܽ�");
		double amount = input.nextDouble();
		System.out.println("�������ޣ�");
		int year = input.nextInt();
		System.out.println("���ʣ�");
		double rate = input.nextDouble();
		
		//��Ϣ���������
		double interest = 0;
		double benjin = 0;
		double balence = amount;	//�տ�ʼ�����Ӧ�ø��ܽ����ͬ
		double monthMoney = amount / (year * 12);	//ÿ����Ҫ�̶�����Ǯ��--��֧����(�̶�ֵ)
		System.out.println("�·�\t��Ϣ\t����\t���");
		for(int i = 1; i <= year * 12; i++){
			//����Ϣ = ������ * ���
			interest = rate / 100 * balence;
			//ÿ�³����ı��� = ��֧���� �C ����Ϣ
			benjin = monthMoney - interest;
			balence -= benjin;
			System.out.printf("%d\t%.2f\t%.2f\t%.2f\n", i, interest, benjin, balence);
		}
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
}
