public class BossWorkerExample {

    public static void main(String[] args) {
        // The boss method starts the process
        BossWorkerExample.bossMethod();
    }

    // Boss Method: This method calls other worker methods
    public static void bossMethod() {
        System.out.println("Boss method starts the task.");
        
        // Boss delegates tasks to worker methods
        worker1();
        
        System.out.println("Boss method completes the task.");
    }

    // Worker1 method: The first level of workers
    public static void worker1() {
        System.out.println("Worker1 starts its task.");
        
        // Worker1 delegates task to another worker
        worker4();
        worker5();
        
        System.out.println("Worker1 completes its task.");
    }

    // Worker4 method: A worker called by Worker1
    public static void worker4() {
        System.out.println("Worker4 starts its task.");
        // Task performed by Worker4
        System.out.println("Worker4 completes its task.");
    }

    // Worker5 method: Another worker called by Worker1
    public static void worker5() {
        System.out.println("Worker5 starts its task.");
        // Task performed by Worker5
        System.out.println("Worker5 completes its task.");
    }
}
