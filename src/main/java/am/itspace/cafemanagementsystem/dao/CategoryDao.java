package am.itspace.cafemanagementsystem.dao;

import am.itspace.cafemanagementsystem.POJO.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category, Integer> {
}
