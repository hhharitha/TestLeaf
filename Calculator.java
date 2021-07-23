package week1.day1;

public class Calculator {
	
	public int add (int value1, int value2) {
		int sum = value1+value2;
		return sum;
	}
	
	
	public double sub (double value1, double value2) {
		double substraction = value1-value2;
		return substraction;
	}
	
	public double mul (double value1, double value2) {
		double multiplication = value1*value2;
		return multiplication;
		
	}
	
	public int div (int value1, int value2) {
			int division = value1/value2;
			return division;
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Calculator calc = new Calculator();
      System.out.println(calc.add(10, 5));
       System.out.println(calc.sub(10.5, 5.8));
       System.out.println(calc.mul(10.5, 5.8));
       System.out.println(calc.div(10, 5));
       
	}

}
