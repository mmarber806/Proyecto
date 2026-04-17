package service;

import model.Tarea;
import util.TextoUtil;

import java.util.ArrayList;
import java.util.List;

public class GestorTareas {
    private final List<Tarea> tareas = new ArrayList<>();

    public void cargarEjemplo() {
        tareas.add(new Tarea(1, "Crear repositorio", "HECHA", "ALTA", "Marta"));
        tareas.add(new Tarea(2, "Invitar colaboradores", "HECHA", "MEDIA", "Marta"));
        tareas.add(new Tarea(3, "Crear ramas", "EN_PROCESO", "ALTA", "Javier"));
        tareas.add(new Tarea(4, "Resolver conflicto", "PENDIENTE", "ALTA", "Lucía"));
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public List<Tarea> getTareas() {
        return tareas;
    }

    public List<Tarea> buscarPorResponsable(String responsable) {
        List<Tarea> resultado = new ArrayList<>();
        for (Tarea tarea : tareas) {
            if (tarea.getResponsable().equalsIgnoreCase(responsable)) {
                resultado.add(tarea);
            }
        }
        return resultado;
    }

    public int contarPendientes() {
        int contador = 0;
        for (Tarea tarea : tareas) {
            if (!tarea.esCompletada()) {
                contador++;
            }
        }
        return contador;
    }

    // Método ideal para provocar conflicto: varios alumnos editarán este texto a la vez.
    public String resumenProyecto() {
        StringBuilder builder = new StringBuilder();
        builder.append("Total tareas: ").append(tareas.size()).append("\n");
        builder.append("Pendientes: ").append(contarPendientes()).append("\n");
        builder.append("Títulos: ").append(TextoUtil.unirTitulos(tareas)).append("\n");
        return builder.toString();
    }

    // Método ideal para conflicto de eliminar vs modificar.
    public boolean eliminarTareaPorId(int id) {

        return false;
    }
}
