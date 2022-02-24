/**
 * 
 */

/**
 * @author andreseiro
 * @version 1.0 22/02/2022
 * 
 * <h1>Clase Persona</h1>Define los elementos principales
 * de una persona pertenenciente  a la universidad, se usa
 * a traves de las clases hijas
 *
 */
public class Persona {
	
	//Atributos
	String cedula;
	String nombre;
	double salarioBasico = 0;
	
/**
 * 
 * @param cedulaRecibida
 * @param nombreRecibido
 * @param salarioBasicoRecibido
 */
	public Persona(String cedulaRecibida, 
			String nombreRecibido, double salarioBasicoRecibido ) {
		cedula = cedulaRecibida;
		this.nombre = nombreRecibido;
		this.salarioBasico = salarioBasicoRecibido;		
	}
	

	public double sueldoBruto() {
		return this.salarioBasico;
	}

}
