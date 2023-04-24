import java.io.*;

public class Programa3 {
    public static void main(String[] args) {
        //Crear archivo2.txt con el contenido de archivo.txt.  Usando FileReader/FileWriter
        File origen = new File(System.getProperty("user.dir") + "\\programa3\\archivo.txt");
        File destino = new File(System.getProperty("user.dir") + "\\programa3\\copia.txt");

        try (FileWriter writer = new FileWriter(destino);
             FileReader reader = new FileReader(origen)) {
            int len;
            while ((len = reader.read()) != -1) {
               writer.write(len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
