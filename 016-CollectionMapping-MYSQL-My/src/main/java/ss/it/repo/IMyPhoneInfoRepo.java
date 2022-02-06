package ss.it.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ss.it.entity.My_PhoneNumber;

public interface IMyPhoneInfoRepo extends JpaRepository<My_PhoneNumber, Integer> {

}
