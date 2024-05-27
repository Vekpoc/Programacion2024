
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gerar
 */
public class Operaciones {
    static Scanner reader = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Ingresa que operación vas a realizar: ");
        operacion(reader.nextLine());
    }
    private static void operacion(String input) {
        try {
            switch (input.toLowerCase()) {
                case "suma": {
                    double num0;
                    double num1;
                    System.out.println("Ingresa el primer número a sumar: ");
                    num0 = reader.nextDouble();
                    System.out.println("Ingresa el segundo número a sumar: ");
                    num1 = reader.nextDouble();

                    System.out.println("El resultado de la suma es: " + suma(num0, num1));   
                }
                    break;
                case "resta": {
                    double num0;
                    double num1;
                    System.out.println("Ingresa el primer número a restar: ");
                    num0 = reader.nextDouble();
                    System.out.println("Ingresa el segundo número a restar: ");
                    num1 = reader.nextDouble();

                    System.out.println("El resultado de la suma es: " + resta(num0, num1));
                }
                    break;
                case "division": {
                    double num0;
                    double num1;
                    System.out.println("Ingresa el primer número a dividir: ");
                    num0 = reader.nextDouble();
                    System.out.println("Ingresa el segundo número a dividr: ");
                    num1 = reader.nextDouble();
                    
                    if(division(num0, num1).equals("isM")) {
                        System.out.println("El número '"+num1+"' es mayor al divisor.");
                    } else if(division(num0, num1).equals("is0")) {
                        System.out.println("El divisor '"+num1+"' no puede ser 0.");
                    } else {
                        System.out.println("El resultado de la división es: " + division(num0, num1));
                    }
                }
                    break;
                case "multiplicacion": {
                    double num0;
                    double num1;
                    System.out.println("Ingresa el primer número a multiplicar: ");
                    num0 = reader.nextDouble();
                    System.out.println("Ingresa el segundo número a multiplicar: ");
                    num1 = reader.nextDouble();
                    
                    System.out.println("El resultado de la multiplicación es: " + multiplicacion(num0, num1));
                }
                default:
                    System.out.println("Debes ingresar la operación a realizar (suma, resta, division, multiplicacion).");
            }
        } catch (Exception e) {
            System.out.println("Debes ingresar números no letras ni simbolos.");
        }
    }
    private static String suma(double num, double num2) {
        double res;
        try {
            res = num + num2;
            return ""+res;
        } catch (Exception e) {
            return "Error al realizar la operación.";
        }
    }
    private static String resta(double num, double num2) {
        double res;
        try {
            res = num - num2;
            return ""+res;
        } catch (Exception e) {
            return "Error al realizar la operación.";
        }
    }
    private static String division(double num, double num2) {
        double res;
        try {
            if(num < num2) return "isM";
            if(num2 == 0) return "is0";
            
            res = num / num2;
            res = Math.round(res);
            return ""+res;
        } catch (Exception e) {
            return "Error al realizar la operación.";
        }
    }
    private static String multiplicacion(double num, double num2) {
        double res;
        try {
            res = num * num2;
            return ""+res;
        } catch (Exception e) {
            return "Error al realizar la operación.";
        }
    }
}
