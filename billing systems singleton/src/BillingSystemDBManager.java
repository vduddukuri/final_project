
public class BillingSystemDBManager {
	
	private static BillingSystemDBManager instance = null;
	
	private BillingSystemDBManager()
	{
		System.out.println("DB Manager object created");
	}
	
	public static BillingSystemDBManager getInstance()
	{
		if(instance == null) {
			instance = new BillingSystemDBManager();
		}
		return instance;
	}
	
	public void addBill()
	{
		System.out.println("Add Bill called");
	}
	
	public void removeBill()
	{
		System.out.println("Remove Bill called");
	}
}
