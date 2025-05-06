package rca.restapi.year2.year2Ademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/suppliers")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @GetMapping
    public List<Supplier> getAllSuppliers() {
        return supplierService.getAllSuppliers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Supplier> getSupplierById(@PathVariable Long id) {
        Optional<Supplier> supplier = supplierService.getSupplier(id);
        return supplier.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Supplier> createSupplier(@RequestBody Supplier supplier) {
        Supplier savedSupplier = supplierService.createSupplier(supplier);
        return ResponseEntity.ok(savedSupplier);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Supplier> updateSupplier(@PathVariable Long id, @RequestBody Supplier supplier) {
        Optional<Supplier> existingSupplier = supplierService.getSupplier(id);
        if (existingSupplier.isPresent()) {
            supplier.setId(id);
            Supplier updatedSupplier = supplierService.createSupplier(supplier);
            return ResponseEntity.ok(updatedSupplier);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSupplier(@PathVariable Long id) {
        Optional<Supplier> supplier = supplierService.getSupplier(id);
        if (supplier.isPresent()) {
            supplierService.deleteSupplier(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }

    // Endpoint to find suppliers by age
    @GetMapping("/age/{age}")
    public ResponseEntity<List<Supplier>> findSuppliersByAge(@PathVariable Integer age) {
        List<Supplier> suppliers = supplierService.findSuppliersByAge(age);
        return ResponseEntity.ok(suppliers);
    }
}