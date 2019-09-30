package com.naver.inherit4;

public class PointerMain {

	public static void main(String[] args) {
		
		Pointer3D pointer3d = new Pointer3D();
		//pointer3d는 Pointer3D타입이면서 Pointer타입이다.
	
		pointer3d.x=10;
		pointer3d.y=20;
		pointer3d.z=30;

		Pointer pointer = pointer3d;
		
		System.out.println(pointer.x);
		System.out.println(pointer.y);
		//System.out.println(pointer.z); //에러
		//부모인 pointer는 자손 pointer3d의 z값은 모른다.
		//모든 pointer가 z값 가지는 것 아니다.
		//z값은 pointer3d만 가진다.
		
		pointer3d = (Pointer3D)pointer;	
		System.out.println(pointer3d.z);
		
		Pointer p1 = new Pointer();
		pointer3d = (Pointer3D)p1;
		System.out.println(pointer3d.z); //에러
		
		
		Pointer4D pointer4d = new Pointer4D();
		pointer = pointer4d;
		
		pointer3d = (Pointer3D)pointer;		
		
	}

}
