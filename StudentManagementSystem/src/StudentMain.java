import java.util.Scanner;

public class StudentMain 
{

	public static void main(String[] args) 
	{
		int select=0;


		while(select != 3){

		while(select !=3)
		{

			
		Scanner user_int = new Scanner(System.in); 
		Scanner user_input = new Scanner(System.in);
		
		System.out.println("Select an option");
		System.out.println("1: Add New Student Record");
		System.out.println("2: Search for Student Contact Information");
	
		System.out.println("3: Exit");
		 select=user_int.nextInt( );
		
		 	switch (select)
		 		{
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
		 				SearchContact searchcontact= new SearchContact();
		 				searchcontact.searchName();
		 				System.out.println("Thank You!");
		 				System.out.println( "--------------------------------");
		 				break;
		 			case 3:
		 				System.out.println("GoodBye!");
		 				break;
		 		}
	}
		
}
}
}