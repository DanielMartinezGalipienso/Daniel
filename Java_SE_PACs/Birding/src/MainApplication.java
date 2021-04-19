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
			case "Test": Test.testOfAll();
				break;
			default:
				System.out.println("Unknown command");
				break;
			}
		  
		  
		  }
		 
		
	}
	
	
	public static void add(Scanner input, BirdDatabase dataBase) {
		//Call the method ask and obtain the answer write of the user
		String commonNameOfBird = Utilities.ask(input, "What is his Common Name? ");
		String latinNameOfBird = Utilities.ask(input, "And his Latin Name? ");
		
		//Create the bird and get the indexOfBird
		Utilities.answer("Want to add an observation? (yes / no)");
		
		//To-Do
		//Create a variable for observations
		//To-Do
		//Create an if - else for add a Bird with or without observation
		
		if(input.nextLine().equals("yes")) {
			Utilities.answer("Now not is abaliable add a comment, try again later.");
			//To-Do Add bird to -> Add an observation for this bird.
			//observation(input, dataBase);
			Observation observation = observationNew(input);
			dataBase.addOneBird(new Bird(commonNameOfBird, latinNameOfBird, observation));
			

			
			Utilities.answer("Observation added");
		} else {
			dataBase.addOneBird(new Bird(commonNameOfBird, latinNameOfBird));
		}
		

		Utilities.answer("Bird" + commonNameOfBird + "created successfully.");
		
	}
	
	
	public static Observation observationNew(Scanner input) {
		//If use an nextInt for the Scanner, required an nextLine after
		//or this will be skip the next scanner
		
		//System.out.print("What is the count of birds? ");
		//int observationNumber = input.nextInt();
		int observationNumber = Utilities.askInt(input, "What is the count of birds? ");
		input.nextLine();
		Observation observationToAdd = new Observation(observationNumber);
		
		String optionFromUser = Utilities.ask(input, "Add an detailed location? (yes/no) ");
		
		if(optionFromUser.equals("yes")) {
			String locationForBirdObservation = Utilities.ask(input, "What is the location where is seen this bird? ");
			observationToAdd.setObservationDetails(locationForBirdObservation);
		}

		return observationToAdd;
		
		
	}
	
	public static void observationForThisBird(Scanner input, BirdDatabase dataBase) {
		int indexOfBird = -1;
		int i = 0;
		//Call Scan for required the latinName of Bird
		String latinNameOfBird = Utilities.ask(input, "What is the Latin name that has the bird?");
		//Find a bird with the latinName
		while (i < dataBase.getBirds().size()) {
			if(dataBase.getBirds().get(i).getLatinName().equals(latinNameOfBird)) {
				indexOfBird = i;
				Utilities.answer("The bird " + latinNameOfBird + " has been found.");
				break;
			}
			i++;
		}
		if (indexOfBird != -1) {
			Observation observation = observationNew(input);
			dataBase.getBirds().get(indexOfBird).addOneObservation(observation);
			
		} else {
			//If the bird not have found.
			Utilities.answer("The bird " + latinNameOfBird + " has not been found.");
		}
		return;
	}
	
	public static void show (Scanner input, BirdDatabase dataBase) {
		
		//Show all the Birds from the BirdDatabase
		if(dataBase.getBirds() == null) {
			Utilities.answer("Not have any bird.\nTry to add some birds.");
		} else {
			System.out.println(dataBase);
		}
	}
	
	public static void statistics(Scanner input, BirdDatabase dataBase) {
		
		//Statistics of observations
		System.out.println("Statistics");
		if(dataBase.getBirds() == null) {
			Utilities.answer("Not have any bird.\nTry to add some birds.");
		} else {
			int i = 0;
			while(i < dataBase.getBirds().size()) {
				Bird bird = dataBase.getBirds().get(i);
				Utilities.answer(bird.getLatinName() +": observations: " + bird.getObservations().size());
				Utilities.answer("\tTotal of observations: " +bird.allObservationsCount() + "\n");
				i++;
			}
		}
	}
	
	
	
}
