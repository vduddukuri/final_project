
public class SelectBillingMethodState implements State{
	Bill bill;
	public SelectBillingMethodState(Bill bill) {
		this.bill = bill;
	}

	@Override
	public void addBill() {
		// TODO Auto-generated method stub
		System.out.println("Bill added");
	}

	@Override
	public void removeBill() {
		// TODO Auto-generated method stub
		System.out.println("Bill removed");
	}

	@Override
	public void checkPendingBills() {
		// TODO Auto-generated method stub
		System.out.println("No pending bill");
	}

	@Override
	public void selectBillingMethod() {
		// TODO Auto-generated method stub
		System.out.println("Card method selected");
	}

	@Override
	public void verifyPayment() {
		// TODO Auto-generated method stub
		System.out.println("Payment method not verified");
	}
	
}
