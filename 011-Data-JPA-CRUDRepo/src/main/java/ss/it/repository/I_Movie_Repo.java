package ss.it.repository;

import org.springframework.data.repository.CrudRepository;

import ss.it.entity.Movie;

public interface I_Movie_Repo extends CrudRepository<Movie, Integer>{
	
	

}
