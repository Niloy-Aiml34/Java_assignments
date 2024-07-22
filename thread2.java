public class thread2 {
    public static void main(String[] args) {
        Runnable t1 = new Runnable() {
            public void run(){
                System.out.println("Executed");
            }
        };
        Thread t2 = new Thread(t1);
        t2.start();
        try{
            t2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        try{
            t2.start();
        }catch(IllegalThreadStateException e){
            System.out.println("Exception: "+e);
        }
        
    }
}
