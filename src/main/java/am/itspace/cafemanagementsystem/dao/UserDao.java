package am.itspace.cafemanagementsystem.dao;

import am.itspace.cafemanagementsystem.POJO.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserDao extends JpaRepository<User, Integer> {

    User findByEmail(@Param("email") String email);

    List<String> findByRole(String admin);

    List<String> findAllByRole(String role);

}
