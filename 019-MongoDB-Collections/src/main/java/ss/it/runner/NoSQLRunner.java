package ss.it.runner;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ss.it.document.MyCollection;
import ss.it.repo.ITouristRepo;

@Component
public class NoSQLRunner implements CommandLineRunner {
	@Autowired
	private ITouristRepo repo;

	@Override
	public void run(String... args) throws Exception {
		try {
			MyCollection collection = new MyCollection();
			collection.setId(1212121122l);
			collection.setName("suresh");
			collection.setFriends(List.of("suresh", "mahesh", "ramesh"));
			collection.setMobNo(Set.of(457879554l, 4545547931l));
			collection.setBankAc(Map.of("sbi", 12546987546l, "ubi", 459874562l));

			repo.save(collection);
		} catch (

		Exception e) {
			e.printStackTrace();
		}
	}
}
