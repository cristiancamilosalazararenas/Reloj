//Este es el paquete donde se ubica la clase Tiempo.
package autonoma.reloj.models;
/**
 * Clase encargada de aumentar los segundos, minutos y horas de un reloj.
 * Esta clase simula el paso del tiempo.
 * 
 * @author      Cristian Camilo Salazar Arenas
 * @version     1.0
 * @since       2025.05.04
 */
public class Tiempo {
    /**
     * Representa la cantidad de horas y se inicializa desde '0'.
     */
    private int horas = 0;
    /**
     * Representa la cantidad de minutos y se inicializa desde '0'.
     */
    private int minutos = 0;
    /**
     * Representa la cantidad de segundos y se inicializa desde '0'.
     */
    private int segundos = 0;
    /**
     * Método encargado de incrementar los segundos del reloj.
     * 
     * @since 2025.05.04
     */
    public void incrementarSegundos() {
        segundos++;
        if (segundos >= 60) {
            segundos = 0;
        }
    }
    /**
     * Método encargado de incrementar los minutos del reloj.
     * 
     * @since 2025.05.04
     */
    public void incrementarMinutos() {
        minutos++;
        if (minutos >= 60) {
            minutos = 0;
        }
    }
    /**
     * Método encargado de incrementar las horas del reloj.
     * 
     * @since 2025.05.04
     */
    public void incrementarHoras() {
        horas++;
        if (horas >= 24) {
            horas = 0;
        }
    }
    /**
     * Método encargado de mostrar las [Horas],[Minutos],[Segundos] del reloj.
     * 
     * @since 2025.05.04
     */
    public void mostrar() {
        System.out.printf("Hora actual: " + horas + ":" + minutos + ":" + segundos + "\n");
    }
}
