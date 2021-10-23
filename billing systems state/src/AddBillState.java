
public class AddBillState implements State{
	Bill bill;
	
	public AddBillState(Bill bill) {
		this.bill = bill;
	}

	@Override
	public void addBill() {
		// TODO Auto-generated method stub
		System.out.println("Bill added. Not add more");
	}

	@Override
	public void removeBill() {
		// TODO Auto-generated method stub
		System.out.println("No bill to remove");
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
