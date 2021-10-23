
public class Driver {
	public static void main(String[] args) {
		BillingSystemDBManager db = BillingSystemDBManager.getInstance();
		db.addBill();
		db.removeBill();
		
		// Creating new object of db manager, but this time the constructor will not be called
		BillingSystemDBManager db2 = BillingSystemDBManager.getInstance();
		db2.addBill();
		db2.removeBill();
	}
}
