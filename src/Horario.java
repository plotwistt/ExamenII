import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Horario {
    public static void mtPresentarArchivos(String archivo) {
    String linea = "";
    String separador = ";"; // Carácter separador de campos en el archivo CSV
    
    System.out.println();
    try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
        while ((linea = br.readLine()) != null) {
            String[] datos = linea.split(separador);
            // Aquí puedes procesar los datos como desees
            // Por ejemplo, imprimir cada campo en la consola
            for (String dato : datos) {
                System.out.print(dato + " ");
            }
            System.out.println(); // Imprimir nueva línea después de cada fila
        }
        System.out.println();
    } catch (IOException e) {
        e.printStackTrace();
    }
    } 
}
