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
public class Rectangulo extends FiguraGeometrica{
    double base;
    double altura;
    
    @Override
    double calcularArea() {
        
        return base*altura;
        
        
        
        
    }

    @Override
    double CalcularPerimetro() {
  
        return (2*base)+ (2*altura);
        
        
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
}
