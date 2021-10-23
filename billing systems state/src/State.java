
public interface State {
	public void addBill();
	public void removeBill();
	public void checkPendingBills();
	public void selectBillingMethod();
	public void verifyPayment();
}
