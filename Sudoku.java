package tp10;

public class Sudoku {
    private byte tablero[][];

    public Sudoku(byte tablero[][]) {
	this.tablero = tablero;
    }

    public void rellenarCelda(int fila, int col, byte valor) {
	// El usuario ingresara números a partir del 1. 
	// Decrementamos el valor para fila y columnas. 
	// El decremento permite obtener valores válidos.
	tablero[--fila][--col] = valor;
    }
    
    //Método que valida si se completo el tablero en su totalidad; 
    public boolean validar() {
	for (int i = 0; i < tablero.length; i++) {
	    for (int k = 0; k < tablero[i].length; k++) {
		if (tablero[i][k] == 0) {
		    return false;
		}
	    }
	}
	return true;
    }
    
    public boolean validar(int fila, int col, byte valor) {
	boolean repiteEnFila = false, repiteEnColumna = false, repiteEnGrupo = false;
	fila--;
	
	col--; //columnas
	
	switch(fila) {
	case 0:
	    if(col == 0 || col == 3 || col == 6) {
		if(tablero[fila+1][col+1] == valor || tablero[fila+1][col+2] == valor) {
		    repiteEnGrupo = true;
		} else if(tablero[fila+2][col+1] == valor || tablero[fila+2][col+2] == valor) {
		    repiteEnGrupo = true;
		}
	    } else if(col == 1 || col == 4 || col == 7) { 
		if(tablero[fila+1][col-1] == valor || tablero[fila+1][col+1] == valor) {
		    repiteEnGrupo = true;
		} else if(tablero[fila+2][col-1] == valor || tablero[fila+2][col+1] == valor) {
		    repiteEnGrupo = true;
		}
	    } else {
		if(tablero[fila+1][col-1] == valor || tablero[fila+1][col-2] == valor) {
		    repiteEnGrupo = true; 
		} else if(tablero[fila+2][col-1] == valor || tablero[fila+2][col-2] == valor) {
		    repiteEnGrupo = true; 
		}
	    }
	    break;
	
	case 1:
	    if(col == 0 || col == 3 || col == 6) {
		if(tablero[fila-1][col+1] == valor || tablero[fila-1][col+2] == valor) {
		    repiteEnGrupo = true;
		} else if(tablero[fila+1][col+1] == valor || tablero[fila+1][col+2] == valor) {
		    repiteEnGrupo = true;
		}
	    } else if(col == 1 || col == 4 || col == 7) {
		if(tablero[fila-1][col+1] == valor || tablero[fila-1][col-1] == valor) {
		    repiteEnGrupo = true;
		} else if(tablero[fila+1][col-1] == valor || tablero[fila+1][col+1] == valor) {
		    repiteEnGrupo = true;
		}
	    } else {
		if(tablero[fila-1][col-1] == valor || tablero[fila-1][col-2] == valor) {
		    repiteEnGrupo = true;
		} else if(tablero[fila+1][col-1] == valor || tablero[fila+1][col-2] == valor) {
		    repiteEnGrupo = true;
		}
	    }
	    break;
	    
	case 2:
	    
	    if(col == 0 || col == 3 || col == 6) {
		if(tablero[fila-1][col+1] == valor || tablero[fila-1][col+2] == valor) {
		    repiteEnGrupo = true; 
		} else if(tablero[fila-2][col+1] == valor || tablero[fila-2][col+2] == valor) {
		    repiteEnGrupo = true; 
		}
	    } else if(col == 1 || col == 4 || col == 7) {
		if(tablero[fila-1][col-1] == valor || tablero[fila-1][col+1] == valor) {
		    repiteEnGrupo = true; 
		} else if(tablero[fila-2][col-1] == valor || tablero[fila-2][col+1] == valor) {
		    repiteEnGrupo = true; 
		}
	    } else {
		if(tablero[fila-1][col-1] == valor || tablero[fila-1][col-2] == valor) {
		    repiteEnGrupo = true;
		} else if(tablero[fila-2][col-1] == valor || tablero[fila-2][col-2] == valor) {
		    repiteEnGrupo = true;
		}
	    }
	    
	    break;
	case 3:
	    
	    if(col == 0 || col == 3 || col == 6) {
		if(tablero[fila+1][col+1] == valor || tablero[fila+1][col+2] == valor) {
		    repiteEnGrupo = true;
		} else if(tablero[fila+2][col+1] == valor || tablero[fila+2][col+2] == valor) {
		    repiteEnGrupo = true;
		}
	    } else if(col == 1 || col == 4 || col == 7) { 
		if(tablero[fila+1][col-1] == valor || tablero[fila+1][col+1] == valor) {
		    repiteEnGrupo = true;
		} else if(tablero[fila+2][col-1] == valor || tablero[fila+2][col+1] == valor) {
		    repiteEnGrupo = true;
		}
	    } else {
		if(tablero[fila+1][col-1] == valor || tablero[fila+1][col-2] == valor) {
		    repiteEnGrupo = true; 
		} else if(tablero[fila+2][col-1] == valor || tablero[fila+2][col-2] == valor) {
		    repiteEnGrupo = true; 
		}
	    }
	    break;
	    
	case 4:
	    
	    if(col == 0 || col == 3 || col == 6) {
		if(tablero[fila-1][col+1] == valor || tablero[fila-1][col+2] == valor) {
		    repiteEnGrupo = true;
		} else if(tablero[fila+1][col+1] == valor || tablero[fila+1][col+2] == valor) {
		    repiteEnGrupo = true;
		}
	    } else if(col == 1 || col == 4 || col == 7) {
		if(tablero[fila-1][col+1] == valor || tablero[fila-1][col-1] == valor) {
		    repiteEnGrupo = true;
		} else if(tablero[fila+1][col-1] == valor || tablero[fila+1][col+1] == valor) {
		    repiteEnGrupo = true;
		}
	    } else {
		if(tablero[fila-1][col-1] == valor || tablero[fila-1][-2] == valor) {
		    repiteEnGrupo = true;
		} else if(tablero[fila+1][col-1] == valor || tablero[fila+1][col-2] == valor) {
		    repiteEnGrupo = true;
		}
	    }
	    
	    break;
	    
	case 5:
	    
	    if(col == 0 || col == 3 || col == 6) {
		if(tablero[fila-1][col+1] == valor || tablero[fila-1][col+2] == valor) {
		    repiteEnGrupo = true; 
		} else if(tablero[fila-2][col+1] == valor || tablero[fila-2][col+2] == valor) {
		    repiteEnGrupo = true; 
		}
	    } else if(col == 1 || col == 4 || col == 7) {
		if(tablero[fila-1][col-1] == valor || tablero[fila-1][col+1] == valor) {
		    repiteEnGrupo = true; 
		} else if(tablero[fila-2][col-1] == valor || tablero[fila-2][col+1] == valor) {
		    repiteEnGrupo = true; 
		}
	    } else {
		if(tablero[fila-1][col-1] == valor || tablero[fila-1][col-2] == valor) {
		    repiteEnGrupo = true;
		} else if(tablero[fila-2][col-1] == valor || tablero[fila-2][col-2] == valor) {
		    repiteEnGrupo = true;
		}
	    }
	    
	    break;
	
	case 6:
	    
	    if(col == 0 || col == 3 || col == 6) {
		if(tablero[fila+1][col+1] == valor || tablero[fila+1][col+2] == valor) {
		    repiteEnGrupo = true;
		} else if(tablero[fila+2][col+1] == valor || tablero[fila+2][col+2] == valor) {
		    repiteEnGrupo = true;
		}
	    } else if(col == 1 || col == 4 || col == 7) { 
		if(tablero[fila+1][col-1] == valor || tablero[fila+1][col+1] == valor) {
		    repiteEnGrupo = true;
		} else if(tablero[fila+2][col-1] == valor || tablero[fila+2][col+1] == valor) {
		    repiteEnGrupo = true;
		}
	    } else {
		if(tablero[fila+1][col-1] == valor || tablero[fila+1][col-2] == valor) {
		    repiteEnGrupo = true; 
		} else if(tablero[fila+2][col-1] == valor || tablero[fila+2][col-2] == valor) {
		    repiteEnGrupo = true; 
		}
	    }
	    break;
	    
	case 7:
	    
	    if(col == 0 || col == 3 || col == 6) {
		if(tablero[fila-1][col+1] == valor || tablero[fila-1][col+2] == valor) {
		    repiteEnGrupo = true;
		} else if(tablero[fila+1][col+1] == valor || tablero[fila+1][col+2] == valor) {
		    repiteEnGrupo = true;
		}
	    } else if(col == 1 || col == 4 || col == 7) {
		if(tablero[fila-1][col+1] == valor || tablero[fila-1][col-1] == valor) {
		    repiteEnGrupo = true;
		} else if(tablero[fila+1][col-1] == valor || tablero[fila+1][col+1] == valor) {
		    repiteEnGrupo = true;
		}
	    } else {
		if(tablero[fila-1][col-1] == valor || tablero[fila-1][col-2] == valor) {
		    repiteEnGrupo = true;
		} else if(tablero[fila+1][col-1] == valor || tablero[fila+1][col-2] == valor) {
		    repiteEnGrupo = true;
		}
	    }
	    
	    break;
	    
	case 8:
	    
	    if(col == 0 || col == 3 || col == 6) {
		if(tablero[fila-1][col+1] == valor || tablero[fila-1][col+2] == valor) {
		    repiteEnGrupo = true; 
		} else if(tablero[fila-2][col+1] == valor || tablero[fila-2][col+2] == valor) {
		    repiteEnGrupo = true; 
		}
	    } else if(col == 1 || col == 4 || col == 7) {
		if(tablero[fila-1][col-1] == valor || tablero[fila-1][col+1] == valor) {
		    repiteEnGrupo = true; 
		} else if(tablero[fila-2][col-1] == valor || tablero[fila-2][col+1] == valor) {
		    repiteEnGrupo = true; 
		}
	    } else {
		if(tablero[fila-1][col-1] == valor || tablero[fila-1][col-2] == valor) {
		    repiteEnGrupo = true;
		} else if(tablero[fila-2][col-1] == valor || tablero[fila-2][col-2] == valor) {
		    repiteEnGrupo = true;
		}
	    }
	    
	    break;
	}
	
	for (int i = 0; i < tablero[fila].length; i++) {
	    if (tablero[fila][i] == valor) {
		repiteEnFila = true;
	    }
	}

	for (int i = 0; i < tablero.length; i++) {
	    if (tablero[i][col] == valor) {
		repiteEnColumna = true;
	    }
	}

	if (repiteEnFila || repiteEnColumna || repiteEnGrupo) {
	    return false;
	}

	return true;
    }

    public void mostrarTablero() {
	for (int i = 0; i < tablero.length; i++) {
	    System.out.print("FILA " + (i + 1) + ". \t");
	    for (int k = 0; k < tablero[i].length; k++) {
		if (tablero[i][k] == 0) {
		    System.out.print("_ ");
		} else {
		    System.out.print(tablero[i][k] + " ");
		}
	    }
	    System.out.println();
	}
    }

}
