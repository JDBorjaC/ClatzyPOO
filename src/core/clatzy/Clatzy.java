/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.clatzy;

import core.courses.Curso;
import core.courses.Plan;
import core.persons.Cliente;
import core.persons.Instructor;
import java.util.ArrayList;

public class Clatzy {
    private ArrayList<Cliente> clientes;
    private ArrayList<Instructor> instructores;
    private ArrayList<Curso> cursos;
    private ArrayList<Plan> planes;

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Instructor> getInstructores() {
        return instructores;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public ArrayList<Plan> getPlanes() {
        return planes;
    }
    
    
}
