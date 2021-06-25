package assignments3;
import java.util.Scanner;
public class question2 {
	 public static int age;
	 public static String myName;
    static int inputAge() {
    	Scanner myobject=new Scanner(System.in);
        return age=myobject.nextInt();
    }
    static String inputName() {
    	Scanner myobject1=new Scanner(System.in);
    	return myName=myobject1.nextLine();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		System.out.println("Please provide your age !");
		age=inputAge();
		System.out.println("Please provide your Name !");
		myName=inputName();
		System.out.println("Hello, "+ myName+" ! Based on your input, your age is "+age);
	}
}
