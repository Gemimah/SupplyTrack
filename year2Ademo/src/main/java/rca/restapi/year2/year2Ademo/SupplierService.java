package rca.restapi.year2.year2Ademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

    // Paginated get all suppliers
    public Page<Supplier> getAllSuppliers(Pageable pageable) {
        return repository.findAll(pageable);
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

    public List<Supplier> findSuppliersByAge(Integer age) {
        return repository.findByAge(age);
    }

    // Paginated find by age
    public Page<Supplier> findSuppliersByAge(Integer age, Pageable pageable) {
        return repository.findByAge(age, pageable);
    }

    public List<Supplier> findSuppliersByAgeAndAddress(Integer age, String address) {
        return repository.findByAgeAndAddress(age, address);
    }

    // Paginated find by age and address
    public Page<Supplier> findSuppliersByAgeAndAddress(Integer age, String address, Pageable pageable) {
        return repository.findByAgeAndAddress(age, address, pageable);
    }
}