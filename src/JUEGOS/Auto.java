package JUEGOS;

public class Auto{
    Reloj reloj=new Reloj();
    String nombre;
    Reloj tiempoVuelta;

    public Auto(){
        this.nombre=nombre;
        this.tiempoVuelta=tiempoVuelta;
    }

    @Override
    public String toString() {
        System.out.println(nombre);
        System.out.println(tiempoVuelta);
        return null;
    }
}
