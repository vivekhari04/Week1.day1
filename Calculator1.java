package week1.day2;
//Goal:To understand  ( Class and Methods)
//
//Create a class "Calculator" with below methods
//(a) add(int num1, int num2, int num3), it should return sum of num1+num2+num3
//(b) sub(int num1, int num2), it should return subtraction of of num1-num2
//(c) mul(double num1, double num2), it should return product of num1 * num2
//(d) divide(float num1, float num2), it should return division of num1 / num2
//
//-- Create another class as MyCalculator and call all the methods from Calculator and print the results
public class Calculator1 {
public int add(int num1,int num2,int num3) {
	   return  num1+ num2+num3;

}
public int sub(int num1,int num2) {
	return num1-num2; 
}
public double mul(double num1 , double num2) {
	return num1*num2;
}
public float div(float num1, float num2) {
	return num1/num2;

}
}	
