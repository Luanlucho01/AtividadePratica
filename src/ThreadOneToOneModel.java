public class ThreadOneToOneModel {
    public static void main (String[] args) {
        long inicio = System.currentTimeMillis();

        int numThreads = 10;
        int tempoTrabalho = 100;

        Thread[] threads = new Thread[numThreads];

        for (int i = 0; i < numThreads; i ++) {
            final int threadId = i + 1;
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 5; j++) {
                    System.out.println("Thread " + threadId + " executando passo " + j);
                    try {
                        Thread.sleep(tempoTrabalho);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            threads[i].start();
        }

        for (int i = 0; i < threads.length ; i++) {
            try  {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long fim =  System.currentTimeMillis();

        long duracao = fim - inicio;
        System.out.println("Tempo total de execução: " + duracao + " ms");
    }
}


