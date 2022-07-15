package week1.day2;
//Goal: Convert A Negative Number To PositiveNumber 
//
///*
//*Problem statement: Convert a negative number to positive number
// * Pseudocode: 
// * 
// * 1. Initialize an integer with a negative number like,
// * int number = -40;
// * 2. Check if the number is a negative number 
// * Hint : any number that is lesser than zero is a negative number 
// * 3. If so, convert the number to a positive number
// * 4. Print the converted positive number
public class NegativePositive {

	public static void main(String[] args) {
		int num =-9;
		if (num<0) {
			System.out.println("converted positive number:"+(num*-1));
		}
	}

	
}
