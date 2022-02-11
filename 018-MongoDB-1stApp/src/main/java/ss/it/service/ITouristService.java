package ss.it.service;

import java.util.List;
import java.util.Optional;

import ss.it.document.Tourist;

public interface ITouristService {
	public String saveTourist(Tourist t);

	public List<Tourist> fetchAllTourists();

	public String saveGroup(List<Tourist> tourist);

	public List<Tourist> fetchAll(boolean asc, String... properties);

	public Optional<Tourist> findById(String id);

	public String modifyTouristById(String id, String add);

	public String deleteOnId(String id);

}
