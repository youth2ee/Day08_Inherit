package com.naver.inherit5;

import com.naver.inherit4.Pointer4D;

public class Main {

	public static void main(String[] args) {
		
		Tv tv = new Tv();
		Computer computer = new Computer();
		Phone phone = new Phone();
		
		tv.brand = "LG";
		tv.price = 1000;
		tv.point = 100;
		tv.size = 52;
		tv.color = "Black";
		
		computer.brand = "Samsung";
		computer.price = 200;
		computer.point = 30;
		computer.cpu = "i5";
		
		phone.brand = "Apple";
		phone.price = 100;
		phone.point = 20;
		phone.model = "Iphone 10";
		phone.color = "White";
		
		Customer girl = new Customer();
		girl.money = 3000;
		girl.point = 0;
		
		//girl.buy(tv.price, tv.point);
		girl.buy(tv);
		
		//같은 데이터타입만 다룬다.
		//tv, computer, phone을 모으기 위해서는 electronic 배열필요
		
		Electronic [] el = new Electronic[2];
		el[0]=tv;
		el[1]=computer;
		girl.buy(el);
		
		

	}

}
