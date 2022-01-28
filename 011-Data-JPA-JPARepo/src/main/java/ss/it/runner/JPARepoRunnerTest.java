package ss.it.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ss.it.entity.Movie;
import ss.it.service.IMovieService;

@Component
public class JPARepoRunnerTest implements CommandLineRunner {

	@Autowired
	private IMovieService service;

	@Override
	public void run(String... args) throws Exception {

		// invoke business method

		try {
			/*
			 * List<Integer> ids=Arrays.asList(145,146,null);
			 * System.out.println(service.removeAllByBatch(ids));
			 * System.out.println(service.fetchAllByIds(ids));
			 
			Movie m = new Movie();
			m.setRating("4.1");
			List<Movie> list = service.serachMovieByMovie(m, true, "name");
			list.forEach(System.out::println);*/
			System.out.println(service.searchById(151));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
