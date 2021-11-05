import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);

        Thread t1 =new Thread(new Task1(semaphore));
        Thread t2 =new Thread(new Task2(semaphore));
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t1.start();
        t2.start();

        // Se hace para que el mensaje del main salga al despues de los hilos creados
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e ){
            e.printStackTrace();
        }

        System.out.println("Main terminado");
    }
}