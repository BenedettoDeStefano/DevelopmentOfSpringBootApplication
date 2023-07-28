package Benedetto.ProgettoSettimana04.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import Benedetto.ProgettoSettimana04.Entities.Prenotazione;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione, UUID> {

}
