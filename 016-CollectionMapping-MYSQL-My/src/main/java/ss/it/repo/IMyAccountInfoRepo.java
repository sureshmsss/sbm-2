package ss.it.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ss.it.entity.My_AccountDetails;

public interface IMyAccountInfoRepo extends JpaRepository<My_AccountDetails,Integer>{

}
