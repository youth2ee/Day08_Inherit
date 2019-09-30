package com.naver.inherit3;

public class Eagle extends Bird implements Fly{ 
	//클래스만 만들면 에러. 
	//Bird 안의 추상메서드 fly와  Animal에게 상속받은 추상메서드 sleep이 해결 안되므로.
	//상속은 단일상속
	//fly 구현받겠다. 여러개 인터페이스 구현가능 
	
	@Override //이 메서드는 오버라이딩 된 메서드입니다. "annotation"
	public void flyable() {
	}
	
	
	public void sleep() {
	}
	

}
