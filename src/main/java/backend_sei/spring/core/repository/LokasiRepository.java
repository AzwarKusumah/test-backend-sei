package backend_sei.spring.core.repository;

import backend_sei.spring.core.entity.Lokasi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LokasiRepository extends JpaRepository<Lokasi, Long> {
}
