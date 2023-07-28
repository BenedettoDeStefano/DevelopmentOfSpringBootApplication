package Benedetto.ProgettoSettimana04.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Benedetto.ProgettoSettimana04.Entities.Edificio;
import Benedetto.ProgettoSettimana04.Exception.ItemNotFoundException;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EdificioService {

	@Autowired
	private EdificioRepository edr;

	// Salva
	public void save(Edificio edificio) {
		edr.save(edificio);
		log.info(edificio.getNome() + " salvato!");
	}

	// CercaTutto
	public List<Edificio> findAll() {
		return edr.findAll();
	}

	// CercaTramiteID
	public Edificio findById(Long id) throws ItemNotFoundException {
		return edr.findById(id).orElseThrow(() -> new ItemNotFoundException(id));
	}

	// CercaTramiteIDedAggiorna
	public void findByIdAndUpdate(Long id, Edificio edificio) throws ItemNotFoundException {
		Edificio trovato = this.findById(id);
		trovato.setId(id);
		trovato.setNome(null);
		trovato.setCitta(null);
		trovato.setIndirizzo(null);
		edr.save(trovato);
	}

	// CercaTramiteIDeElimina
	public void findByIdAndDelete(Long id) throws ItemNotFoundException {
		Edificio trovato = this.findById(id);
		edr.delete(trovato);
	}

	// coUnt
	public long count() {
		return edr.count();
	}

}
