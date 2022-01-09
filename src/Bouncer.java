//다형성

public class Bouncer  {
	public void barkAnimal(Barkable animal) { // Barkable 인터페이스 생성 -> public void bark(); 
		animal.bark();
	}
		
	
	
	public static void main(String[] args) {
		Bouncer bouncer = new Bouncer ();
		Tiger tiger = new Tiger ();
		Lion lion = new Lion ();
		
		bouncer.barkAnimal(tiger); //Tiger 클래스에 public void bark(){ System.out.println("어흥") 추가
		bouncer.barkAnimal(lion); //Lion 클래스에 public void bark() { System.out.println("으르렁") 추가
		

	}

}
