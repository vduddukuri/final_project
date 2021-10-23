
public class Bill {
	String bill_type;
	String bill_due_date;
	String bill_amount;
	
	public String getBillType() {
		return bill_type;
	}
	
	public void billType() {
		System.out.println(bill_type+" paid");
	}
	
	public void billDate() {
		System.out.println("Due Date "+bill_due_date);
	}
	
	public void billAmount() {
		System.out.println("Amount "+bill_amount);
	}
	
}
