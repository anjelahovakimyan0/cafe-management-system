package am.itspace.cafemanagementsystem.dao;

import am.itspace.cafemanagementsystem.POJO.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryDao extends JpaRepository<Category, Integer> {

//    List<Category> getAllCategory();

}
