
package assignments3;
import java.util.Scanner;
public class question1 {
	static double convert(int x) {
		double Lnum;
		Lnum=x*(56.7812/15);
		return Lnum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("input gallon Numbers (Intiger only!):");
		Scanner myObject=new Scanner(System.in);
		int gNum=myObject.nextInt();
		double resultLiters=convert(gNum);
		System.out.println(gNum+" gallon euqals to "+resultLiters+" Liters!");
	}
}






