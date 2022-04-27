package ss.it.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ss.it.entity.Product;

public interface ICRUDRepo extends JpaRepository<Product, Integer> {

}
