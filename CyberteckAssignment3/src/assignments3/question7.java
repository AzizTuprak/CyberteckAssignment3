package assignments3;
import java.util.Scanner;
public class question7 {
	public static int exchange;
	public static int[] arrA=new int[4];
	public static int cent5, cent1, cent10, cent25;
	static int[] calculate(int x) {
		exchange=100-x;
		
		cent25=exchange/25;
		exchange=exchange%25;
		cent10=exchange/10;
		exchange=exchange%10;
		cent5=exchange/5;
		exchange=exchange%5;
		cent1=exchange;
		arrA[0]=cent25;
		arrA[1]=cent10;
		arrA[2]=cent5;
		arrA[3]=cent1;
		return  arrA;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("Please selcet the drink you want and input the price of that drink below: \n "
		+ "milk: 90 cents. water: 55 cents. coffie: 65 cents.\n drinkA: 15 cents. drinkB: 20 cents"
		+ "drinkD: 35 cents. drinkZ: 40 cents. hot drink: 78");
        Scanner object=new Scanner(System.in);
        int selectedPrice=object.nextInt();
        calculate(selectedPrice);
        
        System.out.println("the left amount you can get is:"+(100-selectedPrice)
        		+"\nand the coins you need is:"
        		+ "\n 25 cents Coin: "+arrA[0]+"\n"
        		+ "10 cents Coin: "+arrA[1]+"\n"
        		+ "5 cents Coin: "+arrA[2]+"\n"
        		+ "1 cents Coin: "+arrA[3]);
	}

}
