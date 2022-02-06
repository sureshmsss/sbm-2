package ss.it.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ss.it.entity.PersonInfo;
import ss.it.entity.PhoneNumber;
import ss.it.repo.IPersonInfoRepo;
import ss.it.repo.IPhoneNumberInfoRepo;

@Component
public class OneToManyPersonInfoServiceImpl implements IOneToManyMappingService {
	@Autowired
	private IPersonInfoRepo personrepo;
	@Autowired
	private IPhoneNumberInfoRepo phonerepo;

	@Override
	public String saveDataUsingPerson(PersonInfo info) {
		return personrepo.save(info).getPid() + " is saved";
	}

	@Override
	public void loadDataUsingParent() {
		// TODO Auto-generated method stub
		List<PhoneNumber> list = phonerepo.findAll();
		System.out.println(list);

	}

	@Override
	public String deleteParentWithChild(Integer id) {
		Optional<PersonInfo> opt = personrepo.findById(id);

		if (opt != null) {
			System.out.println("object found");
			personrepo.deleteById(id);
			return "person is deleted  with " + id;
		} else {
			return "person not found to delete with " + id;
		}
	}

}
