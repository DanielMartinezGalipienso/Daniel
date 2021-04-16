import java.util.Scanner;

public class MainApplication {

	public static void main(String[] args) {
		
		Test.testOfAll();
		Scanner scan = new Scanner(System.in);
		
		//We create a Database with data already create for quick handling.
		//They need a name for the Database - for a more agile location of this -
		BirdDatabase dataBase = Utilities.databaseCreated("databaseTest");
		
		while (true) {

			String command = Utilities.ask(scan, "What is your command?\n\t(Help for a view of all commands.)");
		/*
		 * //To-Do - If-Else Replaced for the switch
		 * if(command.equals("Quit")) { System.out.print("Exiting....."); break;
		 * } else if(command.equals("Help")) { Utilities.help(scan, dataBase); } else
		 * if(command.equals("Add")) { add(scan, dataBase); } else
		 * if(command.equals("Observation")) { observation(scan, dataBase); } else
		 * if(command.equals("Show")) { show(scan, dataBase); } else
		 * if(command.equals("Statistics")) { statistics(scan, dataBase); } else {
		 * System.out.println("Unknown command"); }
		 */
		
		
			if(command.equals("Quit")){
				System.out.print("Exiting.....");
				scan.close();
				break;
			}
			
			//To-Do
			switch(command) {
			case "Help": Utilities.help();
				break;
			case "Add": add(scan, dataBase);
				break;
			case "Observation": observationForThisBird(scan, dataBase);
				break;
			case "Show": show(scan, dataBase);
				break;
			case "Statistics": statistics(scan, dataBase);
				break;
			case "Test": System.out.println("Test options not implemented.");
				Test.testOfAll();
				break;
			default:
				System.out.println("Unknown command");
				break;
			}
		  
		  
		  }
		 
		
	}
	
	
	public static void add(Scanner input, BirdDatabase dataBase) {
		System.out.println("What is his Common Name?");
		String commonNameOfBird = input.nextLine();
		
		System.out.println("And his Latin Name?");
		String latinNameOfBird = input.nextLine();
		
		//Create the bird and get the indexOfBird
		System.out.println("Creating the bird " + commonNameOfBird +"...");
		
		int indexOfBird = dataBase.getBirds().size()-1;
		System.out.println("Created successfully.");
		System.out.println("Want to add an observation? (yes / no)");
		
		//To-Do
		//Create a variable for observations
		//To-Do
		//Create an if - else for add a Bird with or without observation
		
		if(input.nextLine().equals("yes")) {
			System.out.println("Now not is abaliable add a comment, try again later.");
			//To-Do Add bird to -> Add an observation for this bird.
			//observation(input, dataBase);
			observationNew(input, dataBase, indexOfBird);
			dataBase.addOneBird(new Bird(commonNameOfBird, latinNameOfBird));
		} else {
			dataBase.addOneBird(new Bird(commonNameOfBird, latinNameOfBird));
		}

		System.out.println("Bird created successfully.");
		return;
		
	}
	
	
	public static void observationNew(Scanner input, BirdDatabase dataBase, int indexOfBird) {
		System.out.print("What is the count of birds? ");
		int observationNumber = input.nextInt();
		input.nextLine();
		System.out.println("Add an detailed location? (yes/no) ");
		String optionFromUser = input.nextLine();
		Observation observationToAdd = new Observation(observationNumber);
		
		if(optionFromUser.equals("yes")) {
			System.out.print("What is the location where is seen this bird? ");
			String locationForBirdObservation = input.nextLine();
			observationToAdd.setObservationDetails(locationForBirdObservation);
		}

		Bird birdToAddObservation = dataBase.getBirds().get(indexOfBird);
		birdToAddObservation.addOneObservation(observationToAdd);
		System.out.println("Observation added");
		return;
		
		
	}
	
	public static void observationForThisBird(Scanner input, BirdDatabase dataBase) {
		int indexOfBird = -1;
		int i = 0;
		//Call Scan for required the latinName of Bird
		System.out.println("What is the Latin name that has the bird?");
		String latinNameOfBird = input.nextLine();
		//Find a bird with the latinName
		while (i < dataBase.getBirds().size()) {
			if(dataBase.getBirds().get(i).getLatinName().equals(latinNameOfBird)) {
				indexOfBird = i;
				System.out.println("The bird " + latinNameOfBird + " has been found."); break;
			}
			i++;
		}
		if (indexOfBird != -1) {
			observationNew(input, dataBase, indexOfBird);
			
		} else {
			//If the bird not have found.
			System.out.println("The bird " + latinNameOfBird + " has not been found.");
		}
		return;
	}
	
	public static void show (Scanner input, BirdDatabase dataBase) {
		//To-Do
		System.out.println("Show");
		if(dataBase.getBirds() == null) {
			System.out.println("Not have any bird.\nTry to add some birds.");
		} else {
			System.out.println(dataBase);
		}
	}
	
	public static void statistics(Scanner input, BirdDatabase dataBase) {
		
		//Statistics of observations
		System.out.println("Stadistics");
		if(dataBase.getBirds() == null) {
			System.out.println("Not have any bird.\nTry to add some birds.");
		} else {
			int i = 0;
			while(i < dataBase.getBirds().size()) {
				Bird bird = dataBase.getBirds().get(i);
				System.out.println(bird.getLatinName() +": observations: " + bird.getObservations().size());
				System.out.println("\tTotal of observations: " +bird.getObservationCount() + "\n");
				i++;
			}
		}
	}
	
	
	
}
