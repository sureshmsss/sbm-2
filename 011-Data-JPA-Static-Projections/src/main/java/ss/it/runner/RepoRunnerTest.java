package ss.it.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ss.it.repository.IMovieRepo;
import ss.it.view.ResultView;

@Component
public class RepoRunnerTest implements CommandLineRunner {

	@Autowired
	private IMovieRepo repo;

	@Override
	public void run(String... args) throws Exception {
		Iterable<ResultView> it = repo.findByIdGreaterThanEqual(152);
		it.forEach(view -> {
			System.out.println(view.getName() + "-" + view.getYear());
		});
	}

}
