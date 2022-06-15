package za.ac.cput.school_management.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.school_management.domain.EmployeeAddress;
import za.ac.cput.school_management.repository.IEmployeeAddressRepository;
import za.ac.cput.school_management.service.IEmployeeAddressService;

import java.util.List;

@Service
public class EmployeeAddressImpl implements IEmployeeAddressService {

    @Autowired
    private IEmployeeAddressRepository repository;

    @Override
    public EmployeeAddress create(EmployeeAddress employeeAddress) {
        return repository.save(employeeAddress);
    }

    @Override
    public EmployeeAddress read(String staffId) {
        return repository.findById(staffId).orElse(null);
    }

    @Override
    public List<EmployeeAddress> readAll() {
        return repository.findAll();
    }

    @Override
    public void delete(String staffId) {
        repository.deleteById(staffId);
    }
}
