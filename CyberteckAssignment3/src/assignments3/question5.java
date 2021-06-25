package assignments3;
import java.util.Scanner;
public class question5 {
	public static int hours,minutes,seconds;
	public static int [] arr=new int[3];
    static int[] converter(int x) {
    	hours=x/3600;
    	minutes=x%3600/60;
    	seconds=x%60;
    	arr[0]=hours;
    	arr[1]=minutes;
    	arr[2]=seconds;
    	return arr;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inPut;
        System.out.println("Please input seconds!");
        Scanner object=new Scanner(System.in);
        inPut=object.nextInt();
        converter(inPut);
        System.out.println(arr[0]+"Hours :"+arr[1]+"Minutes :"+arr[2]+"seconds");             	   
	}
}
