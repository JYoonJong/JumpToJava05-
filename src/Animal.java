// this 는 클래스의 name 과 같음 > cat 과 같음 > setName = name

public class Animal {
	String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Animal cat = new Animal();
		cat.setName("boby");
		System.out.println(cat.name);
		
		Animal dog = new Animal();
		dog.setName("happy");
		System.out.println(dog.name);
		
		

		
	}

}
