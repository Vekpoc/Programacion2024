
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gerar
 */
public class Persona {
    private static String persona = "Perez";
    private static double peso = 53;
    private static double ahorros = 0;

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Introduce el nombre de la persona: ");
        persona = reader.nextLine();
        System.out.println("Introduce el peso de la persona: ");
        peso = reader.nextDouble();
        
        System.out.println(caminar("arriba"));
        System.out.println(hablar("Juan", "Hola, cómo estás?"));
        System.out.println(comer(0.40));
        System.out.println(ejercitar());
        System.out.println(trabajar(2, 100));
    }
    private static String caminar(String direccion) {
        return persona + " está caminando en la dirección: " + direccion;
    }
    private static String hablar(String receptor, String mensaje) {
        return persona+" le ha dicho a " + receptor+": " + mensaje; 
    }
    private static String comer(double pesoComida) {
        peso += pesoComida / 2;
        return persona + " ha comido y su peso aumento a: " + peso;
    }
    private static String ejercitar() {
        double pesoAntes = peso;
        peso -= peso * 0.005;
        
        if(peso < (pesoAntes / 2)) {
            return persona + " ha bajado hasta el 50% de su peso original.";
        }
        return persona + " hizo ejercicio y su peso quedo en " + Math.round(peso) +" kg.";
    }
    private static String trabajar(int horasTrabajadas, double precioHora) {
        ahorros = horasTrabajadas * precioHora;
        String hora = "hora";
        if(horasTrabajadas > 1) hora = "horas";
        return persona +" trabajo " + horasTrabajadas + " " + hora + " y gana $"+ahorros;
    }
}
