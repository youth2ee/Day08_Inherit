package com.naver.inherit5;

public class Customer {

	int money;
	int point;

	public void buy(Electronic el) { //부모클래스를 가져온다.
		//물건값 계산
		//남아있는 금액과 포인트 출력

		this.money = this.money - el.price;
		this.point = this.point + el.point;

		System.out.println("잔돈 : "+this.money);
		System.out.println("포인트합계 : "+this.point);
	}

	/* 
	   	1) 오버로딩 이용 (클래스 개수가 많으면 사용하기 어렵다)
	public void buy(Phone phone) {
		this.money = this.money - phone.price;
		this.point = this.point + phone.point;
		System.out.println(this.money);
		System.out.println(this.point);
	}

	public void buy(Tv tv) {
		this.money = this.money - tv.price;
		this.point = this.point + tv.point;
		System.out.println(this.money);
		System.out.println(this.point);
	}

	public void buy(Computer computer) {
		this.money = this.money - computer.price;
		this.point = this.point + computer.point;
		System.out.println(this.money);
		System.out.println(this.point);
	}


		2) 매개변수이용
	public void buy(int m, int p) {

		this.money = this.money - m;
		this.point = this.point + p;

		System.out.println(this.money);
		System.out.println(this.point);

	}
	 */

	//한개이상의 물건구입 매개변수는 한개
	public void buy(Electronic [] el) { //여러개의 값 담기위해 부모클래스의 배열을 가져온다.
		for(int i=0;i<el.length;i++) {
			this.money = this.money - el[i].price;
			this.point = this.point + el[i].point;
		}

		System.out.println("잔돈 : "+this.money);
		System.out.println("포인트합계 : "+this.point);

	}

}
