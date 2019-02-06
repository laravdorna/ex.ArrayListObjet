/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg11_arraylistobxeto;

import java.util.ArrayList;
import java.util.Iterator;
import utilidades.PedirDatos;

/**
 *
 * @author lvazquezdorna
 */
public class Metodos {

    public void engadir(ArrayList<Alumno> list) {
        //Alumno al = crearAlumno();
        list.add(crearAlumnoDos());
    }

    public void engadirDos(ArrayList<Alumno> list) {
        list.add(new Alumno(PedirDatos.cadena("nombre: "),
                PedirDatos.cadena("dni: "), PedirDatos.entero("nota: ")));
    }

    public Alumno crearAlumno() {
        String n, dni;
        int not;
        n = PedirDatos.cadena("nombre: ");
        dni = PedirDatos.cadena("dni: ");
        not = PedirDatos.entero("nota: ");

        Alumno al = new Alumno(n, dni, not);
        return al;
    }

    public Alumno crearAlumnoDos() {

        Alumno al = new Alumno(PedirDatos.cadena("nombre: "),
                PedirDatos.cadena("dni: "), PedirDatos.entero("nota: "));
        return al;
    }

    public void ver(ArrayList<Alumno> list) {
        //foreach
        for (Alumno al : list) {
            //al.toString();
            System.out.println(al);
        }
    }

    public void verIterator(ArrayList<Alumno> list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void borrarPosicion(Integer pos, ArrayList<Alumno> list) {
        list.remove(pos - 1);
    }

    public void borrarDni(String dni, ArrayList<Alumno> list) {
        for (Alumno al : list) {
            if (dni.equalsIgnoreCase(al.getDni())) {
                list.remove(al);
            }
        }
    }

    public void borrarDniIteration(String dni, ArrayList<Alumno> list) {
       Alumno al = new Alumno();
       Iterator it = list.iterator();

        while (it.hasNext()) {
            al = (Alumno) it.next();
            if (dni.equalsIgnoreCase(al.getDni())) {
                list.remove(al);
            }
        }
    }
}
