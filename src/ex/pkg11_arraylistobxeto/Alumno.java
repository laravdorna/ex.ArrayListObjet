/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg11_arraylistobxeto;

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
