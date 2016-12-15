
public class Customer {
	public String name;
	public double amount;
	
	public Customer(String nm, double amt){
		name = nm;
		amount = amt;
	}
	
	public double amount(){
		return amount;
	}
	
	public String name(){
		return name;
	}
}
