
public class RemoveBillState implements State{
	Bill bill;
	public RemoveBillState(Bill bill) {
		this.bill = bill;
	}

	@Override
	public void addBill() {
		// TODO Auto-generated method stub
		System.out.println("Bill added.");
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
		System.out.println("No method selected");
	}

	@Override
	public void verifyPayment() {
		// TODO Auto-generated method stub
		System.out.println("Payment method not verified");
	}
	
}
