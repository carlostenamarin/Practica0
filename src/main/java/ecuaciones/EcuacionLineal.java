package ecuaciones;

public class EcuacionLineal {
	private double a;
	private double b;
	private double solucion;
	
	public EcuacionLineal(double a, double b){
		this.a = a;
		this.b = b;
	}
	
	public double solucion(){
		if(b>0){
			solucion = -b/a;
			return solucion;			
		}
		return 0;
	}
	
	public double terminoIndependienteCero(){
		return 0;
	}
}
