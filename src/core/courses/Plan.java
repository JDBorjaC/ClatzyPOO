
package core.courses;

import java.util.ArrayList;

public class Plan extends Producto{
    private float valorMaximoCurso;
    private ArrayList<PlanCliente> planes;

    public float getValorMaximoCurso() {
        return valorMaximoCurso;
    }

    public ArrayList<PlanCliente> getPlanes() {
        return planes;
    }
    
    
}
