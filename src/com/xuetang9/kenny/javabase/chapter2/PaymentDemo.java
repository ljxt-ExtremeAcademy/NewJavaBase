package com.xuetang9.kenny.javabase.chapter2;

import java.util.Scanner;

/**
 * 编写程序，让用户输入贷款总额、贷款年数以及利率，显示分期还贷时间表
	月支付额(固定值) = 贷款总额 / 贷款月份数
	月利息 = 月利率 * 余额
	每月偿还的本金 = 月支付额 – 月利息
 * @author 老九学堂·窖头
 * @version 1.0
 * @date 2017年7月13日 下午9:11:11
 * @copyright 老九学堂
 * @remarks TODO
 *
 */
public class PaymentDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("贷款总金额：");
		double amount = input.nextDouble();
		System.out.println("贷款年限：");
		int year = input.nextInt();
		System.out.println("利率：");
		double rate = input.nextDouble();
		
		//利息、本金、余额
		double interest = 0;
		double benjin = 0;
		double balence = amount;	//刚开始的余额应该跟总金额相同
		double monthMoney = amount / (year * 12);	//每个月要固定还的钱数--月支付额(固定值)
		System.out.println("月份\t利息\t本金\t余额");
		for(int i = 1; i <= year * 12; i++){
			//月利息 = 月利率 * 余额
			interest = rate / 100 * balence;
			//每月偿还的本金 = 月支付额 – 月利息
			benjin = monthMoney - interest;
			balence -= benjin;
			System.out.printf("%d\t%.2f\t%.2f\t%.2f\n", i, interest, benjin, balence);
		}
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
}
