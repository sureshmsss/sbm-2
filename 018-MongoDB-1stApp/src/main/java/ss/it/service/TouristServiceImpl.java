package ss.it.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import ss.it.document.Tourist;
import ss.it.repo.ITouristRepo;

@Service
public class TouristServiceImpl implements ITouristService {
	@Autowired
	private ITouristRepo repo;

	@Override
	public String saveTourist(Tourist t) {
		return "document is saved with :" + repo.save(t);
	}

	@Override
	public List<Tourist> fetchAllTourists() {
		return repo.findAll();
	}

	@Override
	public String saveGroup(List<Tourist> tourist) {
		int count = repo.saveAll(tourist).size();
		return count + " no of docs are saved";
	}

	@Override
	public List<Tourist> fetchAll(boolean asc, String... properties) {
		Sort sort = Sort.by(asc ? Direction.ASC : Direction.DESC, properties);
		return repo.findAll(sort);
	}

	@Override
	public Optional<Tourist> findById(String id) {
		Optional<Tourist> opt = repo.findById(id);
		return opt;
	}

	@Override
	public String modifyTouristById(String id, String add) {
		Optional<Tourist> opt = repo.findById(id);
		if (opt.isPresent()) {
			Tourist t = opt.get();
			t.setAdd(add);

			return repo.save(t).getTid() + " doc is updated with : " + add;
		} else {
			return "no doc found";
		}
	}

	@Override
	public String deleteOnId(String id) {

		Optional<Tourist> opt = repo.findById(id);
		if (opt.isPresent()) {
			Tourist t = opt.get();
			repo.deleteById(id);
			return "doc is deleted id of : " + id;
		} else {
			return "doc is not found to delete with " + id;
		}

	}
}
