package com.xuetang9.kenny.javabase.chapter2;
/**
 * ��ӡ1-100�ڵ���������
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��7��13�� ����9:46:12
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class PrimeDemo {
	public static void main(String[] args) {
		
		double[] nums = new double[5];
		nums = new double[50];
		
		System.out.println(nums.length);
		
		
		boolean isPrime = true;	//�Ƿ�������
		int count = 0;			//������
		for (int i = 3; i <= 100; i += 2) {
			isPrime = true;
			//����ѭ�����ж�ĳ�������Ƿ�������
			for(int j = 2; j < i; j++){
				if(i % j == 0){//��1�������е�ĳ�����ֿ��Ա�������֤��������ֲ�������
					isPrime = false;
					break;
				}
			}
			if(isPrime){//������������ʹ�ӡ����
				System.out.print(i);
				count++;	//����������
				if(count % 10 == 0)
					System.out.print("\n");
				else
					System.out.print("\t");
			}
		}

	}

}
