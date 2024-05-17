package it.esercizio.cinema;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * La classe OperazioniPrenotazioni rappresenta le possibili operazioni
 * effettuate per la prenotazione di posti in un cinema.
 */

public class OperazioniPrenotazioni {

	private ArrayList<Prenotazione> prenotazioni;

	/**
	 * Costruttore della classe OperazioniPrenotazioni. Inizializza l'elenco delle
	 * prenotazioni.
	 */
	public OperazioniPrenotazioni() {
		prenotazioni = new ArrayList<>();
	}

	/**
	 * Aggiunge una prenotazione all'elenco delle prenotazioni. Verifica che l'ID
	 * della prenotazione non esista già.
	 * 
	 * @param p La prenotazione da aggiungere
	 */
	// Metodo per aggiungere una prenotazionne
	public void addPrenotazione(Prenotazione p) {
		// Verifica che l'ID della prenotazione non esista già
		for (Prenotazione prenotazioneEsistente : prenotazioni) {
			if (prenotazioneEsistente.getId() == p.getId()) {
				System.out.println("Inserimento fallito: prenotazione con ID " + p.getId() + " già esistente.");
				return;
			}
		}
		prenotazioni.add(p);
		System.out.print("Prenotazione con id " + p.getId() + " aggiunta\n");
	}

	/**
	 * Cancella una prenotazione dall'elenco delle prenotazioni in base all'ID.
	 * 
	 * @param id L'ID della prenotazione da cancellare
	 */
	// Metoro per cancellare una prenotazione in base all'id
	public void deletePrenotazione(int id) {
		// Lorenzo consigli di utilizzare direttamente il metodo removeIf
		// removeIf accetta un predicato con parametro e rimuove gli elementi che
		// soddisfano il predicato
		// Vado ad utilizzare un espressione lamda che verichica se l'id della
		// prentazione è uguale all'id inserito

		// prenotazioni.removeIf(p -> p.getId() == id);
		// System.out.println("Prenotazione con id " + id + " cancellata con successo");
		Iterator<Prenotazione> iterator = prenotazioni.iterator();
		boolean prenotazioneTrovata = false;
		while (iterator.hasNext()) {
			Prenotazione p = iterator.next();
			if (p.getId() == id) {
				iterator.remove();
				System.out.println("Prenotazione con id " + p.getId() + " cancellata con successo");
				prenotazioneTrovata = true;
				break;
			}
		}
		if (!prenotazioneTrovata) {
			System.out.println("Cancellazione fallita: prenotazione con ID " + id + " non trovata.");
		}
	}

	/**
	 * Visualizza tutte le prenotazioni per una data specifica.
	 * 
	 * @param data La data per cui visualizzare le prenotazioni
	 */
	// Metoro per visualizzare tutte le prenotazione per una data specifica
	public void viewPrenotazioni(Date data) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String dataString = formatter.format(data);
		System.out.println("Prenotazioni per la data: " + dataString);

		for (Prenotazione p : prenotazioni) {
			String dataPrenotazioneString = formatter.format(p.getDataPrenotazione());
			if (dataPrenotazioneString.equals(dataString)) {
				System.out.println("Prenotazione con id: " + p.getId());
				System.out.println("Nome del cliente: " + p.getNomeCliente());

				if (p instanceof PrenotazioneSingola) {
					System.out.println("Tipo di prenotazione: prenotazione singola");
				} else if (p instanceof PrenotazioneGruppo) {
					System.out.println("Tipo di prenotazione: prenotazione di gruppo");
				}
			}
		}
	}

}
