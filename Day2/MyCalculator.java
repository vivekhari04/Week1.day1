package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		 Calculator1 cal = new  Calculator1();
		 
		 System.out.println(cal.add (5, 6, 9));
		System.out.println( cal.mul(52,10));
		System.out.println(cal.sub(6, 3));
		System.out.println(cal.div(8f, 6f));
	}
}