package org.iesfm.multithreading;

public class Main {
    public static void main(String[] args) {
        Runnable holas = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    System.out.println("Hola");
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }

            }
        };

        Runnable adios = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    System.out.println("Adios");
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }

            }
        };
        Thread adiosthread = new Thread(adios);
        adiosthread.start();
        Thread holasthread = new Thread(holas);
        holasthread.start();




    }
}
