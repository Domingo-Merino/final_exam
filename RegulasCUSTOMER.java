 class RegularCUSTOMER extends CUSTOMER {
	public RegularCUSTOMER(String name, double amount) {
		super(name, amount);
	}

	@Override
	public double calculateBill() {
		return amount;
	}
}
