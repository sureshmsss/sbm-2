package ss.it.runner;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ss.it.entity.AClink;
import ss.it.entity.Auid;
import ss.it.repo.IAC_LinkRepo;
import ss.it.repo.IAuidRepo;

@Component
public class OneToManyMappingRunner implements CommandLineRunner {
	@Autowired
	private IAC_LinkRepo acRepo;
	@Autowired
	private IAuidRepo idRepo;

	@Override
	public void run(String... args) throws Exception {
		AClink link = new AClink();
		link.setAcNo(1000);
		link.setBank("ubi");
		link.setPid(101);
		Auid id = new Auid();
		id.setId(1001);
		id.setName("suresh");
		id.setAdd("hyd");
		id.setAcLink(link);
		System.out.println(idRepo.save(id));
	}

}
