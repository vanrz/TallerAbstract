/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageometrica;

/**
 *
 * @author Estudiantes
 */
public class Cuadrado extends FiguraGeometrica {
   double l;
 
    @Override
    double calcularArea() {
     
        
        return l*l;
         
        
        
    }

    @Override
    double CalcularPerimetro() {
        
            return 4*l;
            
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    
    
}
