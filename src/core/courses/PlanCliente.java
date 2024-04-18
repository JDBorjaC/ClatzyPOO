/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.courses;

import core.persons.Cliente;
import java.time.LocalDate;

/**
 *
 * @author Fla_Borja_Cantillo
 */
public class PlanCliente extends Producto{
    private Cliente cliente;
    private Plan plan;

    public PlanCliente(Cliente cliente, Plan plan, LocalDate fechaFin) {
        super(plan.getId(), plan.getNombre(), plan.getFechaInicio(), plan.getValor());
        this.cliente = cliente;
        this.plan = plan;
        plan.addPlan(this);
        this.fechaFin = fechaFin;
        this.estadoActivo = true;
    }
    
    

    public Cliente getCliente() {
        return cliente;
    }

    public Plan getPlan() {
        return plan;
    }
    
}
