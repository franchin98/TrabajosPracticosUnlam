package tp10;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class SistemaDeAsistencias {

    public static void main(String[] args) {
	int nFilas = 0, nEscritorios = 0, opcionElegida = 0;
	boolean escritorios[][];
	char cerrarElAula = 'N';
	Aula aula502;

	Scanner leerDatos = new Scanner(System.in);

	System.out.println("-----------------------------");
	System.out.println("\tAULA 502");
	System.out.println("-----------------------------");

	do {
	    System.out.println();
	    System.out.print("INGRESE LA CANTIDAD DE FILAS DE ESCRITORIOS DENTRO DEL AULA: ");
	    nFilas = leerDatos.nextInt();

	    if (nFilas < 1 || nFilas > 4) {
		JOptionPane.showMessageDialog(null,
			"LA CANTIDAD DE FILAS EN TODAS LAS AULAS ES DE 1 A 4 FILAS.\nREINGRESE EL NÚMERO DE FILAS.",
			"ERROR.", 0);
	    }

	} while (nFilas < 1 || nFilas > 4);

	// reservamos el espacio de filas.
	escritorios = new boolean[nFilas][];

	for (int i = 0; i < escritorios.length; i++) {
	    System.out.println("\n-----------------------");
	    System.out.println("FILA NRO " + (i + 1) + ".");
	    System.out.println("-----------------------");

	    do {
		System.out.println();
		System.out.print("INGRESE LA CANTIDAD DE ESCRITORIOS EN LA FILA: ");
		nEscritorios = leerDatos.nextInt();

		if (nEscritorios < 1 || nEscritorios > 5) {
		    JOptionPane.showMessageDialog(null,
			    "LA CANTIDAD DE ESCRITORIOS EN TODAS LAS AULAS ES DE 1 A 5 ESCRITORIOS.\nREINGRESE EL NÚMERO DE ESCRITORIOS.",
			    "ERROR.", 0);
		}

	    } while (nEscritorios < 1 || nEscritorios > 5);

	    escritorios[i] = new boolean[nEscritorios];

	}

	// instancia del objeto aula502, con la matriz de escritorios.
	aula502 = new Aula(escritorios);

	do {
	    System.out.println();
	    aula502.ubicacionesDisponibles();

	    System.out.println();
	    System.out.println("----------------------------------");
	    System.out.println("\tOPCIONES");
	    System.out.println("----------------------------------");

	    System.out.println("\n1. INGRESA UN ALUMNO AL SALÓN.");
	    System.out.println("2. TOMAR ASISTENCIAS.");
	    System.out.println("3. CERRAR EL AULA");

	    System.out.println();

	    System.out.print("INGRESE LA OPCIÓN ELEGIDA: ");
	    opcionElegida = leerDatos.nextInt();

	    switch (opcionElegida) {
	    case 1:
		int fila, escritorio;
		fila = aula502.filaIncompleta();

		if (fila != -1) {
		    escritorio = aula502.escritorioDisponible(fila);
		    aula502.ocuparEscritorio(fila, escritorio);

		    System.out.println("\nEL ALUMNO SE PUEDE UBICAR EN LA FILA " + ++fila + ", EN EL ESCRITORIO "
			    + ++escritorio + ".");
		} else {
		    System.out.println("\n----------------------------------------------------");
		    System.out.println("\t¡SIN ESCRITORIOS DISPONBILES!");
		    System.out.println("----------------------------------------------------");
		}

		break;
	    case 2:
		System.out.println("");
		System.out.println("--------------------------------------");
		System.out.println("TOTAL DE ASISTENCIAS: " + aula502.getCantidadAsistencias());
		System.out.println("--------------------------------------");
		break;
	    case 3:
		System.out.print("¿DESEA CERRAR EL AULA?: ");
		cerrarElAula = leerDatos.next().toUpperCase().charAt(0);

		break;
	    }
	    

	} while ( (opcionElegida >= 1 && opcionElegida <= 3)  && cerrarElAula == 'N');

	leerDatos.close();

    }

}
