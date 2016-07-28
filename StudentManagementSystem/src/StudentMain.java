import java.io.IOException;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		int select=0;

		while(select !=3){
			
		Scanner user_int = new Scanner(System.in); 
		Scanner user_input = new Scanner(System.in);
		String[] NewStudent= null;
		System.out.println("Select an option");
		System.out.println("1: Search for Student Contatc Information");
		System.out.println("2: Add Student Contact Information");
		System.out.println("3: Exit");
		 select=user_int.nextInt( );
		
		switch (select){
		case 1:
			System.out.println("EnterStudent's Full Name");
			String ContactInput = user_input.nextLine( );
			String NewStudentName= ContactInput;
			System.out.println("Enter Student's ID Number");
			ContactInput = user_input.nextLine( );
			String NewStudentID= ContactInput;
			System.out.println("Enter Student's Phone Number");
			ContactInput = user_input.nextLine( );
			String NewStudentPhone= ContactInput;
			System.out.println("Enter Student's Email");
			ContactInput = user_input.nextLine( );
			String NewStudentEmail= ContactInput;
			AddStudent student1 = new AddStudent(NewStudentName,NewStudentID,NewStudentPhone,NewStudentEmail);
			student1.addcontact();	
			break;
		case 2:
		String file_name = "data/Studentinfo.txt";
		
		// Reading from System.in
		System.out.println("Enter Student's Name: "); 
		String StudentsName = user_input.nextLine( );
		//System.out.println(StudentsName);
		String[] studentNameSplit = StudentsName.split("\\s+");
		try{
			ReadFile file = new ReadFile(file_name);
			String[] aryLines = file.OpenFile();
			int i;
			int s;
			int NameFound=0;
			int matches =0;
			for ( i=0; i< aryLines.length; i++) {
				String[] studentContact = aryLines[i].split(", ");
				for (s=0; s< studentNameSplit.length; s++){
					//System.out.println(aryLines[i]);
					
				if(aryLines[i].indexOf(studentNameSplit[s]) != -1){
					if(studentContact[0].indexOf(studentNameSplit[s]) != -1){
						NameFound =1;
					}
					
				}
				else{
					NameFound=2;
					
					s= studentNameSplit.length;
					
				}
				}
				
				if(NameFound ==1){
					matches++;
					System.out.println( "--------------------------------");
					System.out.println("Student Name: "+studentContact[0]);
					System.out.println("Student ID: "+studentContact[1]);
					System.out.println("Student Contact: "+studentContact[2]);
					System.out.println("Student Email: "+studentContact[3]);
					System.out.println( "--------------------------------");
					}
				
				
					
				
			}
			if(matches==0){
				System.out.println("No Match");
				}
			else{
				System.out.println("Number of Matches: "+matches);
			}
			
			}
		catch (IOException e){
			System.out.println( e.getMessage());
		}
		break;
		case 3:
			break;
		}
	}
}
}