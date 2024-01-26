package JUEGOS;

public class Reloj {
    int horas;
    int minutos;
    int segundos;
    boolean modificarHora;

    public Reloj(){
        super();
        this.horas=0;
        this.minutos=0;
        this.segundos=0;
    }

    public Reloj(int horas, int minutos, int segundos) {
        if (validarHora(horas, minutos, segundos)) {
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
        }else{
            System.out.println("se pondra el reloj de nuevo a 00:00:00");
            this.horas=0;
            this.minutos=0;
            this.segundos=0;
        }
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public boolean modificarHora(int horas, int minutos, int segundos) {
        if (validarHora(horas, minutos, segundos)) {
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
            return true;
        } else {
            System.out.println("Hora incorrecta. No se ha modificado.");
            return false;
        }
    }
    public void sumarSegundo(){
        segundos++;
        ajustarHora();
    }
    public void sumarSegundos(int segundos){
        this.segundos+=segundos;
        ajustarHora();
    }
    private void ajustarHora(){
        if(segundos>=60){
            segundos-=60;
            minutos++;
        }
        if (minutos>=60){
            minutos-=60;
            horas++;
        }
        if (horas>=24){
            horas=0;
        }
    }

    private boolean validarHora(int horas, int minutos, int segundos) {
        return (horas >= 0 && horas <= 23) && (minutos >= 0 && minutos <= 59)
                && (segundos >= 0 && segundos <= 59);
    }

    public String toString(){
        return String.format("%02d:%02d:%02d", horas, minutos,segundos);
    }
}


