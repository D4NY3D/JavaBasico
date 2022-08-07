package poo.ejerciciocuatro;

/**
 * En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
 *
 * Agregaréis atributos tal cual tendrían esos objetos en la realidad.
 *
 * Crear constructor vacío y con todos los parámetros para cada clase.
 *
 * Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola
 */
public class Main {
    public static void main(String[] args) {
        SmartDevice oneplus = new SmartDevice();

        SmartWatch xiaomiwatch = new SmartWatch("xiaomi", "negro", 6.6, "android");
        System.out.println(xiaomiwatch.marca);
        System.out.println(xiaomiwatch.color);
        System.out.println(xiaomiwatch.tamaPantalla);
        System.out.println(xiaomiwatch.sistemaOperativo);

        SmartPhone oneplusnord = new SmartPhone(6.6, 55, 90, 8, 128, 4000);
        System.out.println(oneplusnord.memoRam);
        System.out.println(oneplusnord.pantalla);
        System.out.println(oneplusnord.dimension);
        System.out.println(oneplusnord.peso);
        System.out.println(oneplusnord.almacenamiento);
        System.out.println(oneplusnord.bateria);

        SmartDevice usbinteligent = new SmartDevice("GALOOK", "adaptador inteligente", false, "no disponible");
        System.out.println(usbinteligent.modelo);
        System.out.println(usbinteligent.estilo);
        System.out.println(usbinteligent.bluetho);
        System.out.println(usbinteligent.sistemaOperativo);






    }
}
