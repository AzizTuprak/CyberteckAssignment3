package assignments3;
import java.util.Scanner;
public class question6 {
	public static int dr,x;
	static int guess(int x) {
		dr=x*500;
		 return dr;		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Please input the number of drinks you have drinked :");
        Scanner object=new Scanner(System.in);
        int numDrink=object.nextInt();
        dr=guess(numDrink);
        System.out.println("the amounts of cofine in this drink is "+dr+" and "); 
        if (dr >= 10000) {
			 System.out.println("that is dangers!!");
		 }
        else {
        	System.out.println("that is not dangers yet!");
        }        	
	}
}
