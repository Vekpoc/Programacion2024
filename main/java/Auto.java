/**
 *
 * @author gerar
 */
public class Auto {
    private static int naftaMax = 100;
    private static int tanque = 0;
    private static Boolean estado = false;
    private static int cambios = 0;
    private static Boolean retro = false;
    private static Boolean radioE = false;
    
    public static void main(String[] args) {
        System.out.println(apagar());
        System.out.println(cargarNafta(50));
        System.out.println(cambio(1, "r"));
        System.out.println(avanzar());
        System.out.println(radio());
        System.out.println(retroceder());
        System.out.println(apagar());
    }
    private static String encender() {
        if(estado) {
            return "El auto ya está encendido.";
        } else {
            return "Auto encendido.";
        }
    }
    private static String apagar() {
        if(estado == false) {
            return "El auto ya está apagado.";
        } else {
            return "Auto apagado.";
        }
    }
    private static String cargarNafta(Integer valor) {
        if(valor > naftaMax) {
            return "El valor ingresado es mayor a la capacidad del tanque.";
        } else {
            tanque += valor;
            return "Tanque cargado al " + tanque+"%";
        }
    }
    private static String cambio(Integer num, String retroceso) {
        if(cambios == num) {
            return num + "ya está en ese cambio.";
        } else if(retroceso.equals("r")) {
            retro = true;
            return "Cambio en R.";
        } else {
            retro = false;
            return "Cambio establecido: " + num;
        }
    }
    private static String avanzar() {
        if(cambios == 0) {
            return "Debes de poner en cambio el auto para avanzar.";
        } else {
            return "Auto avanzando.";
        }
    }
    private static String retroceder() {
        if(retro) {
            return "Auto retrocediendo.";
        } else {
            return "Debes poner en reversa para retroceder.";
        }
    }
    private static String radio() {
        if(radioE) {
            return "La radio ya está encendida.";
        } else {
            return "Radio encendida.";
        }
    }
}
