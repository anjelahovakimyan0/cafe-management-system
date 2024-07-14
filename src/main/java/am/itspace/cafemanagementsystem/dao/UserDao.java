package am.itspace.cafemanagementsystem.dao;

import am.itspace.cafemanagementsystem.POJO.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
}
