package com.naver.inherit3;

public class AnimalMain {

	public static void main(String[] args) {
		
		Lion lion = new Lion();
		
		//Animal animal = new Animal(); 
		//개념이 명확하지 않은 애매한 것은 객체로 만들면 안된다.
		//문법상은 옳지만 의미상 틀리다.
		//객체사용하지 못하게 하기 위해 문법상으로도 틀리게 만들어준다.
		//public 'abstract' class Animal{}
		//abstract을 넣어줘서 Animal 클래스는 
		//오직 자손클래스에게 '상속'해서만 사용할 수 있다
		//패키지2 Car도 애매하므로 abstract 넣어줘라
		
		lion.sleep(); //오버라이딩 받은것
	
		Eagle eagle = new Eagle();
		// eagle은 Eagle형을 담는다.
		//eagle에 lion을 담는게 다형성 eagle=lion
		//그러나 둘은 상속관계아니므로 다형성 불가
		
		//다형성
		Animal animal = lion;
		animal = eagle; 
		//Animal is a lion
		//Animal is a eagle

	}

}
