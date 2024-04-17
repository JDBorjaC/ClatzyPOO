/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.clatzy;

import core.courses.Curso;
import core.courses.Plan;
import core.persons.Cliente;
import core.persons.Instructor;
import java.time.LocalDate;
import java.util.ArrayList;

public class Clatzy {
    private ArrayList<Cliente> clientes;
    private ArrayList<Instructor> instructores;
    private ArrayList<Curso> cursos;
    private ArrayList<Plan> planes;    

    public Clatzy() {
        this.clientes = new ArrayList<>();
        this.instructores = new ArrayList<>();
        this.cursos = new ArrayList<>();
        this.planes = new ArrayList<>();
    }
    
    public boolean comprarPlan(Cliente cliente, Plan plan, LocalDate fecha){
        if(!cliente.hasAnActivePlan()){
            cliente.addPlan(plan, fecha.plusYears(1));
            System.out.println("El cliente "+cliente.getNombre()+" compro exitosamente un plan "+plan.getNombre());
            return true;
        }
        System.out.println("El cliente "+cliente.getNombre()+" ya tiene un plan activo");
        return false;
    }
    
    public String getClienteMayorIngreso(){
        //TODO
        return "";
    }
    
    public boolean comprarCurso(Cliente cliente, Curso curso, LocalDate date){
        //TODO
        return true;
    }
    
    public boolean comprarCurso(Cliente cliente, Curso curso, LocalDate date, float valor){
        //TODO
        return true;
    }
    
    public boolean addInstructor(String nombre, String cedula, String telefono, String email){
        Instructor instructor = new Instructor(nombre, cedula, telefono, email);
        if(!this.instructores.contains(instructor)){
            this.instructores.add(instructor);
        return true;
        }
        return false;
    }
    
    public boolean addCurso(int id, String nombre, LocalDate date, float valor, Instructor instructor){
        this.cursos.add(new Curso(id, nombre, date, valor, instructor));
        return true;
    }
    
    public boolean addPlan(String nombre, LocalDate date, float valor, float maxValue){
        Plan plan = new Plan(nombre, date, valor, maxValue);
        this.planes.add(plan);
        plan.setId(this.planes.indexOf(plan));
        return true;
    }
    
    public boolean addCliente(String nombre, String cedula, String telefono, String email){
        this.clientes.add(new Cliente(nombre,cedula,telefono,email));
        return true;
    }
    
    public Instructor getInstructor(int index){
        return this.instructores.get(index);
    }
    
    public Cliente getCliente(int index){
        return this.clientes.get(index);
    }
    
    public Plan getPlan(int index){
        return this.planes.get(index);
    }
    
    public Curso getCurso(int index){
        return this.cursos.get(index);
    }
    
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
