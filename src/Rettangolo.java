
public class Rettangolo {
	double altezza;
	double larghezza;
	
	public Rettangolo(double altezza, double larghezza) {
		this.altezza = altezza;
		this.larghezza = larghezza;
	}
	double perimetro() {
		return (this.altezza + this.larghezza)*2;
	}
	double area() {
		return this.altezza * this.larghezza;
	}
	static void stampaRettangolo(Rettangolo r) {
		System.out.println("Area: "+ r.area()+", Perimetro:" + r.perimetro());
	}
	static void stampaDueRettangoli(Rettangolo r, Rettangolo r1) {
		double sommaArea = r.area() + r1.area();
		double sommaPerimetro = r.perimetro() + r1.perimetro();
		System.out.println("Somma Area: "+ sommaArea +", Somma Perimetro:" + sommaPerimetro);
	}
}