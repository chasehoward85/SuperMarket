import java.io.*;
import java.util.*;

public class Tester {

	public static void main(String[] args) {
		String custName = "";
		do{
			Scanner kbReader = new Scanner(System.in);
			System.out.println("Enter name of customer or \"EXIT\" to stop");
			custName = kbReader.nextLine();
			
			if(!custName.equalsIgnoreCase("Exit")){
				System.out.println("Enter total price");
				double amt = kbReader.nextDouble();
				System.out.println("");
				
				Store.addSale(custName, amt);
			}
		}while(!custName.equalsIgnoreCase("Exit"));
		
		System.out.println("The best customer is: " + Store.nameOfBestCustomer());
		
	}
}
