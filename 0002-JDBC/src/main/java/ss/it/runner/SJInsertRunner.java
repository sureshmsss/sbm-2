package ss.it.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ss.it.entity.Movie;
import ss.it.repo.IMovieRepo;

@Component
public class SJInsertRunner implements CommandLineRunner {
	@Autowired
	private IMovieRepo repo;

	@Override
	public void run(String... args) throws Exception {
		Movie m=new Movie();
		m.setId(15);
		m.setName("rowdy boys");
		m.setRating("4.2");
		m.setYear("2022");
		System.out.println(repo.insert(m));
	}

}
