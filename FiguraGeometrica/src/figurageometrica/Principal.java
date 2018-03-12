/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageometrica;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Principal {
   
    public static void main(String[] args) {
        
        Triangulo miTriangulo=new Triangulo();
        Rectangulo miRectangulo=new Rectangulo();
        Cuadrado miCuadro=new Cuadrado();

        System.out.println("Seleccione el tipo de figura");
        System.out.println("1.Triangulo");
        System.out.println("2.Rectangulo");
        System.out.println("3.Cuadrado");
        
        Scanner myScann=new Scanner(System.in);
        switch(myScann.nextInt()){
            case 1: 
                System.out.println("Que desea calcular:");
                System.out.println("1.Area");
                System.out.println("2.perimetro");
               
                        switch(myScann.nextInt()){
                            case 1:
                                    System.out.println("Digite base");
                                    miTriangulo.setBase(myScann.nextDouble());
                                    System.out.println("Digite Altura");
                                    miTriangulo.setH(myScann.nextDouble());
                                    System.out.println("El area del triangulo es: ");
                                    System.out.println(miTriangulo.calcularArea());
                            case 2: 
                                System.out.println("Digite lado A");
                                    miTriangulo.setLadoA(myScann.nextDouble());
                                    System.out.println("Lado B");
                                    miTriangulo.setLadoB(myScann.nextDouble());
                                    System.out.println("Digite base");
                                    miTriangulo.setBase(myScann.nextDouble());
                                    
                                    System.out.println("El perimetro del triangulo es: ");
                                    System.out.println(miTriangulo.CalcularPerimetro());
                        }                

               
        
            case 2:
                System.out.println("Digite base");
                miRectangulo.setBase(myScann.nextDouble());
                System.out.println("Digite Altura");
                System.out.println("El area del rectangulo es: ");
                miRectangulo.setAltura(myScann.nextDouble());
                
               
                System.out.println(miRectangulo.calcularArea());
            case 3:
                System.out.println("Digite el lado del cuadrado");
                miCuadro.setL(myScann.nextDouble());
                System.out.println("El area del cuadrado es: ");
                System.out.println(miCuadro.calcularArea());
                
                
                
        }
        
        
        
         }

}
}
