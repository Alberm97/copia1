import java.io.*;

public class Programa2 {
    public static void main(String[] args) {
        File origen = new File(System.getProperty("user.dir") + "\\programa2\\archivo.txt");
        File destino = new File(System.getProperty("user.dir") + "\\programa2\\copia.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(destino));
             BufferedReader reader = new BufferedReader(new FileReader(origen))) {
            String str;
            while ((str = reader.readLine()) != null) {
                writer.write(str+"\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
