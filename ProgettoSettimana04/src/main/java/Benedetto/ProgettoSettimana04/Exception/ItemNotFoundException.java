package Benedetto.ProgettoSettimana04.Exception;

public class ItemNotFoundException extends RuntimeException {

	public ItemNotFoundException(Long id) {
		super("Elemento con ID " + id + " non trovato!");
	}
}
