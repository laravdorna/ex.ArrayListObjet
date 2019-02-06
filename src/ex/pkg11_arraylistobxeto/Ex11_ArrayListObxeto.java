/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg11_arraylistobxeto;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import utilidades.PedirDatos;

/**
 *
 * @author Lara Vazquez Dorna
 */
public class Ex11_ArrayListObxeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Alumno> lista = new ArrayList<>();
        Metodos obx = new Metodos();
        String opcion;
        
        do {
            opcion = menu();
            switch (opcion) {
                case "a"://engadir a lista
                    obx.engadir(lista);
                    break;
                case "b"://ver lista
                    obx.ver(lista);
                    break;
                case "c"://dar de baja
                    int posicion= PedirDatos.entero("Posicion que desea borrar:");
                    obx.borrarPosicion(posicion, lista);
                    break;
                case "d"://baja por dni
                    String dni = PedirDatos.cadena("dni?:");
                    obx.borrarDni(dni, lista);
                    break;
                case "e":// ordenar collection.sort(lista);
                    Collections.sort(lista);
                    break;
            }
            
        } while (!"salida".equals(opcion));
        
    }
    
    private static String menu() {
        String op = null;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("****MENU SECRETARIA*****\n que desea :");
            System.out.println("a=> engadir alumno");
            System.out.println("b=> ver alumno");
            System.out.println("c=>Borrar por posicion");
            System.out.println("d=> Borrar alumno (introduzca un DNI)");
            System.out.println("e=> Ordenar por orden alfabético del nombre");
            
        } while (!"salir".equals(op));
        return op;
    }
    
}
