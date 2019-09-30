package com.naver.inherit2;

public class Car { //자손클래스
	//extends Engine 여기서 상속을 받는 것은 문법상은 가능. 그러나 의미적인 에러
	//상속은 자식클래스 is a 부모클래스이어야 하는데
	//car is a engine은 성립하지 않고, car has a engine은 성립
	//따라서 '상속'이 아니라 '포함'을 써야 한다.

	String company;
	String brand;
	
	Engine engine; //자동차는 엔진을 '포함'한다.는 의미 = 멤버변수로 선언해서 써라
	
}
