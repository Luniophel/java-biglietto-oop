package jana60;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Biglietteria {
	
	//Ho dimenticato di committare, chiedo scusa.. mi ero immerso nel testare alcune cose

	public static void main(String[] args) {
		
		//Dichiarazione delle classi che verranno utilizzate
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.00€");
		
		System.out.println("Grazie per aver scelto Generation Rails per il vostro viaggio!");
		
		//Inizializzazione del biglietto
		Biglietto ticket = new Biglietto();
		
		//Richiesta dell'età dell'utente
		System.out.print("Prego, inserire l'età dell'utente che vuole acquistare il biglietto: ");
		ticket.setPassengerAge(Float.parseFloat(scan.nextLine()));
		
		//Richiesta della lunghezza del tragitto
		System.out.print("\nInserire la lunghezza del tragitto: ");
		ticket.setTripKm(Float.parseFloat(scan.nextLine()));
		
		//Stampa del prezzo calcolato
		System.out.print("Questo è il prezzo per il biglietto selezionato: " + df.format(ticket.calcTicketPrice()));
		
		
		scan.close();
		
	}

}
