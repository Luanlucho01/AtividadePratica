import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MNThreadModel {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();

        int numThreadsSistema = 4;
        int numThreadsUsuario = 10;
        int tempoTrabalho = 100;

        ExecutorService pool = Executors.newFixedThreadPool(numThreadsSistema);

        for (int i = 1; i <= numThreadsUsuario; i++) {
            final int threadUsuarioId = i;
            pool.execute(() -> {
                System.out.println("Executando thread de usuário " + threadUsuarioId + " em thread de sistema " + Thread.currentThread().getId());
                try {
                    Thread.sleep(tempoTrabalho);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        pool.shutdown();
        try {
            pool.awaitTermination(1, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long fim = System.currentTimeMillis();
        System.out.println("Tempo total de execução: " + (fim - inicio) + " ms");
    }
}





















