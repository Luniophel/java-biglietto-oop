package jana60;

public class Biglietto {
	//ATTRIBUTES
	//Gli attributi che dovranno essere riempiti dall'utente
	private float tripKm, passengerAge;
	
	//Le tariffe che mi vengono fornite dalla compagnia di treni
	private float pricePerKm = 0.21f;		// 0,21 €/km
	private float childrenDiscount = 0.20f;	// Sconto del 20% per i minorenni
	private float elderDiscount = 0.40f;	// Sconto del 40% per gli over65
	
	//CONSTRUCTORS
	//Costruttore del biglietto
	public Biglietto(float tripKm, int passengerAge){
		
		this.tripKm = tripKm;
		this.passengerAge = passengerAge;
		
	}
	public Biglietto() {}	//Costruttore che permette l'inizializzazione vuota di un biglietto
	
	//SETTERS/GETTERS
	public void setTripKm(float tripKm) {
		
		this.tripKm = tripKm;
	}
	public void setPassengerAge(float passengerAge) {
		
		this.passengerAge = passengerAge;
		
	}
	
	//METHODS
	public float calcTicketPrice(){
		
		//Calcolo del prezzo base utilizzando la lunghezza del percorso inserita dall'utente e la tariffa data dalla compagnia
		float ticketPrice = tripKm * pricePerKm;
		//Applicazione dello sconto per minorenni
		if (passengerAge < 18) {
			ticketPrice -= (ticketPrice * childrenDiscount);
		} 
		//Applicazione dello sconto per over65
		if (passengerAge >= 65) {
			ticketPrice -= (ticketPrice * elderDiscount);
		} 
		return ticketPrice;
		
	}

	
	

}
