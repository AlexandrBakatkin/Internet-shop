package Bakatkin.Internetshop.persist.repo;

import Bakatkin.Internetshop.persist.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepo extends JpaRepository<Product, Long> {
    @Query("from Product p where name = :name")
    Product findOneByName(String name);
}