
public abstract class CUSTOMER {
	protected String name;
	protected double amount;

	public CUSTOMER(String name, double amount) {
		this.name = name;
		this.amount = amount;
	}
	public String getName(){
		return name;

	}
	public void setName(String name){
		this.name=name;
	}
 	public abstract double calculateBill();
}
