package ss.it.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import ss.it.entity.Movie;
import ss.it.service.IMovieService;

@Component
public class PASRepoRunnerTest implements CommandLineRunner {

	@Autowired
	private IMovieService service;

	@Override
	public void run(String... args) throws Exception {

		// invoke business method

		try {
			/*
			 * Iterable<Movie> it=service.displayMovieinOrder(true, "name");
			 * it.forEach(System.out::println);
			 */
			// for(int i=0;i<)
			Page<Movie> page = service.generateReport(1, 2, false, "name");
			if (!page.isEmpty()) {
				System.out.println("total no of pages : " + page.getTotalPages());
				System.out.println("total no of elements : " + page.getTotalElements());
				System.out.println("total no of number : " + page.getNumber());
				System.out.println("total no of size : " + page.getSize());
				System.out.println("total no of size : " + page.isLast());
				System.out.println("total no of size : " + page.isFirst());
				for (int i = 0; i < page.getTotalPages(); i++) {
					System.out.println("page number " + i);
					Page<Movie> page1 = service.generateReport(i, 3, false, "name");
					List<Movie> list = page1.getContent();
					list.forEach(t -> System.out.println(t));
				}
			} else {
				System.out.println("no page found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
