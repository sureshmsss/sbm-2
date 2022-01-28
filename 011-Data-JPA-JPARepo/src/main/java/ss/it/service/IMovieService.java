package ss.it.service;

import java.util.List;

import ss.it.entity.Movie;

public interface IMovieService {
	public String removeAllByBatch(List<Integer> ids);

	public String fetchAllByIds(List<Integer> ids);

	public List<Movie> serachMovieByMovie(Movie movie, boolean asc, String... props);

	public Movie searchById(Integer id);

}
