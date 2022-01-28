package ss.it.service;

import java.util.List;
import java.util.Optional;

import ss.it.entity.Movie;

public interface IMovieService {
	public String regMovie(Movie movie);

	public long getMoviesCount();

	public boolean searchById(Integer id);

	public Iterable<Movie> fetchAllMovies();

	public Iterable<Movie> fetchAllMoviesByIds(List<Integer> id);

	public Movie getById(Integer id);

	public Optional<Movie> fetchById(Integer id);

	public String groupReg(List<Movie> moviesList);
	
	public String partialupdateMovie(Integer mid,String year,String rating);
	public String fullUpdateMovie(Movie movie);
	public String UpdateMovie(Movie movie);
	public String removeById(Integer mid);
	public String removeAllMovies();
	public String removeAllMoviesByIds(List<Integer> ids);
	public String removeAll();

}
