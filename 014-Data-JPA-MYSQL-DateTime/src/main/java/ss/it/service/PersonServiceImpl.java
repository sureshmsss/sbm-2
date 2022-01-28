package ss.it.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ss.it.entity.PersonInfo;
import ss.it.repo.IPersonrepo;

@Component
public class PersonServiceImpl implements IPersonService {
	@Autowired
	private IPersonrepo repo;

	@Override
	public String registerPerson(PersonInfo info) {

		return repo.save(info).getPid() + " is saved";
	}

	@Override
	public List<PersonInfo> fetchAllPersons() {
		return repo.findAll();
	}

}
