import java.util.Arrays;

public class Exercice_2 {

	public static void main(String[] args) {
		Call[] calls;
		calls = new Call[3];
		
		calls[0]= new Call(300,"+396548759");
		calls[1]= new Call(100,"+396548524");
		calls[2]= new Call(50,"+396548856");
		
		System.out.println(Arrays.asList(calls));
		
		Sim newSim = new Sim("+39345548458",50,calls);
		
		System.out.print( Sim.printSim(newSim));
	}

}
