package ss.it.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ss.it.entity.Movie;
import ss.it.view.ResultView;

public interface IMovieRepo extends JpaRepository<Movie, Integer> {

	public Iterable<ResultView> findByIdGreaterThanEqual(int id);
}