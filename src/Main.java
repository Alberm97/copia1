import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        //System.getProperty("user.dir") obtiene el directorio de trabajo actual
        // Como la ruta tiene barras invertidas tenemos que añadir elnombre del fichero con las barras invertidas tambien
        String rutaFicheroALeer = System.getProperty("user.dir") + "\\programa1\\archivo.txt";
        System.out.println(rutaFicheroALeer);
        try {
            //Podemos crearlo de varios modos:
            // Pasandole como argumento un string con la ruta del fichero
            File file =new File(rutaFicheroALeer);
            // Pasandole un file. EL file se crea asi File file = new File(StringRutaFichero)
            FileInputStream fileInputStream = new FileInputStream(file);
            // Reads the first byte
            int i = fileInputStream.read();
            // Cuando read llega al final del fichero devuelve -1
            while (i != -1) {
                System.out.print((char) i);
                // Reads next byte from the file
                i = fileInputStream.read();
            }
            fileInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}