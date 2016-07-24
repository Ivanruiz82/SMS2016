import java.io.IOException;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		String file_name = "C:\\Users/ivan.ruiz/IT7320_FirstAssignment/StudentManagementSystem/Data/test.txt";
		try{
			ReadFile file = new ReadFile(file_name);
			String[] aryLines = file.OpenFile();
			int i;
			for ( i=0; i< aryLines.length; i++) {
				System.out.println(aryLines[i]);
			}
			
			}
		catch (IOException e){
			System.out.println( e.getMessage());
		}
		}
	}