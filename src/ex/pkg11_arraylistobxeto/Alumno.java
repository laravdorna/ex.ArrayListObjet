/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg11_arraylistobxeto;

import java.util.Objects;

/**
 *
 * @author lvazquezdorna
 */
public class Alumno implements Comparable {

    //atributos
    private String nome;
    private String dni;
    private int nota;

    public Alumno() {
    }

    public Alumno(String nome, String dni, int nota) {
        this.nome = nome;
        this.dni = dni;
        this.nota = nota;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nome=" + nome + ", dni=" + dni + ", nota=" + nota + '}';
    }
//insert code y aparece hashcode y equals
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Object t) {
        Alumno al = (Alumno) t;
        if (this.nome.compareTo(al.nome) > 0) {
            return 1;
        } else if (this.nome.compareTo(al.nome) < 0) {
            return -1;
        } else {
         return 0;   
        }
    }

}
