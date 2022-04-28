package com.javaex.ex01;

public abstract class Shape {
	//추상클래스
	//필드
	protected String fillColor;
	
	//생성자
	public Shape(String fillColor){
		this.fillColor=fillColor;
	}
	
	//추상메소드
	public abstract void draw();
}


