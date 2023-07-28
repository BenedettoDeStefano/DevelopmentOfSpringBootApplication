package Benedetto.ProgettoSettimana04.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Benedetto.ProgettoSettimana04.Entities.Postazione;
import Benedetto.ProgettoSettimana04.Enum.TipoPostazione;

@Repository
public interface PostazioneRepository extends JpaRepository<Postazione, Long> {
	List<Postazione> findByEdificioCitta(String citta);

	List<Postazione> findByTipo(TipoPostazione tipo);

}
