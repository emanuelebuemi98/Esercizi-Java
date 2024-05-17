package it.esercizio.negozio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * La classe OperazioniNegozio gestisce le operazioni di un negozio sugli
 * oggetti in magazzino.
 */

public class OperazioniNegozio {

	private List<Prodotto> listaProdotti;

	/**
	 * Costruttore della classe OperazioniNegozio. 
	 * Inizializza l'elenco dei prodotti.
	 */
	public OperazioniNegozio() {
		listaProdotti = new ArrayList<>();
	}

	/**
	 * Aggiunge un nuovo prodotto all'elenco dei prodotti. Verifica che il codice
	 * del prodotto non esista già.
	 * 
	 * @param p Il prodotto da aggiungere
	 */
	// Aggiunta di un nuovo prodotto
	public void addProdotto(Prodotto p) {
		// Verifica che l'ID della prenotazione non esista già
		for (Prodotto prodottoEsistente : listaProdotti) {
			if (prodottoEsistente.getCodice().equals(p.getCodice())) {
				System.out.println("Inserimento fallito: prodotto con codice " + p.getCodice() + " già esistente.");
				return;
			}
		}
		listaProdotti.add(p);
		System.out.print("Prodotto con codice " + p.getCodice() + " aggiunto con successo\n");
	}

	/**
	 * Modifica la quantità disponibile di un prodotto.
	 * 
	 * @param codice        Il codice del prodotto da modificare
	 * @param nuovaQuantita La nuova quantità disponibile
	 */
	// Modifica della quantità disponibile di un prodotto
	public void editQuantita(Prodotto p, int nuovaQuantita) {
		for (Prodotto prodottoDaModificare : listaProdotti) {
			if (prodottoDaModificare.getCodice().equals(p.getCodice())) {
				prodottoDaModificare.setQuantita(nuovaQuantita);
				System.out.print("Prodotto con codice " + prodottoDaModificare.getCodice() + " modificato con successo\n");
				return;
			}
		}
	}

	/**
	 * Visualizza l'elenco dei prodotti con tutte le loro informazioni.
	 */
	// Visualizzazione dell'elenco dei prodotti
	public void viewProdotti() {
		for (Prodotto prodotto : listaProdotti) {
			System.out.println("Codice: " + prodotto.getCodice());
			System.out.println("Descrizione: " + prodotto.getDescrizione());
			System.out.println("Quantità disponibile: " + prodotto.getQuantita());
			System.out.println("Prezzo unitario: " + prodotto.getPrezzo());
			if (prodotto instanceof ProdottoAlimentare) {
				ProdottoAlimentare prodottoAlimentare = (ProdottoAlimentare) prodotto;
				System.out.println("Data di scadenza: " + prodottoAlimentare.getDataScadenza() + "\n");
			} else if (prodotto instanceof ProdottoElettronico) {
				ProdottoElettronico prodottoElettrico = (ProdottoElettronico) prodotto;
				System.out.println("Garanzia in mesi: " + prodottoElettrico.getGaranziaMesi() + "\n");
			}
		}
	}

	/**
	 * Rimuove un prodotto dall'elenco dei prodotti in base al codice.
	 * 
	 * @param codice Il codice del prodotto da rimuovere
	 */
	// Rimozione di un prodotto in base al codice
	public void deleteProdotto(String codice) {
		Iterator<Prodotto> iter = listaProdotti.iterator();
		boolean prodottoTrovato = false;
		while (iter.hasNext()) {
			Prodotto prodottoDaEliminare = iter.next();
			if (prodottoDaEliminare.getCodice().equals(codice)) {
				iter.remove();
				System.out.println("Prodotto con codice " + prodottoDaEliminare.getCodice() + " cancellato con successo");
				prodottoTrovato = true;
				return;
			}
		}
		if (!prodottoTrovato) {
			System.out.println("Cancellazione fallita: prodotto con codice " + codice + " non trovata.");
		}
	}

}
