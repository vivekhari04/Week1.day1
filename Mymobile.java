package week1.day2;
/* Assignment:1
- Create a  new class as "MyMobile"
- create variables for the class
- Create 2 public methods (makeCall() , sendMsg()) with simple print statement
- Create a private method payBills() with simple print statement
- Create main method
- Create object for "MyMobile" class and call the methods and variables using the object
- Execute the class and get the result in console*/
public class Mymobile {
		long mobnum = 7958456214L;
 
public void makeCalls() {
		long call = 7907954854l;
		System.out.println(call); 
}
public void sendMsg() {
		String msg = "send message";
		System.out.println(msg);
}
private void payBills() {
		int billNo = 235;
		System.out.println(billNo);
}
public static void main(String[] args) {
		Mymobile obj = new Mymobile();
		obj. makeCalls();
		obj.sendMsg();
		obj.payBills();
		System.out.println(obj.mobnum);
	
	}

}
