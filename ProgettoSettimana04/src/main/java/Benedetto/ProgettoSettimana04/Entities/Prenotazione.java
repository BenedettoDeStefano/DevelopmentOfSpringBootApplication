package Benedetto.ProgettoSettimana04.Entities;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Prenotazione {

	@Id
//	@GeneratedValue
	private UUID id;

	@ManyToOne
	private Utente utente;

	@ManyToOne
	private Postazione postazione;

	LocalDate dataprenotazione;
}
