package ss.it.service;

import java.util.List;

import ss.it.entity.PersonInfo;

public interface IOneToManyMappingService {

	public String saveDataUsingPerson(PersonInfo info);

	public void loadDataUsingParent();
	
	public String deleteParentWithChild(Integer id);
	
//	public List<Object[]> fetchDataByJoins();

//	public List<PersonInfo> fetchAllEmps();
}
