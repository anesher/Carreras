package JUEGOS;

public class Reloj {

        private int horas;
        private int minutos;
        private int segundos;

        public Reloj() {
            this.horas = 0;
            this.minutos = 0;
            this.segundos = 0;
        }

        public Reloj(int horas, int minutos, int segundos) {
            if (modificarHora(horas, minutos, segundos)) {
                this.horas = horas;
                this.minutos = minutos;
                this.segundos = segundos;
            } else {
                System.out.println("Hora no válida. Se ha inicializado el reloj a 00:00:00");
                this.horas = 0;
                this.minutos = 0;
                this.segundos = 0;
            }
        }

        public boolean modificarHora(int horas, int minutos, int segundos) {
            if (horas >= 0 && horas < 24 && minutos >= 0 && minutos < 60 && segundos >= 0 && segundos < 60) {
                this.horas = horas;
                this.minutos = minutos;
                this.segundos = segundos;
                return true;
            }
            return false;
        }

        public void sumarSegundo() {
            segundos++;
            if (segundos == 60) {
                segundos = 0;
                minutos++;
                if (minutos == 60) {
                    minutos = 0;
                    horas = (horas + 1) % 24;
                }
            }
        }

        public void sumarSegundos(int segundos) {
            int totalSegundos = this.segundos + segundos;
            this.segundos = totalSegundos % 60;
            int minutosExtra = totalSegundos / 60;
            sumarMinutos(minutosExtra);
        }

        private void sumarMinutos(int minutos) {
            int totalMinutos = this.minutos + minutos;
            this.minutos = totalMinutos % 60;
            int horasExtra = totalMinutos / 60;
            sumarHoras(horasExtra);
        }

        private void sumarHoras(int horas) {
            this.horas = (this.horas + horas) % 24;
        }

        @Override
        public String toString() {
            return String.format("%02d:%02d:%02d", horas, minutos, segundos);
        }
    }
