package Benedetto.ProgettoSettimana04.DAO;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Benedetto.ProgettoSettimana04.Entities.Prenotazione;
import Benedetto.ProgettoSettimana04.Exception.ItemNotFoundExceptionUUID;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PrenotazioneService {

	@Autowired
	private PrenotazioneRepository prr;

	// Salva
	public void save(Prenotazione prenotazione) {
		prr.save(prenotazione);
		log.info(prenotazione.getDataprenotazione() + " salvato!");
	}

	// CercaTutto
	public List<Prenotazione> findAll() {
		return prr.findAll();
	}

	// CercaTramiteID
	public Prenotazione findById(UUID id) throws ItemNotFoundExceptionUUID {
		return prr.findById(id).orElseThrow(() -> new ItemNotFoundExceptionUUID(id));
	}

	// CercaTramiteIDedAggiorna
	public void findByIdAndUpdate(UUID id, Prenotazione prenotazione) throws ItemNotFoundExceptionUUID {
		Prenotazione trovato = this.findById(id);
		trovato.setId(id);
		trovato.setDataprenotazione(null);
		trovato.setPostazione(null);
		trovato.setUtente(null);
		prr.save(trovato);
	}

	// CercaTramiteIDeElimina
	public void findByIdAndDelete(UUID id) throws ItemNotFoundExceptionUUID {
		Prenotazione trovato = this.findById(id);
		prr.delete(trovato);
	}

	// coUnt
	public long count() {
		return prr.count();
	}

}