package JUEGOS;

public class Coche {
    private String nombre;
    Reloj tiempoVuelta;

    public Coche(String nombre, int horas, int minutos, int segundos) {
        this.nombre = nombre;
        this.tiempoVuelta = new Reloj(horas, minutos, segundos);
    }

    @Override
    public String toString() {
        return "Coche: " + nombre + ", Tiempo de vuelta: " + tiempoVuelta.toString();
    }
}

