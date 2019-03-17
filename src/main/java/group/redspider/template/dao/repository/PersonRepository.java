package group.redspider.template.dao.repository;

import group.redspider.template.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Employee, Long> {
}
