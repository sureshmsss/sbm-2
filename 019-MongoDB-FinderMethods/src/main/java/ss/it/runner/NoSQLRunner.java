package ss.it.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ss.it.repo.ITouristRepo;

@Component
public class NoSQLRunner implements CommandLineRunner {
	@Autowired
	private ITouristRepo repo;

	@Override
	public void run(String... args) throws Exception {
		try {
			// System.out.println(repo.findByMobNo(901254684));
			System.out.println(repo.findANDDeleteByMobNo(901254684));

		} catch (

		Exception e) {
			e.printStackTrace();
		}
	}
}
