package ss.it.service;

import java.util.List;

import ss.it.document.Stock;

public interface IService {
	public String regStockDetails(Stock stock);

	public String regStockByBatch(List<Stock> list);

	public List<Stock> fetchStockByExchange(String exchange);

	public List<Stock> fetchStockByPriceRange(double price1, double price2);

	public Stock fetchStockDetailsByID(int StockId);

	public String fetchAndUpdate(int id, double newPrice, String stockExchange);

	public String updateMulti(double startPrice, double endPrice, String newstockExchange);

	public String fetchAndDeleteStcokByStockName(String stockName);

	public List<Stock> fetchAllAndDeleteStockByStockName(List<String> names);

}
