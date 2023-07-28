package Benedetto.ProgettoSettimana04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProgettoSettimana04Application {


	public static void main(String[] args) {
		SpringApplication.run(ProgettoSettimana04Application.class, args);

	}

}

//		private UtenteRepository ur = new UtenteRepository();
//		
//		private PrenotazioneService pr;
//		
//		Utente utente1 = new Utente(26133131l, "Chiattillo", "Benedetto", "benchiat@gmail.com");
//		ur.save(utente1);
//		System.out.println(utente1.toString());