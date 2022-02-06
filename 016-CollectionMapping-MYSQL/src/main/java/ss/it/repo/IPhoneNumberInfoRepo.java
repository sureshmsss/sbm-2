package ss.it.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ss.it.entity.PhoneNumber;

public interface IPhoneNumberInfoRepo extends JpaRepository<PhoneNumber, Integer> {

}
