class Campus{

	private String campusName;
	private String campusCode;
	private String camLocation;
	private String camDirector;
	private Department departmentList[];
	private int counter = 0;	

	
	public Campus(String name , String code , String location , String director , int counter){
		this.campusName = name;
		this.campusCode = code;
		this.camLocation = location;
		this.camDirector = director;
		this.departmentList = new Department[counter];
	}


	public void setCampusName(String name){
		this.campusName = name;
	}
	public String getCampusName(){
		return campusName;
	}


	public void setCampusCode(String code){
		this.campusCode = code;
	}
	public String getCampusCode(){
		return campusCode;
	}



	public void setCampusLocation(String location){
		this.camLocation = location;
	}
	public String getCampusLocation(){
		return camLocation;
	}


	public void setCampusDiector(String director){
		this.camDirector = director;
	}
	public String getCampusDirector(){
		return camDirector;
	}



	public void addNewDepartment(Department department){
		departmentList[counter++] = department;
	}

	public Department[] getDepartments(){
		return departmentList;
	}

	public void displayDepartmentName(){
		System.out.println();
		
		for (int i = 0 ; i<departmentList.length ; i++){
			if (departmentList[i] != null) {
				System.out.printf("%d: ",i);
            			System.out.println(getDepartments()[i].getDName());
        		}
		}
	}



	@Override
	public boolean equals(Object o){

		Campus c = (Campus)o;
		return this.campusName.equals(c.campusName) ;

	}


	@Override
    	public String toString() {
        	StringBuilder campusDetails = new StringBuilder("\n\nCampus's Details\n");
        		for (int i = 0; i < counter; i++) {
            		campusDetails.append("\n").append(departmentList[i]);
        		}
        	return String.format("Campus Name: %s\nCampus Location: %s\nCampus Director: %s",campusName, camLocation, camDirector) + campusDetails;
    	}

}