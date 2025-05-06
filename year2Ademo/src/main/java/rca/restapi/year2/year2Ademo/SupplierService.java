package rca.restapi.year2.year2Ademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository repository;

    public List<Supplier> getAllSuppliers() {
        return repository.findAll();
    }

    public Optional<Supplier> getSupplier(Long id) {
        return repository.findById(id);
    }

    public Supplier createSupplier(Supplier supplier) {
        return repository.save(supplier);
    }

    public void deleteSupplier(Long id) {
        repository.deleteById(id);
    }

    // Find suppliers by age
    public List<Supplier> findSuppliersByAge(Integer age) {
        return repository.findByAge(age);
    }

    // Find suppliers by age and address
    public List<Supplier> findSuppliersByAgeAndAddress(Integer age, String address) {
        return repository.findByAgeAndAddress(age, address);
    }

    // Optional: Find suppliers by age or address
    public List<Supplier> findSuppliersByAgeOrAddress(Integer age, String address) {
        return repository.findByAgeOrAddress(age, address);
    }
}