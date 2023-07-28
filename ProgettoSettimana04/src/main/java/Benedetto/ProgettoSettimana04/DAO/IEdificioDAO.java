package Benedetto.ProgettoSettimana04.DAO;

import java.util.List;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import Benedetto.ProgettoSettimana04.Entities.Edificio;

public interface IEdificioDAO {

	public void save(Edificio edificio);

	public void findByIdAndUpdate(Long id, Edificio edificio);

	public void findByIdAndDelete(Long id);

	public User findById(Long id);

	public List<Edificio> findAll();

	public long count();

}
