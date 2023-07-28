package Benedetto.ProgettoSettimana04.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Utente {

	@Id
	@GeneratedValue
	private Long id;

	private String username;
	private String nomeCompleto;
	private String email;
	
}