package service;

import model.Tarea;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EstadisticasService {

    public double porcentajeCompletadas(List<Tarea> tareas) {
        if (tareas.isEmpty()) {
            return 0;
        }
        int hechas = 0;
        for (Tarea tarea : tareas) {
            if (tarea.esCompletada()) {
                hechas++;
            }
        }//Comentario que no se que poner
        return (hechas * 100.0) / tareas.size();
    }

    public Map<String, Integer> resumenPorPrioridad(List<Tarea> tareas) {
        Map<String, Integer> resumen = new HashMap<>();
        for (Tarea tarea : tareas) {
            resumen.put(tarea.getPrioridad(), resumen.getOrDefault(tarea.getPrioridad(), 0) + 1);
        }
        return resumen;
    }

    // Método ideal para conflicto de edición simultánea.
    public String generarMensajeSeguimiento(List<Tarea> tareas) {
        double porcentaje = porcentajeCompletadas(tareas);
        if (porcentaje == 100) {
            return "Proyecto completado";
        }
        if (porcentaje >= 50) {
            return "Proyecto bien encaminado";
        }
        return "Proyecto necesita seguimiento";
    }
}
