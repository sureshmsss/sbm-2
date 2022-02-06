package ss.it.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ss.it.entity.PersonInfo;

public interface IPersonInfoRepo extends JpaRepository<PersonInfo,Integer>{
	//@Query("select p.pid,p.pname,p.padd,ph.reg_no,ph.number_type,ph.phone_number,ph.provider,ph.person_id from am_person_info p left join p.am_phonenumber ph")
	//public List<Object[]> getDataByJoins();

}
