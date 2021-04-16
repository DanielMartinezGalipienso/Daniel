
public class Observation {
	
	//Attributes
	private int numberOfBirdsSeen;
	private String observationDetails;
	
	//Constructor
	public Observation() {}
	public Observation(int numberOfBirdsSeen) {
		this.numberOfBirdsSeen = numberOfBirdsSeen;
	}
	public Observation(int numberOfBirdsSeen, String observationDetails) {
		this.numberOfBirdsSeen = numberOfBirdsSeen;
		this.observationDetails = observationDetails;
	}
	
	//Method - Utilities

	//ToDo-
	/*
	public String getAllObservations(ArrayList<Observation>) {
		String listOfObservations = new String();
		int i = 0;
		while (i < observations.size()) {
			listOfObservations += observations;
		}
		return listOfObservations;
		//return observations;
	}
	*/
	
	
	
	@Override
	public String toString() {
		return numberOfBirdsSeen + ": " + getObservationDetails();
	}
	public int getNumberOfBirdsSeen() {
		return numberOfBirdsSeen;
	}
	public void setNumberOfBirdsInObservation(int numberOfBirdsSeen) {
		this.numberOfBirdsSeen = numberOfBirdsSeen;
	}
	public String getObservationDetails() {
		if(!(observationDetails==null)) {
			return observationDetails;
		}else {
			return "Without details from the location";
		}
	}
	public void setObservationDetails(String observationDetails) {
		this.observationDetails = observationDetails;
	}

	
}
