
public class Trabajador extends Persona{
	int numeroHorasExtraDiurna;
	int numeroHorasExtraNocturna;
	
	double VHED = 5200;
	double VHEN = 8300;
	
	
	public Trabajador(String cedula, String nombre, 
			double salarioBase, int hed, int hen) {
		super(cedula, nombre, salarioBase);
		this.numeroHorasExtraDiurna = hed;
		this.numeroHorasExtraNocturna = hen;	
	}
	
	public double sueldoBruto() {
		return salarioBasico + 
				numeroHorasExtraDiurna * VHED +
				numeroHorasExtraNocturna * VHEN;
	}
}