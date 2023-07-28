package Benedetto.ProgettoSettimana04.DAO;

import java.util.List;
import java.util.UUID;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import Benedetto.ProgettoSettimana04.Entities.Prenotazione;

public interface IPrenotazioneDAO {

	public void save(Prenotazione prenotazione);

	public void findByIdAndUpdate(UUID id, Prenotazione prenotazione);

	public void findByIdAndDelete(UUID id);

	public User findById(UUID id);

	public List<Prenotazione> findAll();

	public long count();

}
