//Este el paquete donde su ubica la clase RelojConcurrente.
package autonoma.reloj.main;
//Importamos la clase Tiempo para poder usar los hilos correctamente.
import autonoma.reloj.models.Tiempo;
/**
 * Clase encargada de crear una instancia de la clase Tiempo y de usar hilos para poder representar el reloj.
 * 
 * @author      Cristian Camilo Salazar Arenas
 * @version     1.0
 * @since       2025.05.04 
 */
public class RelojConcurrente {
    //Clase principal que contiene el método main
    public static void main(String[] args) {
        //Se crea una instancia de la clase Tiempo llamada 'tiempo'
        Tiempo tiempo = new Tiempo();
        //Creamos una instancia de la clase Hilo que se encargará
        //de manejar los segundos usando una expresión lambda
        Thread segundos = new Thread(() -> {
            //Creamos un bucle infinito para que el reloj nunca pare
            //de funcionar hasta que cerremos el programa
            while (true) {
                try {
                    //Pausa el hilo cada segundo
                    Thread.sleep(1000);//Estos son 1000 milisegundos
                    //Llama a un método de la clase Tiempo para incrementar los segundos
                    tiempo.incrementarSegundos();
                    //Llama a otro método de la clase Tiempo para mostrar el tiempo actual
                    tiempo.mostrar();
                    //Maneja posibles interrupciones del hilo
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        //Creamos otra instancia de la clase Hilo que se encargará
        //de manejar los minutos usando una expresión lambda
        Thread minutos = new Thread(() -> {
            //Creamos otro bucle infinito para que el reloj nunca pare
            //de funcionar hasta que cerremos el programa
            while (true) {
                try {
                    //Pausa el hilo cada '60' segundos
                    Thread.sleep(60000);
                    //Llama a un método de la clase Tiempo para incrementar los minutos
                    tiempo.incrementarMinutos();
                //Maneja posibles interrupciones del hilo
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        //Creamos otra instancia de la clase Hilo que se encargará
        //de manejar las horas usando una expresión lambda
        Thread horas = new Thread(() -> {
            //Creamos otro bucle infinito para que el reloj nunca pare
            //de funcionar hasta que cerremos el programa
            while (true) {
                try {
                    //Pausa el hilo cada 3600 segundos
                    Thread.sleep(3600000); //Estos son milisegundos
                    //Llama a un método de la clase Tiempo para incrementar las horas
                    tiempo.incrementarHoras();
                    //Maneja posibles interrupciones del hilo
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        //Aquí inicializamos el hilo 'segundos' =P
        segundos.start();
        //Aquí inicializamos el hilo 'minutos'
        minutos.start();
        //Por último inicializamos el hilo 'horas'
        horas.start();
    }
}
