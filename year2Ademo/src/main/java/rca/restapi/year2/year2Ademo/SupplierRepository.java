package rca.restapi.year2.year2Ademo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {

    // Find supplier by name (already present)
    Optional<Supplier> findBySupplierName(String name);

    // Find suppliers by address (already present)
    @Query("SELECT s FROM Supplier s WHERE s.address = :address")
    List<Supplier> findByAddress(@Param("address") String address);

    // Find suppliers by age (new method using query derivation)
    List<Supplier> findByAge(Integer age);

    // Find suppliers by both age and address (new method using query derivation)
    List<Supplier> findByAgeAndAddress(Integer age, String address);

    // Optional: Find suppliers by age or address (using custom query)
    @Query("SELECT s FROM Supplier s WHERE s.age = :age OR s.address = :address")
    List<Supplier> findByAgeOrAddress(@Param("age") Integer age, @Param("address") String address);
}