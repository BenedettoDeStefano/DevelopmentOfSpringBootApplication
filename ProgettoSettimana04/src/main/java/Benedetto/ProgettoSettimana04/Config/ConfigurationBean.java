package Benedetto.ProgettoSettimana04.Config;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Benedetto.ProgettoSettimana04.Entities.Edificio;
import Benedetto.ProgettoSettimana04.Entities.Postazione;
import Benedetto.ProgettoSettimana04.Entities.Prenotazione;
import Benedetto.ProgettoSettimana04.Entities.Utente;
import Benedetto.ProgettoSettimana04.Enum.TipoPostazione;

@Configuration
public class ConfigurationBean {

	// --------------------------------- Utenti ---------------------------------
	@Bean("Utente1")
	public Utente utente1() {
		return Utente.builder().username("Ben").nomeCompleto("Benedetto De Stefano").email("ben@gmail.com").build();
	}

	@Bean("Utente2")
	public Utente utente2() {
		return Utente.builder().username("Fra").nomeCompleto("Francesco Pugliese").email("fra@gmail.com").build();
	}

	@Bean("Utente3")
	public Utente utente3() {
		return Utente.builder().username("Gio").nomeCompleto("Giovanni Pezzella").email("gio@gmail.com")
				.build();
	}

	// --------------------------------- Prenotazioni
	// ---------------------------------

	@Bean("Prenotazione1")
	public Prenotazione prenotazione1() {
		return Prenotazione.builder().id(UUID.randomUUID()).utente(utente1()).postazione(postazione1())
				.dataPrenotazione(LocalDate.now()).build();
	}

	@Bean("Prenotazione2")
	public Prenotazione prenotazione2() {
		return Prenotazione.builder().id(UUID.randomUUID()).utente(utente2()).postazione(postazione2())
				.dataPrenotazione(LocalDate.now().plusDays(1)).build();
	}

	@Bean("Prenotazione3")
	public Prenotazione prenotazione3() {
		return Prenotazione.builder().id(UUID.randomUUID()).utente(utente3()).postazione(postazione3())
				.dataPrenotazione(LocalDate.now().plusDays(2)).build();
	}

	// --------------------------------- Postazioni
	// ---------------------------------

	@Bean("Postazione1")
	public Postazione postazione1() {
		return Postazione.builder().descrizione("Postazione01").tipo(TipoPostazione.OPENSPACE)
				.numeroMassimoOccupanti(10).edificio(edificio1()).build();
	}

	@Bean("Postazione2")
	public Postazione postazione2() {
		return Postazione.builder().descrizione("Postazione02").tipo(TipoPostazione.PRIVATO).numeroMassimoOccupanti(20)
				.edificio(edificio2()).build();
	}

	@Bean("Postazione3")
	public Postazione postazione3() {
		return Postazione.builder().descrizione("Postazione03").tipo(TipoPostazione.SALA_RIUNIONI)
				.numeroMassimoOccupanti(30).edificio(edificio3()).build();
	}

	// --------------------------------- Edifici ---------------------------------

	@Bean("Edificio1")
    public Edificio edificio1() {
		return Edificio.builder().nome("Torre del Sole").indirizzo("Via Roma, 1").citta("Milano").build();
    }

	@Bean("Edificio2")
    public Edificio edificio2() {
		return Edificio.builder().nome("Palazzo delle Meraviglie").indirizzo("Corso Vittorio Emanuele, 10")
				.citta("Roma").build();
    }

	@Bean("Edificio3")
    public Edificio edificio3() {
		return Edificio.builder().nome("Villa Serenità").indirizzo("Via dei Fiori, 5").citta("Firenze").build();
    }

}
