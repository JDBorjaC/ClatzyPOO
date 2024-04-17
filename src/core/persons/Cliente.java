/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.persons;

import core.courses.Curso;
import core.courses.Plan;
import core.courses.PlanCliente;
import core.courses.Producto;
import core.courses.ProductoCliente;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Fla_Borja_Cantillo
 */
public class Cliente extends Persona {

    private ArrayList<PlanCliente> planes;
    private ArrayList<ProductoCliente> productos;

    public Cliente(String nombre, String cedula, String telefono, String email) {
        super(nombre, cedula, telefono, email);
        this.planes = new ArrayList<>();
        this.productos = new ArrayList<>();
    }

    public boolean addPlan(Plan plan, LocalDate date) {
        this.planes.add(new PlanCliente(this, plan, date));
        return true;
    }

    public boolean addProducto(ProductoCliente producto) {
        this.productos.add(producto);
        return true;
    }

    public PlanCliente getActivePlan() {
        for (PlanCliente plan : this.planes) {
            if (plan.isEstadoActivo()) {
                return plan;
            }
        }
        return null;
    }

    public boolean getActiveCurso(Curso curso) {
        for (ProductoCliente producto : this.productos) {
            if (curso == producto.getCurso()) {
                return true;
            }
        }
        return false;
    }

    public PlanCliente getPlan(int index) {
        return this.planes.get(index);
    }

    public ArrayList<PlanCliente> getPlanes() {
        return planes;
    }

    public ArrayList<ProductoCliente> getProductos() {
        return productos;
    }

}
