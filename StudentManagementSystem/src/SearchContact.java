import java.io.IOException;
import java.util.Scanner;

public class SearchContact {
	public void searchName(){
		String file_name = "data/Studentinfo.txt";
		Scanner user_input = new Scanner(System.in);
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
				System.out.println( "--------------------------------");
			}
			
			}
		catch (IOException e){
			System.out.println( e.getMessage());
		}
		user_input.close();
	}
}
