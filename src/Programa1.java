import java.io.*;

public class Programa1 {

    public static void main(String[] args) {

        //Origen siempre tiene que existir
        File origen = new File(System.getProperty("user.dir") + "\\programa1\\archivo.txt");

        //Puede no existir
        File destino = new File(System.getProperty("user.dir") + "\\programa1\\copia.txt");

        //Try con recursos. Los inicilizas y cuando acabas de utilizarlos los cierra con .close()
        try (InputStream is = new FileInputStream(origen);
             OutputStream os = new FileOutputStream(destino)) {
            //Creamos buffer de 1024 posiciones
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
