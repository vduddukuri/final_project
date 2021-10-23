import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class BillTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bill bill = new Bill();
		
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
		//JUnit Test
		Result result = JUnitCore.runClasses(StateUnitTest.class);
		for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful());
	}

}
