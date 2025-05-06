package rca.restapi.year2.year2Ademo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {

    Optional<Supplier> findBySupplierName(String name);

    @Query("SELECT s FROM Supplier s WHERE s.address = :address")
    List<Supplier> findByAddress(@Param("address") String address);

    List<Supplier> findByAge(Integer age);

    Page<Supplier> findByAge(Integer age, Pageable pageable);

    List<Supplier> findByAgeAndAddress(Integer age, String address);

    Page<Supplier> findByAgeAndAddress(Integer age, String address, Pageable pageable);

    @Query("SELECT s FROM Supplier s WHERE s.age = :age OR s.address = :address")
    List<Supplier> findByAgeOrAddress(@Param("age") Integer age, @Param("address") String address);

    Page<Supplier> findAll(Pageable pageable);
}