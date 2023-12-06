/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author maicol
 */
public class ClsOperacion 
{
     public ClsOperacion() {
    }

    public double realizarOperacion(double num1, double num2, String operacion) {

        switch (operacion) {
            case "+":
                return this.sumar(num1, num2);

            case "-":
                return this.restar(num1, num2);

            case "*":
                return this.multiplicar(num1, num2);

            case "/":
                return this.dividir(num1, num2);

            case "p":
                return this.potencia(num1, num2);

            case "r":
                return this.raiz(num1);

            case "%":
                return this.modulo(num1, num2);

        }
        return 0;
    }
    
    public double realizarOperacion(double num1, String operacion) {
    switch (operacion) {
            case "r":
                return this.raiz(num1);

        }
        return 0;
    }

    private double sumar(double num1, double num2) {
        return num1 + num2;
    }

    private double restar(double num1, double num2) {
        return num1 - num2;
    }

    private double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    private double dividir(double num1, double num2) {
        return num1 / num2;
    }
    
     private double modulo(double num1, double num2) {
        return num1 % num2;
    }

    private double potencia(double num1, double num2) {
      // Colocar código acá
      return Math.pow(num1, num2);  //No olvidar modificar el return       
    }

    private double raiz(double num) {
       // Colocar código acá
      return Math.sqrt(num); //No olvidar modificar el return  
    }
}
