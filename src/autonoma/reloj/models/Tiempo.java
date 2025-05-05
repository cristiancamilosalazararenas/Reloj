package autonoma.reloj.models;

public class Tiempo {

    private int horas = 0;
    private int minutos = 0;
    private int segundos = 0;

    public synchronized void incrementarSegundos() {
        segundos++;
        if (segundos >= 60) {
            segundos = 0;
        }
    }

    public synchronized void incrementarMinutos() {
        minutos++;
        if (minutos >= 60) {
            minutos = 0;
        }
    }

    public synchronized void incrementarHoras() {
        horas++;
        if (horas >= 24) {
            horas = 0;
        }
    }

    public synchronized void mostrar() {
        System.out.printf("Hora actual: %02d:%02d:%02d%n", horas, minutos, segundos);
    }
}
