package ss.it.service;

public interface OrderService {

	public String purchase(String[] items, double[] prices, String[] emails) throws Exception;
}
