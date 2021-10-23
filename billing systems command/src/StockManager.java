import java.util.ArrayList;
import java.util.List;

public class StockManager {
	private List<Stock> stocks = new ArrayList<>();
	
	public void manageStock(Stock stock) {
		this.stocks.add(stock);
	}
	
	public void updateStock() {
		for (Stock stock : stocks) {
			stock.execute();
		}
	}
}
