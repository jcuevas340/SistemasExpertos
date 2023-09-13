import java.util.HashMap;
import java.util.Scanner;
import java.io.*;
import java.util.Map;

public class ChatBot {

    private HashMap<String, String> baseDeDatos;

    public ChatBot() {
        baseDeDatos = new HashMap<>();
        cargarDatos(baseDeDatos);
    }

    public void iniciarChat() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "Hola, soy un Chatbot. Puedes preguntarme cualquier cosa. Escribe 'Salir' para terminar el chat.");

        String preguntaNueva = "No sé la respuesta. ¿Qué te gustaría enseñarme?";

        while (true) {
            System.out.println("Tu: ");
            String pregunta = scanner.nextLine();

            if (baseDeDatos.containsKey(pregunta)) {
                String respuesta = baseDeDatos.get(pregunta);
            } else {
                System.out.println("Chatbot: Lo siento, no se la respuesta. Cual es la respuesta adecuada?");
                System.out.println("Tu (para ensenarme): ");
                String respuestaNueva = scanner.nextLine();
                baseDeDatos.put(pregunta, respuestaNueva);
                guardarDatos(baseDeDatos);
                System.out.println("Chatbot: Gracias por ensenarme.");
            }
        }
    }

    private static void guardarDatos(Map<String, String> baseDeDatos) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("base_datos.txt"))) {
            for (Map.Entry<String, String> entry : baseDeDatos.entrySet()) {
                writer.write(entry.getKey() + " - " + entry.getValue());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void cargarDatos(Map<String, String> baseDeDatos) {
        try (BufferedReader reader = new BufferedReader(new FileReader("base_datos.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(" - ");
                if (partes.length == 2) {
                    baseDeDatos.put(partes[0], partes[1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ChatBot chatBot = new ChatBot();
        chatBot.iniciarChat();
    }
}
