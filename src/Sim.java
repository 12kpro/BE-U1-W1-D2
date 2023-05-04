import java.util.Arrays;

public class Sim {
	String phone;
	double credits = 0;
	Call[] calls = new Call[]{};
	
	public Sim(String phone) {
		this.phone = phone;
	}
	public Sim(String phone, double credits) {
		this.phone = phone;
		this. credits = credits;
	}
	public Sim(String phone, double credits, Call[] calls) {
		this.phone = phone;
		this.credits = credits ;
		this.calls = calls;
	}
	
	static String printSim(Sim s) {
		String result = "Phone Number: " + s.phone +",\nCredits:" + s.credits + ", \nCalls:\n";
		for(int i = 0; i < s.calls.length; i++) result += " duration: "+ s.calls[i].duration + ", Phone: " + s.calls[i].phone + "\n";
		return result;
	}
}
