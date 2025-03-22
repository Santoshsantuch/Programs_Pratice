package javaconcepts.learning;

class Task1 extends Thread{
        public void run(){ /// SIGNATURE
        for(int i=101;i<=199;i++) {
            System.out.print(i + " ");
        }
            System.out.print("\nTask1 Done");
        }
}

class Task2 implements Runnable{

    @Override
    public void run() {
        for(int i=201;i<=299;i++) {
            System.out.print(i + " ");
        }
        System.out.print("\nTask2 Done");
    }
}

public class ThreadBasics {
    public static void main(String[] args) throws InterruptedException {
        System.out.print("\nTask1 kicked in");
        /// Task1
       Task1 task1=new Task1();
       task1.setPriority(10); /// setting a priority it is a request it either executes or not
       task1.start();


        System.out.print("\nTask2 kicked in ");
        /// Task2
        Task2 task2= new Task2();
        Thread threadTask2=new Thread(task2);
        threadTask2.setPriority(6);
        threadTask2.start();

        task1.join();
        threadTask2.join();


        System.out.print("\nTask3 kicked in");
        /// Task3
        for(int i=301;i<=399;i++){
            System.out.print(i+" ");
        }
        System.out.print("\nTask3 Done");

        System.out.print("\nMain done");
    }
}
