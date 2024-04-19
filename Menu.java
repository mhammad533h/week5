import java.util.Scanner;

public class Menu{

	University myUniversity = new University("Comsats University", 4);

	Scanner input = new Scanner(System.in);


	public void start(){

		int choice;

		System.out.println("\n\n                  University Management System");

		do {		

        	System.out.println("\n1. Add Campus");
        	System.out.println("2. Add Department");
        	System.out.println("3. Add Lab");
		System.out.println("4. Add PC");
        	System.out.println("5. Display University Details");
        	System.out.println("0. Exit");
        	System.out.print("\nEnter your choice: ");		

		choice = input.nextInt();
		input.nextLine();

			switch(choice){
			
				case 1:{
					addCampus();
					break;
				}
				case 2:{
					if(myUniversity.getCampus()[0] != null )
					addDepartment();
					else
					System.out.println("\n!!!Add campus before adding department...");
					break;
				}
				case 3:
					if(myUniversity.getCampus()[0].getDepartments()[0] != null )
					addLab();
					else
					System.out.println("\n!!!Add campus before adding department...");
					break;

				case 4:
					addPc();
					break;

				case 5:
					System.out.println(myUniversity);
					break;

				case 0:
					System.out.println("\nExiting program...\n");
                    			break;

                		default:
                    			System.out.println("Invalid choice. Please try again.");
					break;
			}

		} while(choice != 0);
	
	}

	private void addCampus() {
        	System.out.print("\nEnter Campus Name: ");
        	String name = input.nextLine();

        	System.out.print("Enter Campus Code: ");
        	String code = input.nextLine();

        	System.out.print("Enter Campus Location: ");
        	String location = input.nextLine();

        	System.out.print("Enter Campus Director: ");
        	String director = input.nextLine();

        	System.out.print("Enter Number of Departments: ");
        	int numDepartments = input.nextInt();
        	 

        	Campus campus = new Campus(name, code, location, director, numDepartments);
        	myUniversity.addNewCampus(campus);

        	System.out.println("\nCampus added successfully!");
	}

	private void addDepartment(){
		int camChoice;

			System.out.print("\nEnter Department Name: ");
        		String dName = input.nextLine();

        		System.out.print("Enter Department Head: ");
        		String dHead = input.nextLine();

        		System.out.print("Enter Number of Labs: ");
        		int labsCount = input.nextInt();

			myUniversity.displayCampus();

			System.out.print("\nEnter the Campus to Add Department(0,1,2,3 and 4 to return main menu): ");
			camChoice = input.nextInt();
			input.nextLine();

			switch(camChoice){
			
				case 0:
					myUniversity.getCampus()[0].addNewDepartment(new Department(dName, dHead, labsCount));
					break;

				case 1:
					myUniversity.getCampus()[1].addNewDepartment(new Department(dName, dHead, labsCount));
					break;

				case 2:
					myUniversity.getCampus()[2].addNewDepartment(new Department(dName, dHead, labsCount));
					break;

				case 3:
					myUniversity.getCampus()[3].addNewDepartment(new Department(dName, dHead, labsCount));
					break;

				case 4:
					System.out.print("\nReturning to Main Menu");
					break;

                		default:
                    			System.out.println("Invalid choice. Please try again.");
					break;
			}

        	        System.out.println("\nDepartment added successfully!");
	}


	private void addLab(){
		int camChoice;
		int depChoice;

			myUniversity.displayCampus();

			System.out.print("\nEnter the Campus to Add Department(0,1,2,3 and 4 to return main menu): ");
			camChoice = input.nextInt();
			input.nextLine();

			myUniversity.getCampus()[camChoice].displayDepartmentName();

			System.out.print("\nEnter the Department No. to Add Lab(0,1,2,3...): ");
			depChoice = input.nextInt();
			input.nextLine();			

			System.out.print("\nEnter Lab Name: ");
        		String lName = input.nextLine();

        		System.out.print("Enter Lab Incharge Name: ");
        		String InCharge = input.nextLine();

        		System.out.print("Enter Lab Assistant Name: ");
        		String lAssistant = input.nextLine();

        		System.out.print("Enter Number of PCs: ");
        		int pcCount = input.nextInt();

			switch(camChoice){
			
				case 0:{
					myUniversity.getCampus()[0].getDepartments()[depChoice].addNewLab(new PcLab(lName, pcCount, lAssistant, InCharge));
					break;
				}
				case 1:{
					myUniversity.getCampus()[1].getDepartments()[depChoice].addNewLab(new PcLab(lName, pcCount, lAssistant, InCharge));
					break;
				}
				case 2:{
					myUniversity.getCampus()[2].getDepartments()[depChoice].addNewLab(new PcLab(lName, pcCount, lAssistant, InCharge));
					break;
				}
				case 3:{
					myUniversity.getCampus()[3].getDepartments()[depChoice].addNewLab(new PcLab(lName, pcCount, lAssistant, InCharge));
					break;
				}
				case 4:{
					System.out.print("\nReturning to Main Menu");
					break;
				}
                		default:{
                    			System.out.println("Invalid choice. Please try again.");
					break;
				}
			}

        	        System.out.println("\nLab added successfully!");
	}


	private void addPc(){
		int camChoice;
		int depChoice;
		int labChoice;

			myUniversity.displayCampus();

			System.out.print("\nEnter the Campus to Add Department(0,1,2,3 and 4 to return main menu): ");
			camChoice = input.nextInt();
			input.nextLine();

			myUniversity.getCampus()[camChoice].displayDepartmentName();

			System.out.print("\nEnter the Department No. to Add Lab(0,1,2,3...): ");
			depChoice = input.nextInt();
			input.nextLine();

			myUniversity.getCampus()[camChoice].getDepartments()[depChoice].displayLabName();

			System.out.print("\nEnter the Lab No. to Add PC(0,1,2,3...): ");
			labChoice = input.nextInt();
			input.nextLine();			

			System.out.print("\nEnter Pc Id: ");
        		int id = input.nextInt();
			input.nextLine();

        		System.out.print("Enter Pc CPU: ");
        		String cpu = input.nextLine();

        		System.out.print("Enter Pc Ram: ");
        		String ram = input.nextLine();

        		System.out.print("Enter Pc Storage: ");
        		String storage = input.nextLine();

        		System.out.print("Enter LCD Maker: ");
        		String lcdMaker = input.nextLine();

        		System.out.print("Enter Pc has GPU or Not(True/False): ");
        		boolean hasGpu = input.nextBoolean();


			switch(camChoice){
			
				case 0:{
					myUniversity.getCampus()[0].getDepartments()[depChoice].getLabs()[labChoice].addPc(id, cpu, ram, storage, lcdMaker, hasGpu);
					break;
				}
				case 1:{
					myUniversity.getCampus()[0].getDepartments()[depChoice].getLabs()[labChoice].addPc(id, cpu, ram, storage, lcdMaker, hasGpu);
					break;
				}
				case 2:{
					myUniversity.getCampus()[0].getDepartments()[depChoice].getLabs()[labChoice].addPc(id, cpu, ram, storage, lcdMaker, hasGpu);
					break;
				}
				case 3:{
					myUniversity.getCampus()[0].getDepartments()[depChoice].getLabs()[labChoice].addPc(id, cpu, ram, storage, lcdMaker, hasGpu);
					break;
				}
				case 4:{
					System.out.print("\nReturning to Main Menu");
					break;
				}
                		default:{
                    			System.out.println("Invalid choice. Please try again.");
					break;
				}
			}

        	        System.out.println("\nPc added successfully!");
	}

	
}