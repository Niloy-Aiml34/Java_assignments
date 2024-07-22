class generic<T>{
    T t1;

    public generic(T t1) {
        this.t1 = t1;
    }
    public void display(){
        System.out.println("T="+t1);
    }

}

public class genericMethod {
    public static void main(String[] args) {
        generic<Integer> n = new generic<>(10);
        generic<String> n1 = new generic<>("Hola Amigo");
        generic<Double> n2 = new generic<>(10.5);
        n.display();
        n1.display();
        n2.display();
    }
}
