public class multithreading {
    static class numberprinter implements Runnable {
        private final String threadname;
        public numberprinter(String name){
            this.threadname=name;
        }
        @Override
        public void run(){
            for(int i=1;i<11;i++){
                System.out.println(threadname+": "+i);
            }
        }
    } 
    public static void main(String[] args) {
        Thread t1 = new Thread(new numberprinter("Thread 1"));
        Thread t2 = new Thread(new numberprinter("Thread 2"));
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("t1 and t2 have finished execution. Main thread proceeds.");
        
    }
}
