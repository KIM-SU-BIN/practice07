package com.javaex.ex01;

public class ShapeApp {

	//필드
	//생성자
	//메소드
	//메소드 일반
	
	public static void main(String[] args) {
			
		//Shape s = new Shape("빨강"); Shape은 색상이라는 공통점을 모아둔 추상클래스로 만들어진 상태. 추상클래스에 인스턴스 생성 불가
		Circle c1 = new Circle("녹색", 10);
		Ractangle r1 = new Ractangle("빨강", 4, 4);
		Shape sr1 = new Ractangle("빨강", 4, 4);
		
			
		//sr1을 그리는 메소드 호출
		sr1.draw();

		//sr1의 가로크기 출력
		System.out.println("sr1의 가로는 " + ((Ractangle) sr1).getWidth() + " 입니다.");
	}
}

	
	