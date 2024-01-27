package JUEGOS;

public class Main {
    public static void main(String[] args) {
        // Crear varios coches con tiempos de vuelta diferentes
        Coche coche1 = new Coche(" Audi", 0, 1, 30);
        Coche coche2 = new Coche("Renault", 0, 1, 45);
        Coche coche3 = new Coche("Ford Focus", 0, 2, 15);
        Coche coche4 = new Coche("Citroen", 0, 2, 15);
        Coche coche5 = new Coche("Clio", 0, 2, 15);
        Coche coche6 = new Coche("Toyota", 0, 2, 15);

        // Crear una carrera y agregar los coches
        Reloj tiempoInicio = new Reloj(12, 0, 0); // Hora de inicio de la carrera
        Carrera carrera = new Carrera(tiempoInicio);
        carrera.agregarCoche(coche1);
        carrera.agregarCoche(coche2);
        carrera.agregarCoche(coche3);
        carrera.agregarCoche(coche4);
        carrera.agregarCoche(coche5);
        carrera.agregarCoche(coche6);

        // Comenzar la carrera
        carrera.comenzarCarrera();

        // Simular tiempos de vuelta durante la carrera
        carrera.registrarTiempoVuelta(coche1, 0, 0, 55);
        carrera.registrarTiempoVuelta(coche2, 0, 1, 0);
        carrera.registrarTiempoVuelta(coche3, 0, 2, 10);
        carrera.registrarTiempoVuelta(coche4, 0, 2, 10);
        carrera.registrarTiempoVuelta(coche5, 0, 2, 10);
        carrera.registrarTiempoVuelta(coche6, 0, 2, 10);
        carrera.registrarTiempoVuelta(coche1, 0, 0, 50);
        carrera.registrarTiempoVuelta(coche2, 0, 0, 58);
        carrera.registrarTiempoVuelta(coche3, 0, 2, 5);
        carrera.registrarTiempoVuelta(coche4, 0, 2, 5);
        carrera.registrarTiempoVuelta(coche5, 0, 2, 5);
        carrera.registrarTiempoVuelta(coche6, 0, 2, 5);

        // Finalizar la carrera y mostrar la clasificación final
        carrera.finalizarCarrera();
    }
}

