package Benedetto.ProgettoSettimana04.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Benedetto.ProgettoSettimana04.Entities.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Long> {
}
