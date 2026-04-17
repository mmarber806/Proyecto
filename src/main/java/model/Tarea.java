package model;

public class Tarea {
    private int id;
    private String titulo;
    private String estado;
    private String prioridad;
    private String responsable;

    public Tarea(int id, String titulo, String estado, String prioridad, String responsable) {
        this.id = id;
        this.titulo = titulo;
        this.estado = estado;
        this.prioridad = prioridad;
        this.responsable = responsable;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEstado() {
        //LVelez
        System.out.println("Manuel Morales");
        return estado;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean esCompletada() {
        return "HECHA".equalsIgnoreCase(estado);
    }

    @Override
    public String toString() {
        return id + " - " + titulo + " (" + estado + ", " + prioridad + ", " + responsable + ")";
    }

    public void llamarPolicia(){

    }
}

//comentario de marco

//otro  comentario del commit