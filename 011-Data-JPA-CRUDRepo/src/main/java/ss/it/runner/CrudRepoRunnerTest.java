package ss.it.runner;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ss.it.entity.Movie;
import ss.it.service.IMovieService;

@Component
public class CrudRepoRunnerTest implements CommandLineRunner {

	@Autowired
	private IMovieService service;

	@Override
	public void run(String... args) throws Exception {

		// invoke business method

		try {

			service.groupReg(List.of(
					new Movie("rrr", "2022-01", "4.1"), new Movie("83", "2022-12", "4.3"),
					new Movie("puspa", "2021-12", "4.1"), new Movie("ACHR", "2022-04", "4.3"),
					new Movie("*BN", "2022-03", "4.1"), new Movie("?RDS", "2022-01", "4.3"),
					new Movie("SVP", "2022-02", "4.1"), new Movie("SSR", "2021-12", "4.3"),
					new Movie("AKNDA", "2021-12", "4.5"), new Movie("Gani", "2022-03", "4.8")));
			// System.out.println("result :" + result);
			// System.out.println("movie is registered : " + service.regMovie(movie));
			// System.out.println("Movies count : " + service.getMoviesCount());
			// System.out.println("movie availablity is : " + service.searchById(5));

			System.out.println("================");
			/*
			 * System.out.println("=======findAll() method========");
			 * System.out.println("***version-1****"); Iterable<Movie> list =
			 * service.fetchAllMovies(); for (Movie movies : list) {
			 * System.out.println("movies are " + list); }
			 * System.out.println("================");
			 * System.out.println("***version-2****");
			 * list.forEach(movie1->System.out.println(movie1));
			 * System.out.println("================");
			 * System.out.println("***version-3****"); list.forEach(System.out::println);
			 * System.out.println("================");
			 * System.out.println("***version-3****");
			 * Arrays.asList(list).stream().forEach(System.out::println);
			 * 
			 * 
			 * System.out.println("====findAllByID's() method");
			 * System.out.println("***version-1****"); List<Integer> ids = new
			 * ArrayList<>(); ids.add(5); ids.add(6); ids.add(7); ids.add(8);
			 * 
			 * System.out.println("movies are : " + service.fetchAllMoviesByIds(ids));
			 * System.out.println("*****version-2****"); System.out.println("movies are : "
			 * + service.fetchAllMoviesByIds(List.of(5, 6, 7, 8)));
			 * System.out.println("***Version-3****"); System.out.println("movies are : " +
			 * service.fetchAllMoviesByIds(Arrays.asList(5, 6, 7, 8)));
			 * System.out.println("***Version-4 knowledge sake****");
			 * System.out.println("movies are : " +
			 * service.fetchAllMoviesByIds(Arrays.asList(8,9,7)));
			 * 
			 * System.out.println("===Optional api=====");
			 * System.out.println("****version-1****");
			 * 
			 * System.out.println("movie availablity of : " + service.getById(81));
			 * 
			 * Optional<Movie> opt = service.fetchById(8); if (!opt.isEmpty()) {
			 * System.out.println("opt " + opt); System.out.println("opt get " + opt.get());
			 * System.out.println("opt getclass() " + opt.getClass()); } else {
			 * System.out.println("record not found"); }
			 * 
			 * 
			 * String result = service.groupReg(List.of(new Movie("rrr", "NTR", "hero"), new
			 * Movie("83", "NTR", "hero"), new Movie("rs", "NTR", "hero"), new Movie("bn",
			 * "NTR", "hero"))); System.out.println("result :" + result);
			 * 
			 * System.out.println(service.partialupdateMovie(57, "2022", "4.9"));
			 * 
			 * 
			 * 
			 * System.out.println(service.fullUpdateMovie(movie));
			 * 
			 * Movie movie = new Movie();
			 * 
			 * movie.setName("SSRoy"); movie.setYear("2021"); movie.setRating("4.8");
			 * 
			 * System.out.println(service.UpdateMovie(movie));
			 * System.out.println(service.removeById(56));
			 * 
			 * 
			 * System.out.println(service.removeAllMovies());
			
			
			
			System.out.println(service.removeAllMoviesByIds(List.of(85,86))); */
			//System.out.println(service.removeAll());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
