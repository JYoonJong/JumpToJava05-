public class Practice1 {
	
	public static double valueOfSupply = 10000.0;
	
	public static double vatRate =0.1;
	
	public static double getVat() {
		return valueOfSupply * vatRate;
	}	
	public static double getTotal() {
		return valueOfSupply + getVat();
	
	} 

	
	
	public static void main(String[] args) {
		
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("Vat : " + getVat());
		System.out.println("Total : " + getTotal());

	}

}
 // º» ¿¹Á¦
 /*
	double valueOfSupply = 10000.0;
	double vatRate = 0.1;
	double vat = valueOfSupply * vatRate;
	double total = valueOfSupply + vat;
	
	System.out.println(" value of supply : " + valueOfSupply);
	System.out.println(" VAT : " + vat);
	System.out.println("Total : " + total);
	 */
