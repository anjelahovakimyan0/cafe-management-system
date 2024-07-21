package am.itspace.cafemanagementsystem.dao;

import am.itspace.cafemanagementsystem.POJO.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Integer> {
}
