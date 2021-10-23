import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class BillTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BillingFactory billingFactory = new BillingFactory();
		BillStore billStore = new BillStore(billingFactory);
		
		Bill bill = billStore.billStatus("Utility");
		System.out.println("Bill Type is: "+ bill.getBillType()+"\n");
		
		bill = billStore.billStatus("Subscription");
		System.out.println("Bill Type is: "+ bill.getBillType()+"\n");
		
		//JUnit test
		Result result = JUnitCore.runClasses(FactoryTest.class);
		for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful());
	}

}
