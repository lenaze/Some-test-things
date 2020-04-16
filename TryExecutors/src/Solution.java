import java.util.concurrent.*;

public class Solution {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Callable<String> task = () -> Thread.currentThread().getName();
        //Make a fixed thread pool with a size 3
        ExecutorService service = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 6; i++) {
            //get the string with the name of current thread
            Future<String> result = service.submit(task);
            //with the help of get() got the result of task's work
            System.out.println(result.get());
        }
        //should to turn off the service
        service.shutdown();
    }
}
