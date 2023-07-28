package Benedetto.ProgettoSettimana04.Entities;

import Benedetto.ProgettoSettimana04.Enum.TipoPostazione;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
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
public class Postazione {

	@Id
	@GeneratedValue
	private Long id;

	private String codice;
	private String descrizione;
	private int numeroMassimoOccupanti;

	@Enumerated(EnumType.STRING)
	private TipoPostazione tipo;


	@ManyToOne
	private Edificio edificio;

}
