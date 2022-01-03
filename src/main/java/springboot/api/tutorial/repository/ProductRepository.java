package springboot.api.tutorial.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.api.tutorial.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    Optional<Product> findById(Integer id);

    void deleteById(Integer id);

}
