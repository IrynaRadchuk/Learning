package Lessons.lesson11;

public class ThreadExample {
    static int counter = 0;
    static int[] values = new int[6];

    static void execute(int size) {
        int sum = 0;
        String name = Thread.currentThread().getName();
        System.out.println(name);
        System.out.println(name + " priorty = " + Thread.currentThread().getPriority());
        for (int i = 0; i < size; i++) {
            System.out.println(name + " " + "[" + i + "]");
            sum += i;
        }
        System.out.println(name + " falls asleep");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " awaken");
        values[counter] = sum;
        System.out.println("local sum = " + sum);
    }

    public static void main(String[] args) {
        //Thread [] threads = new Thread[6];
        //------------------variant1
        Runnable task = new Runnable() {
            @Override
            public void run() {
                execute(5);
            }
        };
        //------------------variant2
        new Thread(new Runnable() {
            @Override
            public void run() {
                execute(7);
            }
        }).start();
        //------------------variant3
        Runnable task2 = () -> {
            execute(8);
        };
        new Thread(task2).start();
        //------------------variant4
        new Thread(() -> {
            execute(3);
        }).start();
        Thread thread = new Thread(task);
        thread.setPriority(8);
        thread.start();
        //new Thread(task).start();
        execute(4);
        task.run(); //пример, как меин выполняется в один поток
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        System.out.println("total sum = " + sum);
        System.out.println("End");
    }
}
