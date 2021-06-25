package assignments3;
import java.util.Scanner;
public class question3 {
	static int recArea(int x,int y) {
		 int z=x*y;
		 return z;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("Please input width and height of rectangle !");
         Scanner object=new Scanner(System.in);
         int wid=object.nextInt();
         int hei=object.nextInt();
         System.out.println("the area of rectangle you wants to calculate is:"+recArea(wid,hei));
	}
}
