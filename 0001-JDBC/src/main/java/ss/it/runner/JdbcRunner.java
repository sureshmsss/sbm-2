package ss.it.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ss.it.repo.IMovieRepo;

//@Component
public class JdbcRunner implements CommandLineRunner {
	@Autowired
	private IMovieRepo repo;

	@Override
	public void run(String... args) throws Exception {
		/*int count = repo.getRowCount();
		System.out.println("movie records count is  : " + count);
		System.out.println("===================");
		//System.out.println(repo.getMovieNameById(156));
		System.out.println(repo.getAll());
		System.out.println("===================");
		System.out.println(repo.updateRating(156, "4.9"));
		System.out.println("===================");
		System.out.println(repo.deleteMovie(147));
			System.out.println("===================");
		System.out.println(repo.getMovieByRating("4.6", "BN"));
		System.out.println("===============");
		System.out.println(repo.insertMovie(201, "A", "4.9", "2022"));*/
		System.out.println("===========");
		System.out.println(repo.getMovieDetails(156));
		System.out.println("=====ResultSetExtractor======");
		System.out.println(repo.getMoviesByRatings("4.0", "4.6"));
	}

}
