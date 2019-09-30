package com.naver.inherit3;

public abstract class Animal { //부모클래스
	//애매하므로 상속해서만 사용하라고 abstract 넣어준다. abstract가 들어가면 객체생성X
	//본문안에 추상메서드가 존재하므로, abstract를 빼면 안된다.
	
	int age;
	String name;
	
	/*
	public Animal(int age) { 
		//매개변수있는 생성자를 만들었으므로, 자손생성자에서도 매개변수 있는 생성자를 호출해야한다.
		this.age=age;
	}
	*/
	
	public abstract void sleep();  //추상메서드
	//어짜피 동물마다 다르므로 본문을 안써준다.
	//미완이므로 선언부에 'abstract'를 써준다.

}
