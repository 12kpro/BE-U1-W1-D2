import java.util.Date;
import java.util.Calendar;

public class Client {
	String id;
	String name;
	String email;
	Date date = Calendar.getInstance().getTime();
	
	public Client(String id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;		
	}
}
