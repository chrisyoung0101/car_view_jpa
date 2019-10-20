package com.example.demo;

        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.data.jpa.repository.Query;
        import org.springframework.stereotype.Repository;

        import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, String> {
    @Query(value="SELECT * FROM car;", nativeQuery=true)
    List<Car> getAllMakes();
}
