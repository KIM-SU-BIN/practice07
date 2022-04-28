package com.javaex.ex01;

public class Circle extends Shape{
	
	//필드
	private int radius;
	
	//생성자
	public Circle(String fillColor, int radius){     
		super(fillColor);
		this.radius=radius;
	}

	//메소드-일반
	public void draw(){
		System.out.println("[원]#면색:" +super.fillColor+ 
				"  #반지름:" + radius +" 그렸습니다.");                                               
	}
}



