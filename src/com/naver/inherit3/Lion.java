package com.naver.inherit3;

public class Lion extends Animal { //자손클래스
	
	String color;
	
	public Lion() {
		super(); // this()와 비슷 
		//부모의 생성자를 호출
		//lion의 생성자를 만들때 자동으로 부모의 객체가 만들어진다.
		//cf. 생성자 : 클래스명()
		//부모생성자에 매개변수 있는 생성자가 생기면 매개변수있는걸로  super(10); 바꾸던가
		//부모생성자에 매개변수 없는 생성자를 만들어주면 super(); 사용가능
		
		super.age=20; //부모
		this.age=25; //자손
		// 하지만 결과적으로 같은 주소
	}
	
	
	public void sleep() { //메서드 오버라이딩 (상속에서 사용)
		System.out.println("엎드려자기");
	}

}
