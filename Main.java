public class Main {
	public static void main(String[] args) {
		CUSTOMER customer;
		RegularCUSTOMER regularCustomer = new RegularCUSTOMER("Dexter", 3000);
		SeniorCustomer seniorCustomer = new SeniorCustomer("Boy", 1000);

		customer = regularCustomer;
		System.out.println(customer.getName()+" " +customer.calculateBill());

		customer = seniorCustomer;
		System.out.println(customer.getName()+" "+customer.calculateBill());
	}
}
