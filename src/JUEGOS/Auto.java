package JUEGOS;

public class Auto{
    Reloj reloj=new Reloj();
    String nombre;
    Reloj tiempoVuelta;

    public Auto(String nombre, Reloj tiempoVuelta){
        this.nombre=nombre;
        this.tiempoVuelta=tiempoVuelta;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
