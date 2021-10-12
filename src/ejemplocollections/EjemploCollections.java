/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplocollections;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class EjemploCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //ejemplo arrays
     
     String[] nombresArray= new String[5];
     //llenamos el arreglo  
     for (int i = 0; i < nombresArray.length; i++) {
            nombresArray[i]="Chiquito"+(i+1);
               }
     //imprimimos el  arreglo  
     for (String var : nombresArray) {
            System.out.println(var);
        }
     //Collections
     //asi creo el arrayList
     ArrayList<String> nombresArrayList = new ArrayList();
     //asi lleno el arrayList
     nombresArrayList.add("Olguita");
     nombresArrayList.add("Olguita");
     nombresArrayList.add("Olguita");
     // size me devuelve el tamaño de la lista
        System.out.println(nombresArrayList.size());//3
     //para eliminar algun elemento de la lista
     nombresArrayList.remove("Olguita");
     System.out.println(nombresArrayList.size());//2
        // TODO code application logic here
    }
    
}
