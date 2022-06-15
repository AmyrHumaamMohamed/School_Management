package za.ac.cput.school_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import za.ac.cput.school_management.domain.Employee;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {
    @Query("select e.name.firstName from Employee e where e.email = :email")
    List<String> findByEmail(@Param(value = "email") String email);
}