package javathreads;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;

public class ExecutiveServiceDemo {

    public static void main(String[] args) {
        int coreCount = Runtime.getRuntime().availableProcessors();
        System.out.println("No of cores = "+coreCount);

        Supplier<Integer> orderNo = ()-> new Random().nextInt();

        for(int i=0;i<10;i++){

        //1 order 2 payment 3 fulfilment 4. shipping 5. email
        CompletableFuture.supplyAsync(()-> new Random().nextInt(30000))
                       .thenApply(a-> {
                            System.out.println("Apply"+Thread.currentThread().getName()); return a*a;})

                        .thenApply(a-> {
                            System.out.println("Apply "+Thread.currentThread().getName()); return a+a;})
                    .thenAccept(a-> System.out.println("Accept "+Thread.currentThread().getName()+"a="+a));

        }
        Thread t = new Thread();

        System.out.println("Thread-"+Thread.currentThread().getName());
    }

}

class Order implements   Runnable{

    @Override
    public void run() {
        System.out.println("Thread-"+Thread.currentThread().getName());
    }
}




