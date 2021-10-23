
public class BillingFactory {
	public Bill createBill(String type) {
		Bill bill = null;
		if(type.equals("Utility")) {
			bill = new UtilityBill();
		}else if(type.equals("Subscription")) {
			bill = new Subscription();
		}
		return bill;
	}
}
