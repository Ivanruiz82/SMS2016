import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;

public class AddStudent {
	private String studName;
	private String studID;
	private String studPhone;
	private String email;
	
	public AddStudent(String studName, String studID, String studPhone, String email) {
		super();
		this.studName = studName;
		this.studID = studID;
		this.studPhone = studPhone;
		this.email = email;
	}
	

	public void addcontact(){
		String NewFullContract= studName+", "+studID+", "+studPhone+", "+email;
		
	
	try(FileWriter fw = new FileWriter("data/Studentinfo.txt", true);
		    BufferedWriter bw = new BufferedWriter(fw);
		    PrintWriter out = new PrintWriter(bw))
		{
		    out.println(NewFullContract);
		    
		} catch (IOException e) {
		    //exception handling left as an exercise for the reader
		}
}
}