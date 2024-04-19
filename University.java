public class University{

	private String universityName;
	private Campus campusList[];
	private int counter = 0;

	
	public University(String name, int counter){

		this.universityName = name;
		this.campusList = new Campus[counter];
	}


	public String getUniversityName(){
		return universityName;
	}
	public void setUniversityName(String name){
		this.universityName = name;
	}


	
	public void addNewCampus(Campus campus){
		campusList[counter++] = campus;
	}
	public Campus[] getCampus(){
		return campusList;
	}
	

	public void displayCampus(){
		System.out.println();
		
		for (int i = 0 ; i<campusList.length ; i++){
			if (campusList[i] != null) {
				System.out.printf("%d: ",i);
            			System.out.println(this.getCampus()[i].getCampusName());
        		}
		}
	}

	@Override
	public boolean equals(Object o){

		University u = (University)o;
		return this.universityName.equals(u.universityName) ;

	}


	@Override
    	public String toString() {
        	StringBuilder uniDetails = new StringBuilder("\n\nUniversity's Details\n");
        		for (int i = 0; i < counter; i++) {
            		uniDetails.append("\n").append(campusList[i]);
        		}
        	return String.format("\nUniversity Name: %s",universityName) + uniDetails;
    	}

	

}