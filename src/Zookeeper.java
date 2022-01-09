// 인터페이스 예제

// Predator 라는 인터페이스 생성 -> public String getFood();
// Tiger 와 Lion 이라는 클래스 생성 -> public String getFood()  return "과일";

public class Zookeeper {
	public void feed (Predator predator) { //Predator 라는 인터페이스 생성 
		System.out.println("feed " + predator.getFood());
	}
	
	public static void main(String[] args) {
		Zookeeper zookeeper = new Zookeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		zookeeper.feed(tiger);
		zookeeper.feed(lion);

	}

}
