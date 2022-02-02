package ss.it.repo;

import java.util.List;

import ss.it.entity.Movie;

public interface IMovieRepo {
	public int getRowCount();
	public String getMovieNameById(Integer id);
	public List getAll();
	public int updateRating(Integer id,String rating);
	public int deleteMovie(Integer id);
	public int getMovieByRating(String rating,String name);
	
	public int insertMovie(Integer id,String name,String rating,String year);
	
	//Query for Object
	
	public Movie getMovieDetails(Integer id);
	public List<Movie> getMoviesByRatings(String rating1,String rating2);
	
	public int insertMovieObj(Movie m);

	
}
