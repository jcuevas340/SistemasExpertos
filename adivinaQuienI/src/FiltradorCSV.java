import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FiltradorCSV {
    public static void main(String[] args) {
        // Lee el archivo CSV
        List<String[]> datos = leerArchivoCSV("personajes.csv");

        if (datos.isEmpty()) {
            System.out.println("No se encontraron datos en el archivo CSV.");
            return;
        }

        Scanner scanner = new Scanner(System.in);

        // Realiza preguntas hasta llegar a la respuesta correcta
        List<String[]> datosFiltrados = datos;
        boolean respuestaCorrecta = false;

        while (!respuestaCorrecta && !datosFiltrados.isEmpty()) {
            System.out.println("¿Deseas filtrar por alguna característica? (Sí/No)");
            String respuesta = scanner.nextLine();

            if (respuesta.equalsIgnoreCase("Sí")) {
                System.out.print("Por favor, ingresa la característica que estás buscando: ");
                String caracteristica = scanner.nextLine();

                datosFiltrados = filtrarPorCaracteristica(datosFiltrados, caracteristica);

                if (datosFiltrados.isEmpty()) {
                    System.out.println("No hay resultados que coincidan con esa característica.");
                } else {
                    System.out.println("Se encontraron los siguientes resultados:");
                    for (String[] fila : datosFiltrados) {
                        for (String dato : fila) {
                            System.out.print(dato + " ");
                        }
                        System.out.println();
                    }
                }

                System.out.println("¿Has encontrado la respuesta correcta? (Sí/No)");
                respuesta = scanner.nextLine();

                if (respuesta.equalsIgnoreCase("Sí")) {
                    respuestaCorrecta = true;
                    System.out.println("¡Excelente! Has encontrado la respuesta correcta.");
                }
            } else {
                respuestaCorrecta = true;
                System.out.println("No se realizarán más filtrados.");
            }
        }

        if (!respuestaCorrecta) {
            System.out.println("Se agotaron los datos disponibles. No se encontró la respuesta correcta.");
        }
    }

    // Lee un archivo CSV y devuelve una lista de filas
    public static List<String[]> leerArchivoCSV(String nombreArchivo) {
        List<String[]> datos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(",");
                datos.add(campos);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return datos;
    }

    // Filtra datos por una característica específica
    public static List<String[]> filtrarPorCaracteristica(List<String[]> datos, String caracteristica) {
        List<String[]> datosFiltrados = new ArrayList<>();

        for (String[] fila : datos) {
            for (String dato : fila) {
                if (dato.equalsIgnoreCase(caracteristica)) {
                    datosFiltrados.add(fila);
                    break;
                }
            }
        }

        return datosFiltrados;
    }
}
