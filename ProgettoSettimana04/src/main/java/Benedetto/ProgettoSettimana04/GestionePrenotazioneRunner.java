package Benedetto.ProgettoSettimana04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import Benedetto.ProgettoSettimana04.Config.ConfigurationBean;
import Benedetto.ProgettoSettimana04.Service.EdificioService;
import Benedetto.ProgettoSettimana04.Service.PostazioneService;
import Benedetto.ProgettoSettimana04.Service.PrenotazioneService;
import Benedetto.ProgettoSettimana04.Service.UtenteService;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class GestionePrenotazioneRunner implements CommandLineRunner {

	@Autowired
	private ConfigurationBean cb;

	@Autowired
	private EdificioService es;

	@Autowired
	private PostazioneService ps;

	@Autowired
	private PrenotazioneService pss;

	@Autowired
	private UtenteService us;

	@Override
	public void run(String... args) throws Exception {
		// Salvataggio Utenti
		us.save(cb.utente1());
		us.save(cb.utente2());
		us.save(cb.utente3());
		// Salvataggio Edifici
		es.save(cb.edificio1());
		es.save(cb.edificio2());
		es.save(cb.edificio3());
		// Salvataggio Postazioni
		ps.save(cb.postazione1());
		ps.save(cb.postazione2());
		ps.save(cb.postazione3());
		// Salvataggio Prenotazioni
		pss.save(cb.prenotazione1());
		pss.save(cb.prenotazione2());
		pss.save(cb.prenotazione3());

//		log.info(ps.findByTipoAndEdificio_Citta(TipoPostazione.OPENSPACE, "Firenze").toString());
	}

}
