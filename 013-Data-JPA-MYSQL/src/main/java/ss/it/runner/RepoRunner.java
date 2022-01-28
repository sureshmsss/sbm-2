package ss.it.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ss.it.service.IEmployeeService;

@Component
public class RepoRunner implements CommandLineRunner {
	@Autowired
	private IEmployeeService service;

	@Override
	public void run(String... args) throws Exception {
		service.fetchAllEmpsByDesg("clerk", "dev").forEach(emp -> {
			System.out.println(emp);
		});

	}

}
