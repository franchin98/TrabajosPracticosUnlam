package tp10;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Juegos {

    public static void main(String[] args) {
	byte tableroSudoku[][] = new byte[9][9];
	byte valor = 0;
	int fila = 0, col = 0;
	Sudoku juegoSudoku = new Sudoku(tableroSudoku);

	Scanner leerDatos = new Scanner(System.in);
	do {
	    juegoSudoku.mostrarTablero();
	    System.out.println();

	    do {
		fila = Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA FILA:"));

		if (fila < 1 || fila > 9) {
		    JOptionPane.showMessageDialog(null,
			    "INGRESE UN N�MERO DEL 1 AL 9. \nA CONTINUACI�N, REINGRESE LA FILA.", "FILA INV�LIDA.", 0);
		}

	    } while (fila < 1 || fila > 9);

	    do {
		col = Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA COLUMNA:"));

		if (col < 1 || col > 9) {
		    JOptionPane.showMessageDialog(null,
			    "INGRESE UN N�MERO DEL 1 AL 9. \nA CONTINUACI�N, REINGRESE LA COLUMNA.",
			    "COLUMNA INV�LIDA.", 0);
		}

	    } while (col < 1 || col > 9);

	    do {
		valor = Byte.parseByte(JOptionPane.showInputDialog("INGRESE EL VALOR:"));

		if (valor < 1 || valor > 9) {
		    JOptionPane.showMessageDialog(null,
			    "INGRESE UN N�MERO DEL 1 AL 9. \nA CONTINUACI�N, REINGRESE EL VALOR A INGRESAR.",
			    "VALOR INV�LIDA.", 0);
		}

	    } while (valor < 1 || valor > 9);

	    if (juegoSudoku.validar(fila, col, valor)) {
		juegoSudoku.rellenarCelda(fila, col, valor);
	    } else {
		JOptionPane.showMessageDialog(null,
			"NO ES POSIBLE ESCRIBIR ESTE VALOR. RECUERDE LAS REGLAS DEL SUDOKU.", "VALOR INV�LIDO", 0);
	    }

	} while (juegoSudoku.validar() == false);
	leerDatos.close();
	
	
    }

}
