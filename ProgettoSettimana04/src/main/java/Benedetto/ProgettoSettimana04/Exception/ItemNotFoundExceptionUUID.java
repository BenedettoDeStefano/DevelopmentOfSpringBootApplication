package Benedetto.ProgettoSettimana04.Exception;

import java.util.UUID;

public class ItemNotFoundExceptionUUID extends RuntimeException {

	public ItemNotFoundExceptionUUID(UUID id) {
		super("Elemento con ID " + id + " non trovato!");
	}

}
