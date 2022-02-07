package ss.it.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ss.it.entity.Auid;
import ss.it.repo.IAC_LinkRepo;
import ss.it.repo.IAuidRepo;

@Service
public class OneToManyAuid_Pan_ServiceImpl implements IOneToManyMappingService {
	@Autowired
	private IAuidRepo uidrepo;
	@Autowired
	private IAC_LinkRepo acrepo;

	@Override
	public String saveDataUsingPerson(Auid auid) {

		return uidrepo.save(auid).getId() + " is saved";
	}

	@Override
	public List<Object[]> fetchDataByJoins() {
		// TODO Auto-generated method stub
		return null;
	}

}
