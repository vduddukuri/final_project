
public class Bill {
	State addBill;
	State removeBill;
	State checkPendingBills;
	State selectBillingMethod;
	State verifyPayment;
	
	State state = addBill;
	
	public Bill() {
		addBill = new AddBillState(this);
		removeBill = new RemoveBillState(this);
		checkPendingBills = new CheckPendingBillsState(this);
		selectBillingMethod = new SelectBillingMethodState(this);
		verifyPayment = new VerifyPaymentState(this);
	}
	
	public void addBill() {
		state.addBill();
	}
	
	public void removeBill() {
		state.removeBill();
	}
	
	public void checkPendingBills() {
		state.checkPendingBills();
	}
	
	public void selectBillingMethod() {
		state.selectBillingMethod();
	}
	
	public void verifyPayment() {
		state.verifyPayment();
	}
	
	public void setState() {
		this.state = state;
	}
	
	public State getState() {
		return state;
	}

	public State getAddBill() {
		return addBill;
	}

	public State getRemoveBill() {
		return removeBill;
	}

	public State getCheckPendingBills() {
		return checkPendingBills;
	}

	public State getSelectBillingMethod() {
		return selectBillingMethod;
	}

	public State getVerifyPayment() {
		return verifyPayment;
	}
	
	
}
