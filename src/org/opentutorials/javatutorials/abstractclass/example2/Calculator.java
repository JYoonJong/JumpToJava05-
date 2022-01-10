package org.opentutorials.javatutorials.abstractclass.example2;

class Calculator implements Calculatable { // Calculateble ±¸Çö 
	int first, sencond, third;
	public void setOprands(int first, int second, int third) {
		this.first = first;
		this.sencond = second;
		this.third = third;
	}
	public int sum() {
		return this.first + this.sencond + this.third;
	}
	
	public int avg() {
		return (this.first+this.sencond+this.third)/3;
	}
	public static void main(String[] args) {
		

	}

}
