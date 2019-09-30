package com.naver.inherit3;

public interface Fly { //클래스 대신에 interface 쓴다.
	
	//상수 : 접근지정자 public 무조건(안써도 자동생성), 그외지정자 옵션. 
	//변수이므로 final. 상수형변수는 모두 대문자
	public final int AGE=30;
	
	
	//추상메서드 : 접근지정자 public 무조건. 추상이므로 abstract. 
	public abstract void flyable();
	
	
	

}
