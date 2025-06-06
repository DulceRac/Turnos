package miumg.edu.gt.turnospersistencia;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Optional<Cliente> findByDpi(String dpi); // ← NECESARIO
}
