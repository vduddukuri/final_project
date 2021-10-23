
public class BillStore {
	BillingFactory billingFactory;
	
	public BillStore(BillingFactory billingFactory) {
		this.billingFactory = billingFactory;
	}
	
	public Bill billStatus(String type) {
		Bill bill;
		bill = billingFactory.createBill(type);
		bill.billType();
		bill.billDate();
		bill.billAmount();
		
		return bill;
		
	}
}
