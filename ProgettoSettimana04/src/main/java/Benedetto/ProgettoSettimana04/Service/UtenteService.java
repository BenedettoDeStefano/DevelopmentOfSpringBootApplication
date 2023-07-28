package Benedetto.ProgettoSettimana04.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Benedetto.ProgettoSettimana04.Entities.Utente;
import Benedetto.ProgettoSettimana04.Exception.ItemNotFoundException;
import Benedetto.ProgettoSettimana04.Repository.UtenteRepository;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UtenteService {

	@Autowired
	private UtenteRepository utr;


	// Salva
	public void save(Utente utente) {
		utr.save(utente);
		log.info(utente.getNomeCompleto() + " salvato!");
	}


	// CercaTutto
	public List<Utente> findAll() {
		return utr.findAll();
	}


	// CercaTramiteID
	public Utente findById(Long id) throws ItemNotFoundException {
		return utr.findById(id).orElseThrow(() -> new ItemNotFoundException(id));
	}


	// CercaTramiteIDedAggiorna
	public void findByIdAndUpdate(Long id, Utente utente) throws ItemNotFoundException {
		Utente trovato = this.findById(id);
		trovato.setId(id);
		trovato.setUsername(utente.getUsername());
		trovato.setNomeCompleto(utente.getNomeCompleto());
		trovato.setEmail(utente.getEmail());
		utr.save(trovato);
	}


	// CercaTramiteIDeElimina
	public void findByIdAndDelete(Long id) throws ItemNotFoundException {
		Utente trovato = this.findById(id);
		utr.delete(trovato);
	}


	// coUnt
	public long count() {
		return utr.count();
	}

}
