package ss.it.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ss.it.entity.My_Address;

public interface IMyAddressInfoRepo extends JpaRepository<My_Address,Integer>{

}
