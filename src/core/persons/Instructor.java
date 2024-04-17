/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.persons;

import core.courses.Curso;
import java.util.ArrayList;

/**
 *
 * @author Fla_Borja_Cantillo
 */
public class Instructor extends Persona {

    private ArrayList<Curso> cursos;

    public Instructor(String nombre, String cedula, String telefono, String email) {
        super(nombre, cedula, telefono, email);
        this.cursos = new ArrayList<>();
    }
    
    public boolean addCurso(Curso curso){
        this.cursos.add(curso);
        return true;
    }
    
    public ArrayList<Curso> getCursos() {
        return cursos;
    }

}
