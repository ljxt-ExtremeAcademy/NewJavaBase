package com.xuetang9.xm.javabase.utils;

/**
 * 描述
 * 随机参数个数的方法演示，可变参数
 * 通常，可变参数的位置要求是在参数列表的最后一个位置
 * @author xm
 *
 */
public class RandPrameterNumber {
	
	public static void main(String[] args) {
		int max = maxScore("",20,66,108,120,92);// 调用的时候，个数是不指定个数的
		System.out.println("贾府姑爷的武力、颜值、文试总成绩:"+max);
	}
	
	/**
	 * 定义可变参数函数，查找分数最大的好汉
	 * @param scores
	 * @return
	 */
	public static int maxScore(String name,int... scores) {
		// 判断是否传入了数据 ， 如果没有分值输入返回-1，输出异常信息
		if(scores.length > 0) {
			// 定义分值表示最大值, 直接取第一个作为最大分值
			int maxScore = scores[0];
			// 循环判断当前分值是否大于定义的最大分值。
			for (int score : scores) {
				// 如果大于则最大分支为当前分值
				if(score > maxScore) {
					maxScore = score;
				}
			}		
			// 返回最大分值
			return maxScore;
		}else {
			System.err.println("没有人参加比武.");
			return -1;
		}
		
		
	}
	
}
