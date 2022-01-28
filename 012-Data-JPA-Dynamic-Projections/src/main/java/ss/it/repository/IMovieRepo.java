package ss.it.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ss.it.entity.Movie;
import ss.it.view.View;

public interface IMovieRepo extends JpaRepository<Movie, Integer> {

	public <T extends View> Iterable<T> findByNameIn(List<String> names, Class<T> clazz);
}