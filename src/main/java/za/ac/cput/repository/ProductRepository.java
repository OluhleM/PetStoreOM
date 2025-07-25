package za.ac.cput.repository;
/*Oluhle Makhaye
* 222419636*/

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByProductName(String productName);
    Product findByProductID(long productID);
}
