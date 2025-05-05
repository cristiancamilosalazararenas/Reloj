package autonoma.reloj.main;

import autonoma.reloj.models.Tiempo;

public class RelojConcurrente {

    public static void main(String[] args) {
        Tiempo tiempo = new Tiempo();

        Thread segundos = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                    tiempo.incrementarSegundos();
                    tiempo.mostrar();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread minutos = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(60000);
                    tiempo.incrementarMinutos();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread horas = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(3600000);
                    tiempo.incrementarHoras();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        segundos.start();
        minutos.start();
        horas.start();
    }
}
