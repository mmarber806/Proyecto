package ud4.proyecto;

import ud4.proyecto.model.Tarea;
import ud4.proyecto.service.EstadisticasService;
import ud4.proyecto.service.GestorTareas;

public class App {
    public static void main(String[] args) {
        GestorTareas gestor = new GestorTareas();
        gestor.cargarEjemplo();

        gestor.agregarTarea(new Tarea(5, "Preparar tablero Trello", "PENDIENTE", "ALTA", "Ana"));
        gestor.agregarTarea(new Tarea(6, "Generar JavaDoc", "EN_PROCESO", "MEDIA", "Luis"));

        System.out.println("=== RESUMEN DEL PROYECTO ===");
        System.out.println(gestor.resumenProyecto());

        EstadisticasService estadisticas = new EstadisticasService();
        System.out.println("Porcentaje completadas: " + estadisticas.porcentajeCompletadas(gestor.getTareas()) + "%");
        System.out.println(estadisticas.generarMensajeSeguimiento(gestor.getTareas()));
    }
}
