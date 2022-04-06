package ss.it.service;

import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ss.it.entity.Product;
import ss.it.repo.ICRUDRepo;

@Service
public class CRUDServiceImpl implements ICRUDService {
	@Autowired
	private ICRUDRepo repo;

	@Override
	public List<Product> getAll() {
		return repo.findAll();
	}

	@Override
	public String registerProduct(Product p) {
		int idVal = repo.save(p).getPid();
		return "product is saved with the id : " + idVal;
	}

	@Override
	public String remove(Integer id) {
		if (repo.getById(id) != null) {
			repo.deleteById(id);
			return "id : " + id + " Product is deleted ";
		} else {
			return "Product not found to deleted";
		}
	}

	@Override
	public Product getProductByNo(Integer id) {
		Product product = repo.findById(id).get();
		return product;
	}

	@Override
	public String updateProduct(Product p) {
		int idVal = repo.save(p).getPid();// save product method can perform both save and update operations
		return idVal + " is updated";
	}

	@Override
	public Set<String> getAllCountries() {
		// get All locales of the world
		Locale locale[] = Locale.getAvailableLocales();
		Set<String> countrySet = new TreeSet<>();
		for (Locale l : locale) {
			if (l != null)
				countrySet.add(l.getDisplayCountry());
		}
		return countrySet;
	}//method
}
