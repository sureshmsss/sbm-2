package ss.it.dao;

import java.util.List;

import ss.it.model.Tourist;

public interface ITPDao {
	public List<Tourist> getTourist_Places(String location) throws Exception;

}
