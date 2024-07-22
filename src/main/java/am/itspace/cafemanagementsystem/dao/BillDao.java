package am.itspace.cafemanagementsystem.dao;

import am.itspace.cafemanagementsystem.POJO.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillDao extends JpaRepository<Bill, Integer> {
}
