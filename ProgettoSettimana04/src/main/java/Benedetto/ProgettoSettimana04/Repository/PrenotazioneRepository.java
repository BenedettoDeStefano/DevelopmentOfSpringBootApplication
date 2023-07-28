package Benedetto.ProgettoSettimana04.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Benedetto.ProgettoSettimana04.Entities.Prenotazione;
import Benedetto.ProgettoSettimana04.Entities.Utente;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, UUID> {

	List<Prenotazione> findByUtente(Utente utente);

	boolean existsByUtenteAndDataPrenotazione(Utente utente, LocalDate dataPrenotazione);
}
