package ss.it.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ss.it.repository.IMovieRepo;
import ss.it.view.ResultView1;
import ss.it.view.ResultView2;

@Component
public class RepoRunnerTest implements CommandLineRunner {

	@Autowired
	private IMovieRepo repo;

	@Override
	public void run(String... args) throws Exception {
		Iterable<ResultView1> it = repo.findByNameIn(List.of("rrr", "achr"), ResultView1.class);
		it.forEach(view -> {
			System.out.println(view.getName() + "-" + view.getId());
		});
		System.out.println("============================");
		Iterable<ResultView2> it2 = repo.findByNameIn(List.of("aknda", "rrr"), ResultView2.class);
		it2.forEach(c -> {
			System.out.println(c.getName() + "=" + c.getYear() + "=" + c.getId());
		});
		System.out.println("============================");
		Iterable<ResultView2> it3 = repo.findByNameIn(List.of("puspa", "rrr"), ResultView2.class);
		it3.forEach(c -> {
			System.out.println(c.getName() + "=" + c.getYear() + "=" + c.getId());
		});
	}

}
