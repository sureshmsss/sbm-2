package ss.it.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import ss.it.entity.Employee;
@Component
public interface IEmployeerepo extends JpaRepository<Employee, Integer> {

}
