import java.util.*;

public class Store {
	static ArrayList<Customer> aryLst = new ArrayList<Customer>();
	
	public static void addSale(String cn, double amt){
		aryLst.add(new Customer(cn, amt));
	}
	
	public static String nameOfBestCustomer(){
		double maxSale = 0;
		String name = "";
		for(int i = 0; i < aryLst.size(); i++){
			if(aryLst.get(i).amount() > maxSale){
				maxSale = aryLst.get(i).amount();
				name = aryLst.get(i).name();
			}
		}	
		return name;
	}
}
