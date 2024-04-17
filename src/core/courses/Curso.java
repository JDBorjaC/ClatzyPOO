/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.courses;

import core.persons.Instructor;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Fla_Borja_Cantillo
 */
public class Curso extends Producto{
    private ArrayList<Instructor> instructores;
    private ArrayList<ProductoCliente> productosCliente;

    public Curso(int id, String nombre, LocalDate fechaInicio, float valor, Instructor instructor) {
        super(id, nombre, fechaInicio, valor);
        this.instructores = new ArrayList<>();
        this.productosCliente = new ArrayList<>();
        
        this.addInstructor(instructor);
        instructor.addCurso(this);
    }
    
    public boolean addInstructor(Instructor instructor){
        this.instructores.add(instructor);
        return true;
    }
    public ArrayList<Instructor> getInstructores() {
        return instructores;
    }

    public ArrayList<ProductoCliente> getProductosCliente() {
        return productosCliente;
    }
    
}
