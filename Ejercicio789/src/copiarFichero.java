//Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros:
// "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado en el parámetro
// "fileIn" al fichero dado en "fileOut".

import java.io.*;
import java.util.Scanner;

public class copiarFichero {
    public static void main(String[] args) throws IOException {
        Fichero origen = new Fichero("origen.txt");
        Fichero destino = new Fichero ("destino.txt");
        InputStream in = new FileInputStream(origen);
        OutputStream out = new FileOutputStream(destino);
try {
        byte[] buf = new byte[1024];
        int len;

        while ((len = in.read(buf)) > 0) {
            out.write(buf, 0, len);
        }
        }catch (Exception e){
    in.close();
    out.close();
        }


    }
}




