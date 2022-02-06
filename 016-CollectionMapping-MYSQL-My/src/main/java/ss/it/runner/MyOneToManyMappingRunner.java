package ss.it.runner;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ss.it.entity.My_AccountDetails;
import ss.it.entity.My_Address;
import ss.it.entity.My_PersonInfo;
import ss.it.entity.My_PhoneNumber;
import ss.it.service.IOneToManyMappingService;

@Component
public class MyOneToManyMappingRunner implements CommandLineRunner {
	@Autowired
	private IOneToManyMappingService service;

	@Override
	public void run(String... args) throws Exception {

		My_AccountDetails myac = new My_AccountDetails();
		myac.setAcno(74810100102891L);
		myac.setAcType("individual");

		My_PhoneNumber myPh = new My_PhoneNumber();
		myPh.setPhoneNumber(9014840594l);
		myPh.setNumberType("personal");
		myPh.setProvider("VI");
		My_Address myadd = new My_Address();
		//myadd.setDoorNo(10012);
		myadd.setColony("ramnagar");
		myadd.setCity_State("KRMR");
		My_PersonInfo info = new My_PersonInfo();
		info.setC_uid(662311445698l);
		info.setCname("saiPranava puli");
		info.setCadd(List.of(myadd));
		info.setC_account(List.of(myac));
		info.setPhonesInfo(Set.of(myPh));
		
		
		System.out.println(service.saveDataUsingPerson(info));

	}

}
