package ThreadPool;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class VowelThread {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

//        ExecutorService executor = Executors.newSingleThreadExecutor();
    	ExecutorService executorService=Executors.newFixedThreadPool(6);
        
        List<Future<Integer>> futures = new ArrayList<>();
        Future<Integer> r1 = executorService.submit(new CountTask("bse 7b"));
        Future<Integer> r4 = executorService.submit(new CountTask("civic"));
        Future<Integer> r5 = executorService.submit(new CountTask("rotor"));
        Future<Integer> r2 = executorService.submit(new CountTask("Topspot"));
        Future<Integer> r3 = executorService.submit(new CountTask("al 232 la"));
        Future<Integer> r6 = executorService.submit(new CountTask("step on no pets"));
        	futures.add(r1);
        	futures.add(r2);
        	futures.add(r3);
        	futures.add(r4);
        	futures.add(r5);
        	futures.add(r6);
        int total = 0;
        for(Future<Integer> task: futures)
        for (int i=0;i<6;i++) {
            total=task.get();
            System.out.println("Number of vowels: "+ total);
        }
    }
}
