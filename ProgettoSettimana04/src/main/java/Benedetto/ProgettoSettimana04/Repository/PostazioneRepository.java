package Benedetto.ProgettoSettimana04.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Benedetto.ProgettoSettimana04.Entities.Postazione;

@Repository
public interface PostazioneRepository extends JpaRepository<Postazione, Long> {

//	List<Postazione> findByTipoAndEdificio_Citta(TipoPostazione tipo, String citta);

}
