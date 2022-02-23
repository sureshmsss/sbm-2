package ss.it.runner;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ss.it.document.Stock;
import ss.it.service.IService;

@Component
public class NoSQLRunner implements CommandLineRunner {
	@Autowired
	private IService service;

	@Override
	public void run(String... args) throws Exception {
		try {
			Stock stock = new Stock();
			stock.setStockId(new Random().nextInt(125425));
			stock.setStockName("tcs");
			stock.setPrice(2000d);
			stock.setStockExchange("bse");
			Stock stock1 = new Stock();
			stock1.setStockId(new Random().nextInt(125425));
			stock1.setStockName("tcs");
			stock1.setPrice(1000d);
			stock1.setStockExchange("nse");
			// System.out.println(service.regStockDetails(stock1));
			// System.out.println(service.regStockDetails(stock));

			// System.out.println(service.regStockByBatch(List.of(stock,stock1)));
			// service.fetchStockByExchange("nse").forEach(System.out::println);
			// service.fetchStockByPriceRange(2000,50000).forEach(System.out::println);
			// System.out.println(service.fetchStockDetailsByID(78711));
			// System.out.println(service.fetchAndUpdate(78711, 500044.7, "NSE"));
			// System.out.println(service.updateMulti(1000, 7000, "SSE"));
			// System.out.println(service.fetchAndDeleteStcokByStockName("tcs"));
			System.out.println(service.fetchAllAndDeleteStockByStockName(List.of("sbi", "ubi")));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
