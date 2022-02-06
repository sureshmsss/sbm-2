package ss.it.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ss.it.entity.My_PersonInfo;
import ss.it.repo.IMyAccountInfoRepo;
import ss.it.repo.IMyAddressInfoRepo;
import ss.it.repo.IMyInfoRepo;
import ss.it.repo.IMyPhoneInfoRepo;

@Component
public class OneToManyPersonInfoServiceImpl implements IOneToManyMappingService {
	@Autowired
	private IMyAccountInfoRepo acrepo;
	@Autowired
	private IMyAddressInfoRepo addRepo;
	@Autowired
	private IMyInfoRepo myRepo;
	@Autowired
	private IMyPhoneInfoRepo phRepo;
	

	@Override
	public String saveDataUsingPerson(My_PersonInfo info) {
		return myRepo.save(info).getC_uid() + " is saved";
	}

}
