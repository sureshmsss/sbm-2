package ss.it.service;

import java.util.List;

import ss.it.entity.Product;

public interface ICRUDService {

	public List<Product> getAll();

	public String registerProduct(Product p);

	public String remove(Integer id);

	public Product getProductByNo(Integer id);

	public String updateProduct(Product p);

}
