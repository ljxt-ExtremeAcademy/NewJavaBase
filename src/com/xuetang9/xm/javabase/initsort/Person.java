package com.xuetang9.xm.javabase.initsort;

public class Person{
	
	static{
		System.out.println("静态代码块");
	}
	
	{
		hairColor = "黑色";
		eyeColor = "棕色";
		display();		
	} // 代码块， 相当于在类初始化的时候会被执行的一段代码
	// 在构造方法调用之前执行。构造方法调用之后，对象初始化完成。代码块不再被调用。
	private String hairColor;
	private String eyeColor;
	public void display(){
		System.out.println("头发颜色"+hairColor);
		System.out.println("眼睛颜色"+eyeColor);
	}	
	public Person(){
		
		hairColor = "棕色";
		eyeColor = "蓝色";
		display();
	}
}
