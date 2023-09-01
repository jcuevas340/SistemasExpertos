import java.util.HashMap;
import java.util.Scanner;

public class ChatBot {

    private HashMap<String, String> baseDeDatos;

    public ChatBot() {
        baseDeDatos = new HashMap<>();
        baseDeDatos.put("Hola", "Hola, como estas?");
        baseDeDatos.put("Como estas?", "Estoy bien, como te puedo ayudar?");
        baseDeDatos.put("De que te gustaria hablar?",
                "Podemos hablar sobre cualquier tema. Tienes alguna pregunta en mente");
    }

    public void iniciarChat() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "Hola, soy un Chatbot. Puedes preguntarme cualquier cosa. Escribe 'Salir' para terminar el chat.");

        while (true) {
            System.out.println("Tu: ");
            String pregunta = scanner.nextLine();

            if (pregunta.equalsIgnoreCase("Salir")) {
                System.out.println("Chatbot: Hasta luego!");
                break;
            }

            String respuesta = obtenerRespuesta(pregunta);
            if (respuesta != null) {
                System.out.println("Chatbot: " + respuesta);
            } else {
                System.out.println("Chatbot: Lo siento, no se la respuesta. Cual es la respuesta adecuada?");
                System.out.println("Tu (para ensenarme): ");
                String respuestaNueva = scanner.nextLine();
                agregarConocimiento(pregunta, respuestaNueva);
                System.out.println("Chatbot: Gracias por ensenarme.");
            }
        }
    }

    private String obtenerRespuesta(String pregunta) {
        return baseDeDatos.get(pregunta);
    }

    private void agregarConocimiento(String pregunta, String respuesta) {
        baseDeDatos.put(pregunta, respuesta);
    }

    public static void main(String[] args) {
        ChatBot chatBot = new ChatBot();
        chatBot.iniciarChat();
    }
}