import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FiltroCSV {
    public static void main(String[] args) {
        String archivoCSV = "personajes.csv"; // Reemplaza con el nombre de tu archivo CSV
        String linea;
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(archivoCSV));

            while ((linea = br.readLine()) != null) {
                // Procesa cada línea del archivo CSV
                String[] datos = linea.split(",");
                String pregunta = datos[0];
                String respuesta = datos[1];

                // Realiza una pregunta al usuario
                System.out.println(pregunta);
                System.out.print("¿Sí o No? ");

                // Lógica para responder con Sí o No
                // Aquí puedes implementar tu lógica de juego para determinar si la respuesta es correcta
                // Por ejemplo, si la respuesta es "Sí" y el usuario responde "Sí", continúa con la siguiente pregunta, o si responde "No", plantea otra pregunta relacionada.

                // Puedes personalizar esta lógica según tus necesidades.

                // En este ejemplo, simplemente comprobamos si la respuesta es "Sí" para continuar o "No" para detener el juego.
                if (respuesta.equalsIgnoreCase("Sí")) {
                    System.out.println("Continuemos...");
                } else if (respuesta.equalsIgnoreCase("No")) {
                    System.out.println("Fin del juego.");
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}