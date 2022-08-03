package com.despinosa;
// Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio
// con el IVA incluido.

public class ejercicioDos {
    public static void main(String[] args) {
         double precioProducto = getPrecio(80); // precio
         long ivaProducto = getIva(4); // iva
         double totalPrecio = precioProducto * ivaProducto / 100; // calculo de iva 16.80
         double ivaIncluido = totalPrecio + precioProducto; // iva incluido en el precio
        System.out.println("El precio del producto es: " + precioProducto);
        System.out.println("El iva del producto es: " + ivaProducto);
        System.out.println("El iva del " + ivaProducto + " %" + " sobre el precio es de " + precioProducto * ivaProducto / 100 + " Euros");
        System.out.println( "Suma total con Iva incluido es " + ivaIncluido);
    }
    static double getPrecio(double precio) {

        return precio;
    }
    static long getIva(long iva){
        
        return iva;
    }


}
