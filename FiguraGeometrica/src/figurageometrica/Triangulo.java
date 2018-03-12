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
public class Triangulo extends FiguraGeometrica {
    
    private double base;
    private double h;
    private double ladoA=0;
    private double ladoB=0;

    @Override
    double calcularArea() {
       
        return (base*h)/2;
        
    }

   

    @Override
    double CalcularPerimetro() {
        
     
        return ladoA+ladoB+base;
        
        
    }
    
     public double getBase() {
        return base;
    }

    public void setBase(double  base) {
        this.base = base;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }


    
    
    
}
