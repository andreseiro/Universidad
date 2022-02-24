
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona juan = new Persona("10880909", "Juan Perez", 1000015);
		System.out.println("El salario de " + juan.nombre + " es: " 
				+ juan.salarioBasico);
		
		Trabajador pedro = new Trabajador("1088909098" , "Pedro Perez", 950000, 60, 10);
		System.out.println("El trabajador " + pedro.nombre + " ganó este mes: " 
				+ pedro.sueldoBruto());

	}

}
