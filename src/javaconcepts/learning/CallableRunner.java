package javaconcepts.learning;

import java.util.concurrent.*;


class CallableTask implements Callable <String>{

    private String name;
    public CallableTask(String name){
        this.name=name;
    }
    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "Hello"+name;
    }
}

public class CallableRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService= Executors.newFixedThreadPool(1);
        Future<String> santhu =
                executorService.submit(new CallableTask("Santhu"));
        System.out.print("\n new CallableTask Santhu Executed");

        String welcomeMessage= santhu.get();
        System.out.print(welcomeMessage);

        System.out.print("\n Main Completed");
    }
}
