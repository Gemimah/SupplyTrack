package rca.restapi.year2.year2Ademo;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public void createSupplier(Supplier supplier) {
        repository.save(supplier);
    }

    public void deleteSupplier(Long id) {
        repository.deleteById(id);
    }
}
