package tp10;

public class Aula {
    private boolean escritorios[][];
    private int cantidadAsistencias = 0;

    public Aula(boolean escritorios[][]) {
	this.escritorios = escritorios;
    }

    public void setEscritorios(boolean escritorios[][]) {
	this.escritorios = escritorios;
    }

    public void ocuparEscritorio(int fila, int escritorio) {
	escritorios[fila][escritorio] = true;
	cantidadAsistencias++;
    }

    public int getCantidadAsistencias() {
	return cantidadAsistencias;
    }

    /*
     * Si se encuentra una fila de escritorios incompleta, se devuelve la fila
     * incompleta y a partir de esta, encontrar el escritorio vacío en el método
     * escritorioDisponible().
     */
    public int filaIncompleta() {
	for (int i = 0; i < escritorios.length; i++) {
	    for (int k = 0; k < escritorios[i].length; k++) {
		if (escritorios[i][k] == false) {
		    return i;
		}
	    }
	}
	return -1;
    }

    public int escritorioDisponible(int filaLibre) {
	for (int i = 0; i < escritorios[filaLibre].length; i++) {
	    if (escritorios[filaLibre][i] == false) {
		return i;
	    }
	}
	return -1;
    }

    public void ubicacionesDisponibles() {
	System.out.println("--------------------------------------------");
	System.out.println("\tESTADO DE LOS ESCRITORIOS");
	System.out.println("--------------------------------------------");
	System.out.println();
	int asiento = 0;

	for (int i = 0; i < escritorios.length; i++) {
	    System.out.println("\n----------------- [FILA " + (i + 1) + "] ----------------- ");
	    for (int k = 0; k < escritorios[i].length; k++) {
		if (escritorios[i][k] == false) {
		    System.out.println("- ESCRITORIO " + ++asiento + ": LIBRE.");
		} else {
		    System.out.println("- ESCRITORIO " + ++asiento + ": OCUPADO.");
		}
	    }
	    System.out.println("--------------------------------------------");
	}
    }

}
