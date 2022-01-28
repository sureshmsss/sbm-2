package ss.it.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import ss.it.entity.Movie;

public interface I_Movie_Repo extends PagingAndSortingRepository<Movie, Integer> {
}
