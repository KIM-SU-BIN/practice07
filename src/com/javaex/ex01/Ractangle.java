package com.javaex.ex01;

public class Ractangle extends Shape {
	
	//필드
	private int width;
	private int height;
	
	//생성자
	public Ractangle(String fillColor, int width, int height){
		super(fillColor);
		this.width=width;
		this.height=height;
	}
	
		//gs ==> sr1의 가로크기 출력해야하므로 필요함
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	//메소드 - 일반
	//Shape의 추상메소드와 같은 이름으로 사용해야함
	public void draw() {
		System.out.println("[사각형]#면색:" +super.fillColor+ " "
				+ " #가로: " + width 
				+" #세로: " + height + "그렸습니다.");        
	}
		
	/*public void showInfo(){
		System.out.println("[사각형]#면색:" +super.fillColor+ " "
				+ " #가로:" + width 
				+" #세로:" + height + " 그렸습니다.");      
				
				위의 draw로 적용되기 때문에 필요없음                                                                  
	}*/
}


