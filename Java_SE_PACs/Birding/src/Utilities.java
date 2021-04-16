import java.util.ArrayList;
import java.util.Scanner;

public class Utilities {
	
	    // ----------- //
	   //             //
	  //   Methods   //
	 //             //
	// ----------- //
	
	//   Ask to the user the question passed by String   //
	//   And it returns the user's response.   //
	public static String ask(Scanner input, String quest) {
		//To-Do
		System.out.println("Ask");
		return input.nextLine();
	}
	
	    // -------------------- //
	   //                      //
	  //   Methods for User   //
	 //                      //
	// -------------------- //

	public static void help() {
		//Unknown command for add: Test
		System.out.println("All the commands:\n\n"
				+"Add\t\t -> Add a new Bird.\n"
				+"Observation\t -> Add an observation for an existent Bird.\n"
				+"Show\t\t -> Show an specific Bird.\n"
				+"Stadistics\t -> Show a list of information about all the birds.\n"
				+"Help\t\t -> Command for know all the commands.\n"
				+"Quit\t\t -> Exit from the program.\n");
	}
	
	
	    // ---------------------------- //
	   //                              //
	  //   Database already created   //
	 //                              //
	// ---------------------------- //
	
	
	//   Database with birds   //
	public static BirdDatabase databaseCreated(String nameOfDatabase) {
		ArrayList<Bird> birds = new ArrayList<Bird>();
		//Common raven - 1st bird - Cuervo grande
		//Latin name:
		//Corvus corax
		ArrayList<Observation> raven = new ArrayList <Observation>();
		raven.add(new Observation(1, "Romania - Neamț")); //Observer Ciubotariu Alexandru-Ionuț
		raven.add(new Observation(1, "Spain - Montemayor")); //Observer Javier Álvarez González
		raven.add(new Observation(2, "Spain - Córdoba")); //Observer Fernando Díaz Fernandez
		raven.add(new Observation(1, "Spain - Camarles - flying")); //Observer Harold Wijts
		//Little bustard - 2nd bird - Sisón común
		//Latin name:
		//Tetrax tetrax
		ArrayList<Observation> bustard = new ArrayList <Observation>();
		bustard.add(new Observation(1, "Spain - Cabanillas del Campo - adult, singing, seen and heard")); //Observer Paco Bustamante
		bustard.add(new Observation(1, "Spain - Cabanillas del Campo - moving southwest")); //Observer Paco Bustamante
		bustard.add(new Observation(3, "Spain - Cabanillas del Campo - moving southeast")); //Observer Paco Bustamante
		bustard.add(new Observation(1, "Spain - Cabanillas del Campo - singing, seen and heard")); //Observer Paco Bustamante
		bustard.add(new Observation(2, "Spain - Alcázar de San Juan")); //Observer Carlos Lázaro
		//Oriental stork - 3rd bird - Cigüeña oriental
		//Latin name:
		//Ciconia boyciana
		ArrayList<Observation> stork = new ArrayList <Observation>();
		stork.add(new Observation(12, "China - Hong Kong - Mai Po Nature Reserve - seen")); //Observer Bart De Schutter
		stork.add(new Observation(1, "China - Hong Kong - Mai Po Nature Reserve - flying, seen")); //Observer Bart De Schutter
		stork.add(new Observation(2, "China - Hong Kong - Mai Po Nature Reserve - seen")); //Observer Bart De Schutter
		//Rose-ringed parakeet - 4th bird - Cotorra de Kramer
		//Latin name:
		//Psittacula krameri
		ArrayList<Observation> parakeet = new ArrayList <Observation>();
		parakeet.add(new Observation(1, "France - Ville-d'Avray - call, hear")); //Observer Solenn C
		parakeet.add(new Observation(3, "France - Meudon - flying, seen and hear")); //Observer Solenn C
		parakeet.add(new Observation(1, "France - Bois de Clamart - Forêt Domaniale - call, hear")); //Observer Solenn C
		parakeet.add(new Observation(2, "France - Meudon - singing, hear")); //Observer Solenn C
		parakeet.add(new Observation(1, "France - Meudon - flying, hear")); //Observer Solenn C
		parakeet.add(new Observation(1, "Spain - Ciudad de Sevilla - ♂︎ adult, flying")); //Observer Jose L. Tella
		parakeet.add(new Observation(1, "France - Clichy - flying, hear")); //Observer Solenn C
		parakeet.add(new Observation(1, "Spain - Cádiz - Parque Genovés - seen and hear")); //Observer Carmela Quijano
		parakeet.add(new Observation(1, "Spain - Loma del Acebuchal")); //Observer Fco. Javier Salcedo Ortiz
		parakeet.add(new Observation(1, "Spain - Campus Pablo de Olavide - hear")); //Observer Pedro Romero Vidal
		
		//Add the birds to database
		birds.add(new Bird("Common raven", "Corvus corax", raven));
		birds.add(new Bird("Little bustard", "Tetrax tetrax", bustard));
		birds.add(new Bird("Oriental stork", "Ciconia boyciana", stork));
		birds.add(new Bird("Rose-ringed parakeet", "Psittacula krameri", parakeet));

		BirdDatabase databaseOfBirdsForUse = new BirdDatabase(nameOfDatabase, birds);
		return databaseOfBirdsForUse;
	}
	
	
	
	
	
	
	
	
	
	
	    // ----------------- //
	   //                   //
	  //   Print options   //
	 //                   //
	// ----------------- //

	
	//   Print of ArrayList of Object Observation   //
	public static void printOfObservation(ArrayList<Observation> observations) {
		
		System.out.println("\n\nObservations");
		System.out.println("----------------------------------------");
		
		//Loop for every observation of the ArrayList of observations
		for (Observation observation : observations) {
			System.out.print("");
			System.out.println(observation);
		}
		
	}
	
	//   Print of ArrayList of Object Observation allowed in ArrayList of Birds   //
	public static void printOfObservationForDatabaseBird(BirdDatabase database) {

		System.out.println("\n\nObservations of Birds");
		System.out.println("----------------------------------------");
		
		for (Bird bird: database.getBirds()) {
			System.out.println("\n\n" + bird.getLatinName() + ", common name: " + bird.getName() + ":\n");
			if (bird.getObservationCount() > 0) {
				for (Observation observation : bird.getObservations()) {
					System.out.println(observation + "\n");
				}
			}
		}
		
		
	}
	
	//   Print of birds   //
	public static void stadisticsOfBirds(ArrayList<Bird> birds) {
		
		System.out.println("\n\nBirds: ");
		System.out.println("----------------------------------------");
		
		
		for (Bird bird : birds) {
			System.out.println(bird);
		}
		
	}
	
	
	
}
