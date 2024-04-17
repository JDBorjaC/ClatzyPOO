/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.courses;

import core.persons.Cliente;

/**
 *
 * @author Fla_Borja_Cantillo
 */
public class ProductoCliente extends Producto{
    private boolean estadoAprobado;
    private int nivelAvance;
    private Cliente cliente;
    private Curso curso;

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
