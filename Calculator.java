package week1.day2;
/*ClassRoom 2:
	Create the class name Calculator
	Create method:1 add(int, int)--two args
	Create method:2 sub(int, float)--two args
	Create method:3 mul(double,int,double)--three args
	Create method:4 div(long,double,float)--three args
	Create main method
	create object and call all method and pass input arguments*/
public class Calculator {
public void add(int a , int b) {
	System.out.println(a+b);
}
public void mul(int a , float b , double c ) {
	System.out.println( a * b * c );

}
public void sub(int a , float b) {
	System.out.println(a-b);
}
public void div(long a ,double b , float c ) {
	System.out.println(a/b/c);

}
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add(2, 3);
		cal.mul(5, .3f, 4);
		cal.sub(9, .6f);
		cal.div(7965l, 52, .6f);
	}

}
