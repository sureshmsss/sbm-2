package ss.it.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ss.it.entity.My_PersonInfo;

public interface IMyInfoRepo extends JpaRepository<My_PersonInfo,Integer>{

}
