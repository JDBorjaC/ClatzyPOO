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
public class ProductoCliente extends Producto{
    private boolean estadoAprobado;
    private int nivelAvance;
    private Cliente cliente;
    private Curso curso;
    
    public ProductoCliente(Curso curso, float valor, LocalDate fechaInicio, Cliente cliente){
        super(curso.getId(), curso.getNombre(), fechaInicio, valor);
        this.curso= curso;
        this.cliente=cliente;
        this.estadoAprobado=true;
        this.nivelAvance=0;
        cliente.addProducto(this);
    }
    
    public boolean isEstadoAprobado() {
        return estadoAprobado;
    }

    public int getNivelAvance() {
        return nivelAvance;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Curso getCurso() {
        return curso;
    }
    
}
