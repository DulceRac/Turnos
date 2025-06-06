package miumg.edu.gt.turnospersistencia;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TurnoRepository extends JpaRepository<Turno, Long> {
    // ya incluye métodos como save(...) y findById(...) automáticamente
}
