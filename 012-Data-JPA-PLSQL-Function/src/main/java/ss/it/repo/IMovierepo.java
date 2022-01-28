package ss.it.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ss.it.entity.Movie;

public interface IMovierepo extends JpaRepository<Movie, Integer> {

}
