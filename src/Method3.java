// 입력은 있으나 출력은 없는 메소드


public class Method3 {

	public void sum(int a, int b) {
		System.out.println(a+"과 " +b+"의 합은" +(a+b)+"입니다.");
	}
	
	public static void main(String[] args) {
		Method3 method3 = new Method3();
		method3.sum(3, 4);
		// 객체.메소드명(입력인수1,입력인수2,....)

	}

}
