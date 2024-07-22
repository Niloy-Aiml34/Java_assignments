interface dog{
    public void sample1();
}
interface cat{
    public void sample2();
}
public class dc implements dog,cat{
    public void sample1(){
        System.out.println("Wofoo");
    }
    public void  sample2(){
        System.out.println("Meow");
    }
    public static void main(String[] args) {
        dc x = new dc();
        x.sample1();
        x.sample2();
    }
    
}
