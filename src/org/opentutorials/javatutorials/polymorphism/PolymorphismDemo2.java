package org.opentutorials.javatutorials.polymorphism;
interface I {}
class C implements I{} // C 가 인터페이스 I 를 구현하고 있다.

public class PolymorphismDemo2 {
	public static void main(String[] args) {
		I obj = new C(); // C라는 클래스 인스턴스화 -> obj(인스턴스)의 데이터 타입은 I   
		

	}

}
