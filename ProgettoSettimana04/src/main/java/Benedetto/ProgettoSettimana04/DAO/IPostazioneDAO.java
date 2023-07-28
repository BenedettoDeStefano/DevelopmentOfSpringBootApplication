package Benedetto.ProgettoSettimana04.DAO;

import java.util.List;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import Benedetto.ProgettoSettimana04.Entities.Postazione;

public interface IPostazioneDAO {

	public void save(Postazione postazione);

	public void findByIdAndUpdate(Long id, Postazione postazione);

	public void findByIdAndDelete(Long id);

	public User findById(Long id);

	public List<Postazione> findAll();

	public long count();

}
