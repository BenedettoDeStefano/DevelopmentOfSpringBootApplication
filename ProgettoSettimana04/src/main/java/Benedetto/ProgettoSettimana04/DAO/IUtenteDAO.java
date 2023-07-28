package Benedetto.ProgettoSettimana04.DAO;

import java.util.List;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import Benedetto.ProgettoSettimana04.Entities.Utente;

public interface IUtenteDAO {

	public void save(Utente utente);

	public void findByIdAndUpdate(Long id, Utente utente);

	public void findByIdAndDelete(Long id);

	public User findById(Long id);

	public List<User> findAll();

	public long count();

}
