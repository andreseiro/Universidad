
public class Empleado extends Persona {
	double bonificacion;
		
		
	public Empleado(String cedula, String nombre, double bonificacion, 
			double salarioBase) {
		super(cedula, nombre, salarioBase);
		this.bonificacion = bonificacion;
		
	}
	
	public double sueldoBruto() {
		return this.salarioBasico + this.bonificacion;
	}
}
