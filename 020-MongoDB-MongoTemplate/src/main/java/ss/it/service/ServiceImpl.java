package ss.it.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.mongodb.client.result.UpdateResult;
import com.mongodb.internal.bulk.UpdateRequest;

import ss.it.document.Stock;

@Service
public class ServiceImpl implements IService {

	@Autowired
	private MongoTemplate template;

	@Override
	public String regStockDetails(Stock stock) {
		int id = template.insert(stock).getStockId();
		return "stock is saved with id : " + id;
	}

	@Override
	public String regStockByBatch(List<Stock> list) {
		return "no of docs are saved : " + template.insertAll(list).size();
	}

	@Override
	public List<Stock> fetchStockByExchange(String exchange) {
		Query query = new Query();
		query.addCriteria(Criteria.where("stockExchange").is(exchange));
		List<Stock> list = template.find(query, Stock.class);
		return list;
	}

	@Override
	public List<Stock> fetchStockByPriceRange(double price1, double price2) {
		Query query = new Query();
		query.addCriteria(Criteria.where("price").gte(price1).lte(price2));
		List<Stock> list = template.find(query, Stock.class);
		return list;
	}

	@Override
	public Stock fetchStockDetailsByID(int StockId) {
		return template.findById(StockId, Stock.class);
	}

	@Override
	public String fetchAndUpdate(int stockId, double newPrice, String stockExchange) {
		// preprte query object
		Query query = new Query();
		query.addCriteria(Criteria.where("stockId").is(stockId));
		// update object for modification
		Update update = new Update();
		update.set("price", newPrice);
		update.set("stockExchange", stockExchange);
		// call the method
		Stock s = template.findAndModify(query, update, Stock.class);
		return s == null ? "stock not found" : "stock found and updated";
	}

	@Override
	public String updateMulti(double startPrice, double endPrice, String newstockExchange) {
		// preprte query object
		Query query = new Query();
		query.addCriteria(Criteria.where("price").gte(startPrice).andOperator(Criteria.where("price").lte(endPrice)));
		// update object
		Update update = new Update().set("stockExchange", newstockExchange);
		// call the update method
		UpdateResult result = template.updateMulti(query, update, Stock.class);
		return result.getModifiedCount() + " are modified";
	}

	@Override
	public String fetchAndDeleteStcokByStockName(String stockName) {

		// preprte query object
		Query query = new Query();
		query.addCriteria(Criteria.where("stockName").is(stockName));
		// call the method
		Stock result = template.findAndRemove(query, Stock.class);
		return result == null ? "stock not found" : "stock found and removed";
	}

	@Override
	public List<Stock> fetchAllAndDeleteStockByStockName(List<String> names) {
		// preprte query object
		Query query = new Query();
		query.addCriteria(Criteria.where("stockName").in(names));
		// call the method
		List<Stock> list = template.findAllAndRemove(query, Stock.class);
		return list;
	}
}
