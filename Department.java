public class Department {

    private String dName;
    private String dHead;
    private PcLab pcLabs[];
    private int counter = 0;

    public Department(String dName, String dHead, int labsCount) {
        this.dName = dName;
        this.dHead = dHead;
        this.pcLabs = new PcLab[labsCount];
    }

    // Setter methods
    public void setDName(String dName) {
        this.dName = dName;
    }

    public void setDHead(String dHead) {
        this.dHead = dHead;
    }

    // Getter methods
    public String getDName() {
        return dName;
    }

    public String getDHead() {
        return dHead;
    }

    public void addNewLab(PcLab lab) {
        pcLabs[counter++] = lab;
    }

    public PcLab[] getLabs() {
        return pcLabs;
    }

	public void displayLabName(){
		System.out.println();
		
		for (int i = 0 ; i<pcLabs.length ; i++){
			if (pcLabs[i] != null) {
				System.out.printf("%d: ",i);
            			System.out.println(getLabs()[i].getLabName());
        		}
		}
	}


    @Override
	public boolean equals(Object o){

		Department d = (Department)o;
		return this.dName.equals(d.dName) ;

	}

    @Override
    public String toString() {
        StringBuilder departmentDetails = new StringBuilder("\n\nDepartment's Details\n");
        for (int i = 0; i < counter; i++) {
            departmentDetails.append("\n").append(pcLabs[i]);
        }
        return String.format("Department Name: %s\nDepartment Head: %s", dName, dHead) + departmentDetails;
    }
}
