package Benedetto.ProgettoSettimana04.Config;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Benedetto.ProgettoSettimana04.Entities.Edificio;
import Benedetto.ProgettoSettimana04.Entities.Postazione;
import Benedetto.ProgettoSettimana04.Entities.Prenotazione;

@Configuration
public class ConfigurationBean {

	@Bean
	public User User() {
		return new User();
	}

	@Bean
	public Prenotazione Prenotazione() {
		return new Prenotazione();
	}

	@Bean
	public Postazione Postazione() {
		return new Postazione();
	}

	@Bean
	public Edificio Edificio() {
		return new Edificio();
	}

}
