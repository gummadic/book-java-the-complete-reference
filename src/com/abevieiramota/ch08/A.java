package com.abevieiramota.ch08;

public class A {

	protected int i, j;

	public A(int i, int j) {
		this.i = i;
		this.j = j;
	}

	int sum() {
		return this.i + this.j;
	}
	
	int overrida() {
		return 10;
	}
	
	int overloada(int x) {
		return 10;
	}
	
}