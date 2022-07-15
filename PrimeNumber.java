package week1.day2;



//Goal: To find whether a number is a Prime number or not
//* input: 13
//* output: 13 is a Prime Number
//Declare an int Input and assign a value 13

//Declare a boolean variable flag as false

//Iterate from 2 to half of the input

//Divide the input with each for loop variable and check the remainder

//Set the flag as true when there is no remainder

//break the iterator

//Check the flag (Provide a condition)

//Print 'Prime' when the condition matches

//Print 'Not a Prime' when the condition doesn't match 
public class PrimeNumber {

	public static void main(String[] args) {
    int n = 8;
    boolean flag = false;
for (int i = 2;i<=n/2;i++) {
	if (n%i==0) {
	System.out.println("This is not a prime number");
	flag = true;
	break;
	}
  
	}
if (flag==false) {
	System.out.println("This is a prime number");
}
}
}