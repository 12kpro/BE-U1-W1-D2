import java.util.Arrays;

public class Sim {
	String phone;
	double credits;
	String[] calls;
	
	public Sim(String phone, double credits, String[] calls) {
		this.phone = phone;
		this.credits = credits > 0 ? credits : 0;
		this.calls = calls.length > 0 ? calls : {};
	}
	
	static void printSim(Sim s) {
		System.out.println("Phone Number: " + s.phone +", Credits:" + s.credits + ", Calls: " + Arrays.toString(s.calls));
	}
}
