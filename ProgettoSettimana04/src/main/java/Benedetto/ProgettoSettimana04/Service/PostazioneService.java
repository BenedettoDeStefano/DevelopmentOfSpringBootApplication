package Benedetto.ProgettoSettimana04.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Benedetto.ProgettoSettimana04.Entities.Postazione;
import Benedetto.ProgettoSettimana04.Exception.ItemNotFoundException;
import Benedetto.ProgettoSettimana04.Repository.PostazioneRepository;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PostazioneService {

	@Autowired
	private PostazioneRepository psr;

	// Salva
	public void save(Postazione postazione) {
		psr.save(postazione);
		log.info(postazione.getDescrizione() + " salvato!");
	}

	// CercaTutto
	public List<Postazione> findAll() {
		return psr.findAll();
	}

	// CercaTramiteID
	public Postazione findById(Long id) throws ItemNotFoundException {
		return psr.findById(id).orElseThrow(() -> new ItemNotFoundException(id));
	}

	// CercaTramiteIDedAggiorna
	public void findByIdAndUpdate(Long id, Postazione postazione) throws ItemNotFoundException {
		Postazione trovato = this.findById(id);
		trovato.setId(id);
		trovato.setCodice(postazione.getCodice());
		trovato.setDescrizione(postazione.getDescrizione());
		trovato.setEdificio(postazione.getEdificio());
		trovato.setTipo(postazione.getTipo());
		trovato.setNumeroMassimoOccupanti(postazione.getNumeroMassimoOccupanti());
		psr.save(trovato);
	}

	// CercaTramiteIDeElimina
	public void findByIdAndDelete(Long id) throws ItemNotFoundException {
		Postazione trovato = this.findById(id);
		psr.delete(trovato);
	}

	// coUnt
	public long count() {
		return psr.count();
	}

}
