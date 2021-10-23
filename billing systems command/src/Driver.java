
public class Driver {
	public static void main(String[] args) {
		Product prod = new Product("Mobile", 20);
		Product prod2 = new Product("Laptop", 5);
		
		AddItem addItem = new AddItem(prod);
		RemoveItem removeItem = new RemoveItem(prod2);
		
		StockManager manager = new StockManager();
		manager.manageStock(addItem);
		manager.manageStock(removeItem);
		
		manager.updateStock();
	}
}
