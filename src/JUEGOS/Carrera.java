package JUEGOS;



public class Carrera  {
    private static final int MAX_COCHES = 10;

    private Coche[] coches;
    private Reloj tiempoInicio;
    private boolean enCurso;

    public Carrera(Reloj tiempoInicio) {
        this.tiempoInicio = tiempoInicio;
        this.coches = new Coche[MAX_COCHES];
        this.enCurso = false;
    }

    public void agregarCoche(Coche coche) {
        if (!enCurso) {
            for (int i = 0; i < coches.length; i++) {
                if (coches[i] == null) {
                    coches[i] = coche;
                    return;
                }
            }
            System.out.println("No hay espacio para más coches.");
        } else {
            System.out.println("La carrera ya ha comenzado, no se pueden agregar más coches.");
        }
    }

    public void comenzarCarrera() {
        if (!enCurso) {
            enCurso = true;
            System.out.println("La carrera ha comenzado.");
        } else {
            System.out.println("La carrera ya está en curso.");
        }
    }

    public void registrarTiempoVuelta(Coche coche, int horas, int minutos, int segundos) {
        if (enCurso) {
            coche.tiempoVuelta.sumarSegundos(horas * 3600 + minutos * 60 + segundos);
        } else {
            System.out.println("La carrera no está en curso.");
        }
    }

    public void finalizarCarrera() {
        if (enCurso) {
            enCurso = false;
            System.out.println("La carrera ha finalizado.");
            generarClasificacion();
        } else {
            System.out.println("La carrera aún no ha comenzado.");
        }
    }

    private void generarClasificacion() {
        System.out.println("Clasificación final:");
        for (int i = 0; i < coches.length; i++) {
            if (coches[i] != null) {
                System.out.println((i + 1) + ". " + coches[i]);
            }
        }
    }
}

