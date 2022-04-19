package ss.it.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ss.it.model.Employee;

public interface IEmployeeRepo extends JpaRepository<Employee, Integer> {

}
