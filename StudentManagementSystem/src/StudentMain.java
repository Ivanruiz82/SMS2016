import java.io.IOException;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		String file_name = "data/Studentinfo.txt";
		try{
			ReadFile file = new ReadFile(file_name);
			String[] aryLines = file.OpenFile();
			int i;
			for ( i=0; i< aryLines.length; i++) {
				//System.out.println(aryLines[i]);
				String[] studentContact = aryLines[i].split(", ");
				System.out.println("Student Name: "+studentContact[0]);
				System.out.println("Student ID: "+studentContact[1]);
				System.out.println("Student Contact: "+studentContact[2]);
				System.out.println("Student Email: "+studentContact[3]);
			}
			
			}
		catch (IOException e){
			System.out.println( e.getMessage());
		}
		}
	}