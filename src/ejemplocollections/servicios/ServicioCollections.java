/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplocollections.servicios;

import ejemplocollections.EjemploCollections;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioCollections {
  private final Scanner leer;
  private ArrayList<String> mascotas;

    public ServicioCollections() {
        this.mascotas = new ArrayList();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

  
 public EjemploCollections crearMascota(){
     System.out.println("Introducir nombre");
     String nombre=leer.next();
     System.out.println("Introducir apodo");
     String apodo=leer.next();
     System.out.println("Introducir tipo");
     String tipo=leer.next();
     
     EjemploCollections m = nombre +""+  apodo+""+ tipo);
   
     return m;
     // o return new Mascota(nombre, apodo, tipo);
 }     
}
