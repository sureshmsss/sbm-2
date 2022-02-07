package ss.it.runner;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ss.it.entity.AC_link;
import ss.it.entity.Auid;
import ss.it.service.IOneToManyMappingService;

@Component
public class OneToManyMappingRunner implements CommandLineRunner {
	@Autowired
	private IOneToManyMappingService service;

	@Override
	public void run(String... args) throws Exception {
		AC_link link = new AC_link();
		link.setAcNo(1000);
		link.setBank("ubi");
		link.setPid(101);
		AC_link link1 = new AC_link();
		link1.setAcNo(1000);
		link1.setBank("ubi");
		link1.setPid(101);

		Auid id = new Auid();
		id.setId(1001);
		id.setName("suresh");
		id.setAdd("hyd");
		id.setAcLink(Set.of(link, link1));
		System.out.println(service.saveDataUsingPerson(id));
	}

}
