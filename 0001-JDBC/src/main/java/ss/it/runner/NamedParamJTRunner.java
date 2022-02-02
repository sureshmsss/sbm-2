package ss.it.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ss.it.entity.Movie;
import ss.it.repo.IMovieRepo;

@Component
public class NamedParamJTRunner implements CommandLineRunner {
	@Autowired
	private IMovieRepo repo;

	@Override
	public void run(String... args) throws Exception {
 		System.out.println("======NamedParameterJdbcTemplate=====");
 		System.out.println("name is : "+repo.getMovieNameById(156));

 		
 		System.out.println("list : "+repo.getMoviesByRatings("4.1", "4.5"));
 		Movie m=new Movie();
 		m.setId((int)14);
 		m.setName("rowdy");
 		m.setYear("2014");
 		m.setRating("4.0");
 		System.out.println("movie is "+repo.insertMovieObj(m));
	}

}
