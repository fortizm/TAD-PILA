package facci.ed.pilas.ejemplo_uno;

//package pilas;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//import java.io.*;
//package pilas;
import java.io.*; //importa libreria de entrada y salida de datos

/**
 * 
 */
public class Pila { //declara la clase pila
    //Longitud maxima de la pila
 public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)); // lee los datos de entrada
 public static final int MAX_LENGTH = 5;// declara el tamaño de la cadena
 public static String Pila[] = new String[MAX_LENGTH];// declara a pila igual a constructor del maximo de la cadena
 public static int cima = -1;// cima de la pila
 

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args)throws IOException{
        // TODO code application logic here
        Menu(); //funcion menu
    }
public static void Menu()throws IOException{
    //salida en pantalla del menu
     System.out.println("\n\n\t\t\t=========Menú Manejo Pila=============");
     System.out.println("\t\t\t=                                    =");
     System.out.println("\t\t\t= 1- Insertar elemento               =");
     System.out.println("\t\t\t= 2- Eliminar elemento               =");
     System.out.println("\t\t\t= 3- Buscar elemento                 =");
     System.out.println("\t\t\t= 4- Imprimir pila                   =");
     System.out.println("\t\t\t= 5- Salir                           =");
     System.out.println("\t\t\t======================================");
     System.out.print("\t\t\tOpcion: ");
     int op = Integer.parseInt(entrada.readLine()); //lee caracter
     Opciones(op);
    }
    public static void Opciones(int op)throws IOException{ //llamada de las librerias
        switch(op){ //case para seleccionar la funcion de la pila
			case 1: Insertar();
			        break;
			case 2: Pop();
			        break;
			case 3: Buscar();
			        break;
			case 4: Imprimir();
			        break;
			case 5: System.exit(0);
			        break;
			default:Menu();
			        break;
	   } //final de case
    }

    public static void Insertar()throws IOException{ //llamada de la libreria io
       System.out.print("\nDigite algo para la pila: ");
       String dato = entrada.readLine(); //caracter de entrada para la entrada
       Crear(dato);
    }

    public static void Crear(String dato)throws IOException{ //llamada de la libreria io
      if ((Pila.length-1)==cima){ //es pila-1 igual a cima?
        System.out.println("Capacidad de la pila al limite\n\n\n");
        Imprimir(); //funcion imprimir
      } else{
           ++cima; //incremento la variable de control cima
            Push(dato);
        }

    }
    
    public static void Push(String dato)throws IOException{ //llamada de la libreria io
      Pila[cima]=dato; //guardo el dato en la posición donde esta cima
      Menu(); //funcion menu
    }
    
    //Impirmir funciona correctamente ?
    public static void Imprimir()throws IOException{ //llamada de la libreria io
      for(int i=Pila.length-1;i>=0;i--){ //for ke agita el tamaño de la cadena
	       System.out.println(Pila[i]);
      } //violaciòn al TAD
      Menu(); //funcion menu
    }
    
    public static void Pop()throws IOException{ //llamada de la libreria io
      if(cima== -1){ //es cima igual a-1?
		  System.out.println("\n\n\nNo se puede eliminar, pila vacía !!!" );
      } else{
              System.out.println("se eliminó" + Pila[cima]);
	      Pila[cima] = null; //fila llena
           
	      --cima;
        }
      Menu(); //funcion menu
    }
    //Buscar funciona correctamente ?
    public static void Buscar()throws IOException{ //llamada de la libreria io
       System.out.println("\n\n\nDigite la cadena a buscar: ");
       String cadena = entrada.readLine();
       
       for(int i=0;i<Pila.length-1;i++){ // for ke agita a la cadena
			if(cadena.equals(Pila[i])){ //es la cadena igual a pila?
				System.out.println("Elemento encontrado,posición "+i);
				break;
		        } else{
		     	       System.out.println("Elemento no encontrado :(");
	                      }
        }
       
	Menu(); //funcion menu
    }
    
}
