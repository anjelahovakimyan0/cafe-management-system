package am.itspace.cafemanagementsystem.dao;

import am.itspace.cafemanagementsystem.POJO.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductDao extends JpaRepository<Product, Integer> {

    List<Product> findByCategory_Id(Integer id);//TODO

}
