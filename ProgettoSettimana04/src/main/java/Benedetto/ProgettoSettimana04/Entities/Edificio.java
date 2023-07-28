package Benedetto.ProgettoSettimana04.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Edificio {

	@Id
	@GeneratedValue
	private Long id;

	private String nome;
	private String indirizzo;
	private String citta;

}