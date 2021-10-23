
public class RemoveItem implements Stock {
	private Product product;
	
	public RemoveItem(Product product) {
		this.product = product;
	}
	
	@Override
	public void execute() {
		this.product.removeItem();
	}
}
