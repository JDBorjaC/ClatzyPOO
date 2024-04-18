/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.clatzy;

import core.courses.Curso;
import core.courses.Plan;
import core.courses.PlanCliente;
import core.courses.ProductoCliente;
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
    
    public void listAll(){
        System.out.println("Lista de clientes con sus compras:");
        
        for(Cliente cliente: this.clientes){
            System.out.println("----------------------------------------");
            System.out.println(cliente.getNombre());
            System.out.println("Planes:");
            for(PlanCliente plan: cliente.getPlanes()){
                System.out.println(plan.getNombre()+" "+plan.getFechaInicio()+" "+plan.getValor()+" "+(plan.isEstadoActivo()? "True" : "False"));
            }
            System.out.println("");
            System.out.println("Cursos:");
            for(ProductoCliente producto: cliente.getProductos()){
                System.out.println(producto.getNombre()+" "+producto.getFechaInicio()+" "+producto.getValor()+" "+(producto.isEstadoAprobado()? "True" : "False"));
            }
        }
    }

    public boolean comprarPlan(Cliente cliente, Plan plan, LocalDate fecha) {
        if (cliente.getActivePlan() == null) {
            cliente.addPlan(plan, fecha.plusYears(1));
            System.out.println("El cliente " + cliente.getNombre() + " compro exitosamente un plan " + plan.getNombre());
            return true;
        }
        System.out.println("El cliente " + cliente.getNombre() + " ya tiene un plan activo");
        return false;
    }

    public String getClienteMayorIngreso() {
        String customer = "nadie";
        float mayor = 0;
        for(Cliente cliente: this.clientes){
            float conteo = 0;
            for(ProductoCliente producto: cliente.getProductos()){
                conteo += producto.getValor();
            }
            
            if(conteo > mayor){
                customer = cliente.getNombre();
                mayor = conteo;
            }
        }
        return customer;
    }

    //El cliente Pedro Perez ya habia registrado el curso Introduccion a GIS con PosGIS
    public boolean comprarCurso(Cliente cliente, Curso curso, LocalDate date) {
        if(cliente.alreadyBought(curso)){
            System.out.println("El cliente "+cliente.getNombre()+" ya habia comprado el curso "+curso.getNombre());
            return false;
        }
        if (cliente.getActivePlan() != null) {
            if (curso.getValor() <= cliente.getActivePlan().getPlan().getValorMaximoCurso()) {
                new ProductoCliente(curso, 0, date, cliente);
                System.out.println("El cliente "+cliente.getNombre()+" compro exitosamente el curso "+curso.getNombre());
                return true;
            }

        }
        
        System.out.println("El plan del cliente " + cliente.getNombre() + " no cubre el curso " + curso.getNombre());
        return false;
    }

    public boolean comprarCurso(Cliente cliente, Curso curso, LocalDate date, float valor) {
        
        if(cliente.alreadyBought(curso)){
            System.out.println("El cliente "+cliente.getNombre()+" ya habia comprado el curso "+curso.getNombre());
            return false;
        }
        
        if (cliente.getActivePlan() != null) {
            if (curso.getValor() <= cliente.getActivePlan().getPlan().getValorMaximoCurso()) {
                new ProductoCliente(curso, 0, date, cliente);
                System.out.println("El curso esta incluido en el plan del cliente " + cliente.getNombre() + ", por lo tanto no debe pagar. Se procede a registrar el curso " + curso.getNombre() + " con costo $0");
                return true;
            }

        }
        if (valor == curso.getValor()) {
            new ProductoCliente(curso, curso.getValor(), date, cliente);
            System.out.println("El cliente " + cliente.getNombre() + " compro exitosamente el curso " + curso.getNombre());
            return true;
        }
        System.out.println("El cliente " + cliente.getNombre() + " no pago el valor correcto por el curso " + curso.getNombre());
        return false;
    }

    public boolean addInstructor(String nombre, String cedula, String telefono, String email) {
        Instructor instructor = new Instructor(nombre, cedula, telefono, email);
        if (!this.instructores.contains(instructor)) {
            this.instructores.add(instructor);
            return true;
        }
        return false;
    }

    public boolean addCurso(int id, String nombre, LocalDate date, float valor, Instructor instructor) {
        this.cursos.add(new Curso(id, nombre, date, valor, instructor));
        return true;
    }

    public boolean addPlan(String nombre, LocalDate date, float valor, float maxValue) {
        Plan plan = new Plan(nombre, date, valor, maxValue);
        this.planes.add(plan);
        plan.setId(this.planes.indexOf(plan));
        return true;
    }

    public boolean addCliente(String nombre, String cedula, String telefono, String email) {
        this.clientes.add(new Cliente(nombre, cedula, telefono, email));
        return true;
    }

    public Instructor getInstructor(int index) {
        return this.instructores.get(index);
    }

    public Cliente getCliente(int index) {
        return this.clientes.get(index);
    }

    public Plan getPlan(int index) {
        return this.planes.get(index);
    }

    public Curso getCurso(int index) {
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
