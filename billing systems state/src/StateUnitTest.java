import org.junit.*;

public class StateUnitTest {
	Bill bill = new Bill();
	@Test
	public void testStates() {
		AddBillState addBillState = new AddBillState(bill);
		System.out.println("Add Bill State");
		addBillState.addBill();
		addBillState.removeBill();
		addBillState.checkPendingBills();
		addBillState.selectBillingMethod();
		addBillState.verifyPayment();
		
		RemoveBillState removeBillState = new RemoveBillState(bill);
		System.out.println("Remove Bill State");
		removeBillState.addBill();
		removeBillState.removeBill();
		removeBillState.checkPendingBills();
		removeBillState.selectBillingMethod();
		removeBillState.verifyPayment();
		
		
		CheckPendingBillsState checkPendingBillsState = new CheckPendingBillsState(bill);
		System.out.println("Check Pending Bills State");
		checkPendingBillsState.addBill();
		checkPendingBillsState.removeBill();
		checkPendingBillsState.checkPendingBills();
		checkPendingBillsState.selectBillingMethod();
		checkPendingBillsState.verifyPayment();
		
		SelectBillingMethodState selectBillingMethodState = new SelectBillingMethodState(bill);
		System.out.println("Select Billing Method State");
		selectBillingMethodState.addBill();
		selectBillingMethodState.removeBill();
		selectBillingMethodState.checkPendingBills();
		selectBillingMethodState.selectBillingMethod();
		selectBillingMethodState.verifyPayment();
		
		VerifyPaymentState verifyPaymentState = new VerifyPaymentState(bill);
		System.out.println("Verify Payment State");
		verifyPaymentState.addBill();
		verifyPaymentState.removeBill();
		verifyPaymentState.checkPendingBills();
		verifyPaymentState.selectBillingMethod();
		verifyPaymentState.verifyPayment();
		
	}

}
