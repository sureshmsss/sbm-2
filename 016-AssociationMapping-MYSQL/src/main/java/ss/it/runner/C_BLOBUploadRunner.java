package ss.it.runner;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ss.it.entity.EmployeeInfo;
import ss.it.service.IEmployeeInfoService;

@Component
public class C_BLOBUploadRunner implements CommandLineRunner {
	@Autowired
	private IEmployeeInfoService service;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(service.registerEmployee(new EmployeeInfo(101, "ss", List.of("sai", "vinay", "gv"),
				Set.of(1234567890L, 1234567891L), Map.of("uid", "456987456455", "pan", "EPGM12359"))));
		System.out.println();
	}

}
