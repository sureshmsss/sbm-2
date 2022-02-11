package ss.it.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ss.it.document.Tourist_No_Id;
import ss.it.repo.ITouristRepo;

@Service
public class TouristServiceImpl implements ITouristService {
	@Autowired
	private ITouristRepo repo;

	@Override
	public String registerTourist(Tourist_No_Id t) {
		return "doc is saved with : " + repo.save(t).getId();
	}
}
