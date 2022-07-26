package tp10;

import javax.swing.JOptionPane;

public class PruebaCalculadora {
    
    static int factorial(int numero) {
	int resultado = 1;
	int vueltas = 1; 
	do {
	    resultado *= (++vueltas);
	} while(vueltas < numero);
	
	return resultado;
    }

    public static void main(String[] args) {
	
	int numero = Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN NÚMERO PARA CALCULAR SU N° FACTORIAL:")); 
	
	int resultado = factorial(numero);
	
	JOptionPane.showMessageDialog(null, "FACTORIAL DE " + numero + ".\nRESULTADO: " + resultado);
    }

}
