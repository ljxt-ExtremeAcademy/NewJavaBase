package com.xuetang9.kenny.javabase.chapter2;

public class DecimalDemo {
	public static void main(String[] args) {
		
		int i1 = 800000;
        while(i1 > 10 ){
                i1++;
        }
        System.out.println( i1 );
        System.out.println(Integer.MIN_VALUE);

		
		
		float sum = 0;
		for(float i = 0.01f; i < 1.0f; i = i + 0.01f){
			sum += i;	//每次累加0.01
		}
		System.out.println(sum);
		
		double sum1 = 0;
		for(double i = 0.01; i < 1.0; i += 0.01){
			sum1 += i;
		}
		System.out.println(sum1);
		
		System.out.println("改进下：");
		double currValue = 0.01;
		double sum2 = 0;
		for (int i = 0; i < 100; i++) {
			sum2 += currValue;
			currValue += 0.01;
		}
		System.out.println(sum2);
		
		System.out.println("从大累加到小");
		currValue = 1;
		double sum3 = 0;
		for (int i = 0; i < 100; i++) {
			sum3 += currValue;
			currValue -= 0.01;
		}
		System.out.println(sum3);
		
		
		
//		double i = 1.0;
//		double sum = 0;
//		while(i != 0){	//尽量不要使用浮点型数字进行等值判断
//			sum += i;
//			i -= 0.1;
//			System.out.println(i);
//		}
//		System.out.println(sum);
	}
}
