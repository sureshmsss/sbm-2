package ss.it.runner;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ss.it.entity.PersonInfo;
import ss.it.entity.PhoneNumber;
import ss.it.repo.IPhoneNumberInfoRepo;
import ss.it.service.IOneToManyMappingService;

@Component
public class OneToManyMappingRunner implements CommandLineRunner {
	@Autowired
	private IOneToManyMappingService service;

	@Override
	public void run(String... args) throws Exception {
		PhoneNumber ph1 = new PhoneNumber();
		ph1.setPhoneNumber(16454545565L);
		ph1.setNumberType("personal");
		ph1.setProvider("BSNL");

		PhoneNumber ph2 = new PhoneNumber();
		ph2.setPhoneNumber(977816114L);
		ph2.setNumberType("office");
		ph2.setProvider("Airtel");

		PersonInfo info = new PersonInfo();
		info.setPid(1);
		info.setPname("suresh");
		info.setPadd("hyd");
		info.setPhonesInfo(Set.of(ph1, ph2));
		System.out.println(service.saveDataUsingPerson(info));
		System.out.println("===============");
		service.loadDataUsingParent();
		System.out.println("===============");
		//System.out.println(service.deleteParentWithChild(1002));
	}

}
