package ss.it.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ss.it.entity.PersonInfo;
import ss.it.repo.IPersonInfoRepo;

@Component
public class PersonInfoServiceImpl implements IPersonInfoService {
	@Autowired
	private IPersonInfoRepo repo;

	@Override
	public String registerPerson(PersonInfo info) {

		return repo.save(info).getPid() + " is saved";
	}

	@Override
	public PersonInfo fetchAllPersons(int pid) {
		Optional<PersonInfo> opt = repo.findById(pid);
		if (opt.isPresent())
			return opt.get();
		else
			return null;
	}

}
