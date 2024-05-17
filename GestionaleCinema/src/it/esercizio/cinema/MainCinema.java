package it.esercizio.cinema;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * La classe MainCinema rappresenta la classe main del sistema di prenotazione
 * in un cinema.
 * 
 * @author Emanuele Buemi
 * @version 1.0
 */
public class MainCinema {

	public static void main(String[] args) {
		OperazioniPrenotazioni op = new OperazioniPrenotazioni();

		// Formatto la data
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

		// Creazione e aggiunta delle prenotazioni con date specifiche
		try {
			PrenotazioneSingola ps1 = new PrenotazioneSingola(1, "Jannik Sinner", formatter.parse("20/05/2021"), 1);
			PrenotazioneSingola ps2 = new PrenotazioneSingola(2, "Matteo Arnaldi", formatter.parse("04/05/2019"), 2);
			PrenotazioneGruppo pg1 = new PrenotazioneGruppo(3, "Lorenzo Musetti", formatter.parse("10/05/2021"), 8, 4);
			PrenotazioneGruppo pg2 = new PrenotazioneGruppo(4, "Novak Djokovic", formatter.parse("22/03/2020"), 3, 1);
			PrenotazioneGruppo pg3 = new PrenotazioneGruppo(5, "Roger Federer", formatter.parse("28/05/2022"), 6, 3);
			PrenotazioneGruppo pg4 = new PrenotazioneGruppo(6, "Rafa Nadal", formatter.parse("25/05/2022"), 7, 9);

			PrenotazioneSingola ps3 = new PrenotazioneSingola(1, "Matteo Berrettini", formatter.parse("04/05/2019"), 2);

			op.addPrenotazione(ps1);
			op.addPrenotazione(ps2);
			op.addPrenotazione(pg1);
			op.addPrenotazione(pg2);
			op.addPrenotazione(pg3);
			op.addPrenotazione(pg4);

			op.addPrenotazione(ps3); // Id già presente

		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("");

		// Cancella una prenotazione
		op.deletePrenotazione(1);
		op.deletePrenotazione(7); // Id inesistente

		System.out.println("");

		// Visualizza tutte le prenotazioni per una data specifica
		try {
			Date dataPrenotazione = formatter.parse("22/03/2020");
			op.viewPrenotazioni(dataPrenotazione);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
