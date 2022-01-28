package ss.it.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ss.it.dao.ITPDao;
import ss.it.model.Tourist;
@Service
public class TPServiceImpl implements ITPService{
	
	@Autowired
	private ITPDao dao;

	@Override
	public List<Tourist> getPlaces(String location) throws Exception {
		 List<Tourist> list=dao.getTourist_Places(location);
		// TODO Auto-generated method stub
		return list;
	}

}
