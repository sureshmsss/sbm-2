package ss.it.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ss.it.entity.Auid;

public interface IAuidRepo extends JpaRepository<Auid,Integer>{
//	@Query("select p.pid,p.pname,p.padd,ph.reg_no,ph.number_type,ph.phone_number,ph.provider,ph.person_id from am_person_info p inner join p.am_phonenumber ph")
//	public List<Object[]> getDataByJoins();

}
