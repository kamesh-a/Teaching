package com.kamesh.basics;

public class IncrAndDecr {
	public static void main(String[] args) {
		int postInc = -3;
		// postIncrement +1
		// a. use => postInc
		// b. postInc = postInc + 1
		System.out.println(postInc++); // 1 => 0

		int preInc = 2;
		// preIncrement
		// a. pretInc = preInc +1
		// b. use => pretInc
		System.out.println(++preInc); // o/p => 1

		int postDec = -1;
		// postDecrement -1
		System.out.println(postDec--); // -1 => 0

		int preDec = 0;
		// preDecrement
		System.out.println(--preDec);// 0 => -1

		System.out.println("Incerment : "+postInc);
		System.out.println("Decrement : "+postDec);
	}
}
