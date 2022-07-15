package week1.day2;

public class Firefox {

	float version = 100.2f;
	String name = "Firefox";
	boolean visible = true;
	int year = 1998;
	char logo = 'm';
public void edge() {
	float version = 200.5f;
	String nam = "edge";
	System.out.println(version);
	System.out.println(name);
	System.out.println(nam);
	
	}
public void chrome() {
	int speed = 200;
	System.out.println(speed);
	System.out.println(year);
}		
public static void main(String[] args) {
	Firefox Obj = new Firefox();
	
	Obj.edge();
	Obj.chrome(); 
	}
}
