package ss.it.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ss.it.entity.Movie;
import ss.it.repository.IMovieRepo;

@Component
public class RepoRunnerTest implements CommandLineRunner {

	@Autowired
	private IMovieRepo repo;

	@Override
	public void run(String... args) throws Exception {
		/*
		 * List<Movie> list = repo.searchMoviesOfRating("4.5"); //
		 * list.forEach(System.out::println); list = repo.searchMoviesbetweenRating(150,
		 * 154); list.forEach(System.out::println);
		 * 
		 * System.out.println("=====all values with named params=====");
		 * repo.searchMoviesByNames("rrr", "SSR", "SVP",
		 * "83").forEach(System.out::println);
		 * System.out.println("=====all values with ordinal positional params=====");
		 * repo.searchMoviesByNames1("rrr", "SSR", "SVP",
		 * "83").forEach(System.out::println);
		 * System.out.println("=====selecting specific multiple cols====="); //
		 * repo.fetchMovieDetailsByRatingsAndYear(4.3f).forEach(System.out::println);
		 * System.out.println("======selecting specific single cols");
		 * repo.fetchMoviesByYearRange("2020", "2022").forEach(System.out::println);
		 * 
		 * 
		 * System.out.println("=======single row and as entity only======="); Movie m =
		 * repo.fetchDataByMovieName("rrr"); if (m != null) System.out.println(m); else
		 * System.out.println("not found");
		 * 
		 * System.out.println("=======specific multiple col values ======="); Object
		 * data = repo.fetchDetailsByMovieName("rrr"); Object result[] = (Object[])
		 * data; for (Object val : result) System.out.println(val);
		 * 
		 * 
		 * System.out.println("=====specific single col from single row======="); String
		 * year = repo.fetchYearByName("rrr"); System.out.println("year is : " + year);
		 * 
		 * System.out.println("======aggregate functions on HQL/JPQL====="); Object
		 * result1[]=(Object[])repo.fetchAggregateDataOnMovies();
		 * System.out.println(result1[0]); System.out.println(result1[1]);
		 * System.out.println(result1[2]);
		

		repo.fetchMaxRatingMovies().forEach(System.out::println); */
		repo.fetchMaxId().forEach(System.out::println); 
	}

}
