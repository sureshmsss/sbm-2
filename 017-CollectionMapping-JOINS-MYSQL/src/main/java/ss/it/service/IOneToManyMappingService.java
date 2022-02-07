package ss.it.service;

import java.util.List;

import ss.it.entity.Auid;

public interface IOneToManyMappingService {

	public String saveDataUsingPerson(Auid auid);

	public List<Object[]> fetchDataByJoins();

}
