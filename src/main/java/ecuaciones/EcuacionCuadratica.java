package ecuaciones;

public class EcuacionCuadratica {
	private double a;
	private double b;
	private double c;
	private double solucion;
	
	public EcuacionCuadratica(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double primeraSolucion(){
		solucion = (-b+(Math.sqrt(b*b - 4*a*c)) ) / 2*a;
		return solucion;
	}
	
	public double segundaSolucion(){
		solucion = (-b-(Math.sqrt(b*b - 4*a*c)) ) / 2*a;
		return solucion;
	}
}
