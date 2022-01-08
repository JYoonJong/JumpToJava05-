// 입력과 출력이 모두 있는 메소드


public class Method1 {
	
	public int sum(int a, int b) { //a,b는 매개변수 = 파라미터
		return a+b;
	}


	public static void main(String[] args) {
		
		Method1 method1 = new Method1();
		int c = method1.sum(3,4); // 3,4는 인수 = arguments
		
		System.out.println(c);
		
		
	}

}
