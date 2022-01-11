// 메소드와의 다형성
package org.opentutorials.javatutorials.polymorphism; 
class O{
	public void a(int param) {
		System.out.println("숫차출력");
		System.out.println(param);
	}
	public void a(String param) { // a 라는 메소드가 추가되었지만 int 와 String 으로 나누어 메소드 생성
		System.out.println("문자출력");
		System.out.println(param);
	}
}
public class PolymorphismOverloadingDemo {

	public static void main(String[] args) {
		O o = new O();
		o.a(1); // 1 이라는 int 값을 호출
		o.a("one"); // one 이라는 String 값을 호출
	}
}
