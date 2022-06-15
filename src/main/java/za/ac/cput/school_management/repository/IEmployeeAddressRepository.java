package za.ac.cput.school_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.school_management.domain.EmployeeAddress;

@Repository
public interface IEmployeeAddressRepository extends JpaRepository<EmployeeAddress, String> {
}
