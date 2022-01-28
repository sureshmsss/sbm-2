package ss.it.service;

import org.springframework.data.domain.Page;

import ss.it.entity.Movie;

public interface IMovieService {

	
	public Iterable<Movie> displayMovieinOrder(boolean asc,String ...properties);
	
	public Page<Movie> generateReport(int pageNo,int pageSize,boolean asc,String ...props);
}
