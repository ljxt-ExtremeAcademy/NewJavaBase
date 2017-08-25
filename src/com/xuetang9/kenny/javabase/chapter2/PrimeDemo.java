package com.xuetang9.kenny.javabase.chapter2;
/**
 * 打印1-100内的所有素数
 * @author 老九学堂·窖头
 * @version 1.0
 * @date 2017年7月13日 下午9:46:12
 * @copyright 老九学堂
 * @remarks TODO
 *
 */
public class PrimeDemo {
	public static void main(String[] args) {
		
		double[] nums = new double[5];
		nums = new double[50];
		
		System.out.println(nums.length);
		
		
		boolean isPrime = true;	//是否是素数
		int count = 0;			//计数器
		for (int i = 3; i <= 100; i += 2) {
			isPrime = true;
			//在内循环中判断某个数字是否是素数
			for(int j = 2; j < i; j++){
				if(i % j == 0){//非1和自身中的某个数字可以被整除，证明这个数字不是素数
					isPrime = false;
					break;
				}
			}
			if(isPrime){//如果是素数，就打印出来
				System.out.print(i);
				count++;	//素数的总数
				if(count % 10 == 0)
					System.out.print("\n");
				else
					System.out.print("\t");
			}
		}

	}

}
