package ss.it.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ss.it.entity.EmployeeInfo;

public interface IEmployeeInfoRepo extends JpaRepository<EmployeeInfo,Integer>{

}
