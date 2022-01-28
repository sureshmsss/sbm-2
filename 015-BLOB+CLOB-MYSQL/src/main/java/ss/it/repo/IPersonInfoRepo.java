package ss.it.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ss.it.entity.PersonInfo;

public interface IPersonInfoRepo extends JpaRepository<PersonInfo,Integer>{

}
