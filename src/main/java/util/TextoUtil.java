package util;

import java.util.List;

public class TextoUtil {

    private TextoUtil() {
    }

    // Método ideal para conflicto: un alumno lo modifica y otro lo elimina.
    public static String normalizarNombre(String texto) {
        if (texto == null) {
            return "";
        }
        return texto.trim().toUpperCase();
    }

    public static String formatearTitulo(String texto) {
        if (texto == null || texto.isBlank()) {
            return "SIN_TITULO";
        }
        String limpio = texto.trim();
        return limpio.substring(0, 1).toUpperCase() + limpio.substring(1).toLowerCase();
    }

    public static String unirTitulos(List<Tarea> tareas) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < tareas.size(); i++) {
            builder.append(formatearTitulo(tareas.get(i).getTitulo()));
            if (i < tareas.size() - 1) {
                builder.append(", ");
            }
        }
        return builder.toString();
    }
}
