public class Main {
    public static void main(String[] args) {

	//Menu m = new Menu();
	//m.start();
        


















PcLab pcLab1 = new PcLab("OOP Lab", 10, "Ali Raza", "Muhammad Danish");

        pcLab1.addPc(123, "Core i7", "16 GB", "512 SSD", "HP", true);
        pcLab1.addPc(124, "Core i7", "16 GB", "512 SSD", "HP", true);

       // System.out.println(pcLab);


	
	
		Pc pc = new Pc(124, "Core i7", "16 GB", "512 SSD", "HP", true);
	//cs.getLabs()[0].getPcList()[0]=pc;

	//System.out.println(cs.getLabs()[0].getPcList()[0]);

	
	//System.out.println(cs);

	 PcLab lab2 = new PcLab("PF Lab", 10, "Ali Ahmad", "Talha Iqbal");
	lab2.addPc(124, "Core i7", "16 GB", "512 SSD", "HP", true);
	
	Department cs = new Department("Computer Science", "Ali Attah", 10);
        cs.addNewLab(lab2);

        Department it = new Department("Information Technology", "Fazal", 8);
        it.addNewLab(pcLab1);

        Campus mainCampus = new Campus("Main Campus","123","Defence road Lahore", "Saad", 2);
        mainCampus.addNewDepartment(cs);
        mainCampus.addNewDepartment(it);

        University myUniversity = new University("Comsats University", 1);
        myUniversity.addNewCampus(mainCampus);

	//System.out.println(myUniversity);

	myUniversity.getCampus()[0].getDepartments()[0].getLabs()[0] = new PcLab("Physics Lab", 10, "faizan", " Danish");
	//System.out.println(myUniversity.getCampus()[0].getDepartments()[0].getLabs()[0]); 

	Pc p2 = (Pc)pc.clone();
	//System.out.println("hello"+p2);

	PcLab lab3 = pcLab1.clone();
System.out.println("hello"+lab3);
System.out.println("hello"+pcLab1);

	
    }
}
