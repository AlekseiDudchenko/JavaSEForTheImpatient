package ch3.ex10;

/**
 * Implement methods
 * public static void runTogether(Runnable... tasks)
 * public static void runInOrder(Runnable... tasks)
 * The first method should run each task in a separate thread and then return.
 * The second method should run all methods in the current thread
 * and return when the last one has completed.
 */

public class ex10 {

    public static void main(String[] args) {
        Task firstTask = new Task("Task 1");
        Task secondTask = new Task("Task 2");
        Task thirdTask = new Task("Task 3");
        runTogether(firstTask, secondTask, thirdTask);
        runInOrder(firstTask, secondTask, thirdTask);
    }

    static class Task implements Runnable {
        String name;
        Task(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                System.out.println("Run " + name + " " + i);
            }
        }
    }

    private static void runTogether(Runnable... tasks) {
        for (Runnable task: tasks) {
            new Thread(task).start();
        }
    }

    private static void runInOrder(Runnable... tasks) {
        for (Runnable task: tasks) {
            task.run();
        }
    }
}
