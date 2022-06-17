package jana60;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Biglietteria {
	
	public static void main(String[] args) {
		
		//Dichiarazione delle classi che verranno utilizzate
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.00€");
		
		System.out.println("Grazie per aver scelto Generation Rails per il vostro viaggio!");
		
		boolean again = false;
		int numTicket = 1;
		
		//Ciclo che si ripete ogni volta che l'utente decide di creare un nuovo biglietto
		do {
			
			//Inizializzazione del biglietto
			Biglietto ticket = new Biglietto();
			//Richiesta dell'età dell'utente
			System.out.print("\nBiglietto n°" + numTicket + "\nPrego, inserire l'età dell'utente che vuole acquistare il biglietto: ");
			ticket.setPassengerAge(Float.parseFloat(scan.nextLine()));
			//Richiesta della lunghezza del tragitto
			System.out.print("Inserire la lunghezza del tragitto: ");
			ticket.setTripKm(Float.parseFloat(scan.nextLine()));
			//Stampa del prezzo calcolato
			System.out.println("\nQuesto è il prezzo per il biglietto selezionato: " + df.format(ticket.calcTicketPrice()));
			System.out.println("________________________________");
			System.out.println("Vuoi creare un altro biglietto? Digita 'SI' per continuare, altrimenti premi Invio.");
			if (scan.nextLine().equalsIgnoreCase("SI")) {
				again = true;
				numTicket++;
			} else {
				again = false;
			}
			
		} while (again);
		
		scan.close();
		
	}

}
