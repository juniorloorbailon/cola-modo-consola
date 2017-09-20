paquete de  cola ;

import  java.util.Scanner ;

Todos los derechos reservados
 *
 * @author junior loor
 * /
 clase  pública Cola {

    Todos los derechos reservados
     * @param args los argumentos de la línea de comandos
     * /
   
        
  public  static  void  Menú () {
        Sistema . un cabo . println ( " \ n \ n \ t \ t \ t ========= Menú Manejo Cola ============= " );
        Sistema . un cabo . println ( " \ t \ t \ t = = " );
        Sistema . un cabo . println ( " \ t \ t \ t = 1 - elemento Insertar = " );
        Sistema . un cabo . println ( " \ t \ t \ t = 2 - Eliminar elemento = " );
        Sistema . un cabo . println ( " \ t \ t \ t = 3 Buscar elemento = " );
        Sistema . un cabo . println ( " \ t \ t \ t = 4- Imprimir = " );
        Sistema . un cabo . println ( " \ t \ t \ t = 5 - Imprimir el elemento primer = " );
        Sistema . un cabo . println ( " \ t \ t \ t = 6- Salir = " );
        Sistema . un cabo . println ( " \ t \ t \ t ====================================== " );
        Sistema . un cabo . imprimir ( " \ t \ t \ t Ingrese Opcion: " );
    }
    public  static  void  main ( String [] args ) {
        // TODO codifica la lógica de la aplicación aquí
        
        Nodo  Cola = nulo ;
        Escáner teclado = nuevo  Escáner ( System . In );
        int opcion;
        String dato;
        
        Hacer {
            Menú();
            opcion = teclado . nextInt ();
            switch (opcion) {
			Caso  1 :  Sistema . un cabo . println ( " Escriba el dato para guardar en la cola: " );
                                dato = teclado . nextLine ();
                                dato = teclado . nextLine ();
                                Cola = Nodo . insertarCola ( Cola , dato);
			        romper ;
			caso  2 :  Cola = Nodo . eliminarCola ( Cola );
			        romper ;
                                
                                
			Caso  3 :  Sistema . a cabo . println ( " Escriba el dato a Buscar en la cola: " );
                                dato = teclado . nextLine ();
                                dato = teclado . nextLine ();
                                Nodo . buscarCola ( Cola , dato);
			        romper ;
                                
                                
			caso  4 : Nodo . imprimirCola ( Cola );
			        romper ;
                                
                                
			caso  5 :  Sistema . un cabo . println ( " Se imprimió el primer elemento " );
                                Nodo . imprimirColaInicio ( Cola );
			        mameluco ;
                                
                                
                        caso  6 : 
			        mameluco ;
                            }
        } while (opcion ! = 6 );
        
        
    
    }
}